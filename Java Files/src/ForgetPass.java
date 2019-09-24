import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ForgetPass extends JFrame {
    JPanel p1,p2;
    JLabel l1,l2;
    JButton change,back;
    JTextField t1;
    JPasswordField tp1;

    ForgetPass(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        p1 = new JPanel(new GridLayout(2,2));
        p2 = new JPanel(new FlowLayout());
        l1 = new JLabel("Email");
        l2 = new JLabel("New Password");
        change = new JButton("Change");
        back = new JButton("Back");
        t1 = new JTextField(15);
        tp1 = new JPasswordField(15);
        Listener7 a = new Listener7();
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(tp1);
        p2.add(change);
        p2.add(back);
        add(p1);
        add(p2);
        change.addActionListener(a);
        back.addActionListener(a);
    }

    class Listener7 implements ActionListener {
        public void actionPerformed(ActionEvent ae){
            if(ae.getActionCommand().equalsIgnoreCase("Change")){
                ArrayList<Customer> arrl = ReadAllData.readAllData();
                Customer C = new Customer();
                for(int i=0; i< arrl.size(); i++){
               // System.out.println("Location wala");
                C = arrl.get(i);
                if(C.getEmail().equalsIgnoreCase(t1.getText())){
                    //String newpass = tp1.getText();
                    C.setPassword(tp1.getText());
                    JOptionPane.showMessageDialog(new JFrame(),"Password Changed");
                    break;
                }
                /*else{
                    JOptionPane.showMessageDialog(new JFrame(),"Incorrect email");
                }*/
                }
                    try {
                        ArrayList <Customer> custom1List = ReadAllData.readAllData();
                        custom1List.add(C);
                        ObjectOutputStream outputStream;
                        outputStream = new ObjectOutputStream(new FileOutputStream("Cs.ser"));
                        for(int j = 0 ; j<custom1List.size() ; j++) {
                            outputStream.writeObject(custom1List.get(j));
                        }
                        outputStream.close();
                    } catch (FileNotFoundException e1) {
                        System.out.println("File not Found");
                    } catch(IOException exp){
                        System.out.println("IO Exception while opening file");
                    }

                    setVisible(false);
                LoginFrame lf = new LoginFrame();
                lf.setVisible(true);
                    //JOptionPane.showMessageDialog(new JFrame(), "Student added");
                }
            if(ae.getActionCommand().equalsIgnoreCase("Back")){
                System.out.println("Location wala");
                LoginFrame lf = new LoginFrame();
                setVisible(false);
            }
        }
    }
}
