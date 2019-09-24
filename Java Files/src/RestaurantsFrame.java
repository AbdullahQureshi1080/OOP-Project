import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantsFrame extends JFrame{
    private JLabel L;
    private JPanel p1,p2,P;
    private JButton b1,b2,B;

    RestaurantsFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        P = new JPanel(new FlowLayout());
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        b1 = new JButton("KFC");
        b2 = new JButton("OPTP");
        B = new JButton("Back");
        L = new JLabel("Restaurants in your City");
        P.add(L);
        p1.add(b1);
        p1.add(b2);
        p2.add(B);
        add(P,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        Listener3 a = new Listener3();
        b1.addActionListener(a);
        b2.addActionListener(a);
        B.addActionListener(a);
    }

    class Listener3 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (ae.getActionCommand().equalsIgnoreCase("KFC")) {
                System.out.println("Restaurant Wala");
                KFCFrame kf = new KFCFrame();
                setVisible(false);
            }
            else if (ae.getActionCommand().equalsIgnoreCase("OPTP")) {
                System.out.println("Restaurant Wala");
                System.out.println("Under Maintainance");

            }
            else if (ae.getActionCommand().equalsIgnoreCase("Back")) {
                System.out.println("Restaurant Wala");
                LocationFrame kf = new LocationFrame();
                setVisible(false);
            }
        }
    }
}
