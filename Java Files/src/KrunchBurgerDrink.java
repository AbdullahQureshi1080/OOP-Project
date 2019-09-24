import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KrunchBurgerDrink extends JFrame {

        private JPanel p1,p2,p3,Sp1,Sp2,p4;
        private JRadioButton b1,b2,b3,b4;
        private JButton B,back;
        private JLabel l1,lPrice,l3,l4,l5,l6,lmp,lCustom;
        private JLabel b1l,b2l;

        KrunchBurgerDrink(){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(600,500);
            setLayout(new BorderLayout());
            setLocationRelativeTo(null);
            setVisible(true);
            p1 = new JPanel();
            p2 = new JPanel(new FlowLayout());
            p3 = new JPanel(new FlowLayout());
            p4 = new JPanel(new FlowLayout());
            Sp1 = new JPanel(new FlowLayout());
            Sp2 = new JPanel(new FlowLayout());
            b1 = new JRadioButton("Pepsi");
            b2 = new JRadioButton("Miranda");
            b3 = new JRadioButton("Cheese");
            b4 = new JRadioButton("Coleslaw");
            B = new JButton("ADD TO CART");
            back = new JButton("Back");
            l1 = new JLabel("Krunch Combo with Hot and Crispy Chicken Piece");
            lPrice = new JLabel("390");
            l3 = new JLabel("Enjoy a Crispy Lettuce Combo ...");
            l4 = new JLabel("Choose your Drink");
            l5 = new JLabel("Extra Cheese");
            l6 = new JLabel("Add Ons");
            ImageIcon  ic = new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\1.jpg");
            lmp = new JLabel(ic);
            lCustom = new JLabel("Customize your Order");
            b1l = new JLabel("Each addOns for 50 Rupees");
            b2l= new JLabel("Deal's Price in Rupees");
            ButtonGroup g = new ButtonGroup();
            p1.add(lmp);
            p1.add(l1);
            //p1.add(lPrice);
            p1.add(l3);
            p2.add(lCustom);
            p2.add(l4);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            //p2.add(b1l);
            p2.add(b4);
            p2.add(b1l);
            //p2.add(b2l);
            p2.add(b2l);
            p2.add(lPrice);
            //p2.add(b2l);
            p3.add(B);
            p3.add(back);
            g.add(b1);
            g.add(b2);
            add(p1,BorderLayout.NORTH);
            add(p2,BorderLayout.CENTER);
            add(p3,BorderLayout.SOUTH);
            //add(p4,BorderLayout.SOUTH);
            Listener4 a = new Listener4();
            b1.addActionListener(a);
            b2.addActionListener(a);
            b3.addActionListener(a);
            b4.addActionListener(a);
            B.addActionListener(a);
            back.addActionListener(a);
        }

        class Listener4 implements ActionListener {
            public void actionPerformed(ActionEvent ae) {
           /* Customer c = new Customer();
            ArrayList<Customer> Cartlist = ReadAllData.readAllData();
            for(int i=0; i<Cartlist.size(); i++){
            c = Cartlist.get(i);*/

                double Total = 0;
                if (ae.getActionCommand().equalsIgnoreCase("Add To Cart")) {
                    if(ae.getActionCommand().equalsIgnoreCase("Cheese")){
                        Total += Double.parseDouble(b1l.getText());
                    }
                    if(ae.getActionCommand().equalsIgnoreCase("Coleslaw")){
                        Total += Double.parseDouble(b2l.getText());
                    }


                }
                else if(ae.getActionCommand().equalsIgnoreCase("Back")){
                    KFCFrame kf = new KFCFrame();
                    setVisible(false);
                }
            }
        }
    }

