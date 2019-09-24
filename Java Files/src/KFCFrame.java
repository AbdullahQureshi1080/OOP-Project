import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class KFCFrame extends JFrame {
    private JLabel l1,l2,l3,ltb1,ltb2,ltb3,ltb4,ltb5,ltb6,ltb7,ltb8,ltb9;
    private JPanel p1,p2,p3,p4,p5,p6;
    private JTabbedPane tp;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,back;
    private Time t = new Time();
    KFCFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        JTextArea ta=new JTextArea(200,200);
        l1 = new JLabel("KFC");
        l2 = new JLabel("Pindi - Cant");
        l3 = new JLabel(t.getDeliveryTime());
        p1 = new JPanel(new FlowLayout());
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(null);
        p4 = new JPanel(new GridLayout(3,3));
        p5 = new JPanel(new GridLayout(3,3));
        p6 = new JPanel(new GridLayout(3,3));
        p4.setPreferredSize(new Dimension(10,10));
        p5.setPreferredSize(new Dimension(10,10));
        p6.setPreferredSize(new Dimension(10,10));
        //  p3.setLocation(null);
        b1 = new JButton("Krunch Combo");
        b2 = new JButton("Krunch Burger and Drink");
        b3 = new JButton("Krunch Burger");
        b4 = new JButton("Duo Box");
        b5 = new JButton("Mingle Bucket");
        b6 = new JButton("Kentucky Box ");
        b7 = new JButton("Zinger Combo");
        b8 = new JButton("Mighty Zinger Combo");
        b9 = new JButton("Zinger Stacker Combo");
        back = new JButton("back");

        ImageIcon ic1 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\1.jpg");
        ImageIcon ic2 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\3.jpg");
        ImageIcon ic3 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\2.jpg");
        ImageIcon ic4 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\4.jpg");
        ImageIcon ic5 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\5.jpg");
        ImageIcon ic6 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\6.jpg");
        ImageIcon ic7 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\7.jpg");
        ImageIcon ic8 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\8.jpg");
        ImageIcon ic9 = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\9.jpg");

        ltb1 = new JLabel(ic1);
        ltb2 = new JLabel(ic2);
        ltb3 = new JLabel(ic3);
        ltb4 = new JLabel(ic4);
        ltb5 = new JLabel(ic5);
        ltb6 = new JLabel(ic6);
        ltb7 = new JLabel(ic7);
        ltb8 = new JLabel(ic8);
        ltb9 = new JLabel(ic9);

        tp = new JTabbedPane();
        tp.setBounds(20,20,100,100);
        tp.setBackground(Color.PINK);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(back);
        p4.add(ltb1);
        p4.add(b1);
        p4.add(ltb2);
        p4.add(b2);
        p4.add(ltb3);
        p4.add(b3);
        p5.add(ltb4);
        p5.add(b4);
        p5.add(ltb5);
        p5.add(b5);
        p5.add(ltb6);
        p5.add(b6);
        p6.add(ltb7);
        p6.add(b7);
        p6.add(ltb8);
        p6.add(b8);
        p6.add(ltb9);
        p6.add(b9);
        //add(p4);
        tp.add("Value",p4);
        tp.addTab("Promotion",p5);
        tp.addTab("Meal",p6);
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(tp);
        Listener4 a = new Listener4();
        b1.addActionListener(a);
        b2.addActionListener(a);
        b3.addActionListener(a);
        b4.addActionListener(a);
        b5.addActionListener(a);
        b6.addActionListener(a);
        b7.addActionListener(a);
        b8.addActionListener(a);
        b9.addActionListener(a);
        back.addActionListener(a);
    }

    class Listener4 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (ae.getActionCommand().equalsIgnoreCase("Krunch Combo")) {
                System.out.println("KFC wala");
                KrunchCombo kc = new KrunchCombo();
                setVisible(false);
            }
            if (ae.getActionCommand().equalsIgnoreCase("Krunch Burger and Drink")) {
                System.out.println("KFC wala");
                KrunchBurgerDrink kc = new KrunchBurgerDrink();
                setVisible(false);
            }
            if (ae.getActionCommand().equalsIgnoreCase("Krunch Burger")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("YO")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            if (ae.getActionCommand().equalsIgnoreCase("Yo")) {
                System.out.println("KFC wala");
            }
            else if (ae.getActionCommand().equalsIgnoreCase("back")) {
                System.out.println("KFC wala");
                RestaurantsFrame rf = new RestaurantsFrame();
                setVisible(false);
            }
        }
    }
}

