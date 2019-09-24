import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CartFrame extends JFrame {
   private JButton generateBill,orderFinal;
    private JTextField bill;
    private JTextArea Address;
    // JTextArea Address;
    private JLabel Bill;
    private JPanel p1,p2,p3;


    CartFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        generateBill = new JButton("Generate Bill");
        orderFinal = new JButton("Place Order");
        bill = new JTextField(10);
        Address = new JTextArea(20,20);
        Bill = new JLabel("Total Bill");
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(new FlowLayout());
        p1.add(Bill);
        p1.add(bill);
        p1.add(generateBill);
        p2.add(Address);
        p3.add(orderFinal);
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
        Listener8 a = new Listener8();
        generateBill.addActionListener(a);
        orderFinal.addActionListener(a);
    }

    class Listener8 implements ActionListener{
        Customer c;
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("Generate Bill")){
                c = LoginFrame.getC1();
                double a = c.getCart().Total();
                String billc = Double.toString(a);
                bill.setText(billc);
                Address da = c.getAddress();
                Address.setText(da.getArea()+ "\n" + da.getHouseNo()+ "\n" +da.getStreet()+ "\n" + da.getCity() + "\n" + da.getCityCode());
            }
            else if (e.getActionCommand().equalsIgnoreCase("Place Order")){
                JOptionPane.showMessageDialog(new JFrame(),"OrderPlaced");
            }
            try {
                ArrayList<Customer> custom1List = ReadAllData.readAllData();
                custom1List.add(c);
                ObjectOutputStream outputStream;
                outputStream = new ObjectOutputStream(new FileOutputStream("Bill.ser"));
                for(int i = 0 ; i<custom1List.size() ; i++) {
                    outputStream.writeObject(custom1List.get(i));
                }
                outputStream.close();
            } catch (FileNotFoundException e1) {
                System.out.println("File not Found");
            } catch(IOException exp){
                System.out.println("IO Exception while opening file");
            }

        }
    }
}
