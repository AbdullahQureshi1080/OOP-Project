import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocationFrame extends JFrame {
    private JLabel L1;
    private JTextField t1;
    private JButton b1;
    private JPanel p1,p2;

    LocationFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        L1 = new JLabel("Enter Location");
        t1 = new JTextField(10);
        b1 = new JButton("Proceed");
        p1.add(L1);
        p1.add(t1);
        p2.add(b1);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        Listener2 a = new Listener2();
        b1.addActionListener(a);
    }

    class Listener2 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getActionCommand().equalsIgnoreCase("Proceed")){
                System.out.println("Location wala");
                if(t1.getText().equalsIgnoreCase("Islamabad")){
                    JOptionPane.showMessageDialog(new JFrame(),"Module Under Maintainence");
                }
                else if(t1.getText().equalsIgnoreCase("Rawalpindi")){
                    //JOptionPane.showMessageDialog(new JFrame(),"");
                    System.out.println("KFC or OPTP wala mod");
                    RestaurantsFrame Rf = new RestaurantsFrame();
                    setVisible(false);

                }
            }
        }
    }
}
