import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Abdullah
 */
public class LoginFrame extends JFrame {
    private JButton JLogin,JCreateNewAccount;
    private JButton ForgetP;
    private JPanel Jp1,Jp2;
    private JTextField Jt1;
    private JPasswordField Jt2;
    private JLabel JL1,JL2;
    private static Customer c1;
    //private Address a1;
    //private Time t1;
    LoginFrame(){
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setSize(600,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        JLogin = new JButton("Login");
        JCreateNewAccount = new JButton("Create New Account");
        ForgetP = new JButton("Forget Password");
        JL1 = new JLabel("Email");
        JL2 = new JLabel("Password");
        Jt1 = new JTextField(15);
        Jt2 = new JPasswordField(15);
        Jp1 = new JPanel(new GridLayout(2,2));
        Jp2 = new JPanel(new FlowLayout());
        Jp1.setBackground(Color.ORANGE);
        Jp2.setBackground(Color.WHITE);
        Jp1.add(JL1);
        Jp1.add(Jt1);
        Jp1.add(JL2);
        Jp1.add(Jt2);
        Jp2.add(JLogin);
        Jp2.add(JCreateNewAccount);
        Jp2.add(ForgetP);
        Listener1 a = new Listener1();
        JLogin.addActionListener(a);
        JCreateNewAccount.addActionListener(a);
        ForgetP.addActionListener(a);
        add(Jp1,BorderLayout.NORTH);
        add(Jp2,BorderLayout.CENTER);
    }

    public static Customer getC1() {
        return c1;
    }

    public static void setC1(Customer c1) {
        c1 = c1;
    }

    class Listener1 implements ActionListener {
        public void actionPerformed(ActionEvent ae){
            if(ae.getActionCommand().equalsIgnoreCase("Login")){
                ArrayList<Customer> customList = ReadAllData.readAllData();
                for(int i = 0; i < customList.size();i++) {
                    c1 = customList.get(i);
                    if((Jt1.getText() == "") & (Jt2.getText() == "")){
                        JOptionPane.showMessageDialog(new JFrame(),"Fields Empty");
                    }
                    if((Jt1.getText().equalsIgnoreCase(c1.getEmail()) & (Jt2.getText().equalsIgnoreCase(c1.getPassword())))){
                    LocationFrame lf = new LocationFrame();
                    setVisible(false);
                    break;
                   }
                    else if((!Jt1.getText().equalsIgnoreCase(c1.getEmail()))){
                        JOptionPane.showMessageDialog(new JFrame(),"Incorrect Email ");
                        break;
                    }
                    else if((!Jt2.getPassword().equals(c1.getPassword()))){
                        JOptionPane.showMessageDialog(new JFrame(),"Incorrect Password ");
                        break;
                    }
                   else{
                        JOptionPane.showMessageDialog(new JFrame(),"No Account found");
                        break;
                    }
                }
                }
             else if(ae.getActionCommand().equalsIgnoreCase("Create New Account")){
                System.out.println("Lets sign up");
                NewSignUp su = new NewSignUp();
                setVisible(false);
            }
             else if(ae.getActionCommand().equalsIgnoreCase("Forget Password")){
                System.out.println("Forgotten Password");
                ForgetPass fp = new ForgetPass();
                setVisible(false);
            }
        }
    }

}
