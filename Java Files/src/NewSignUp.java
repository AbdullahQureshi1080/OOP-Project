import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NewSignUp extends JFrame {
        private JLabel fn,ln,mn,e,p,a,Aa,Ah,As,Ac,Acc;
        private JTextField fnt,lnt,mnt,et,pt,Aat,Aht,Ast,Act,Acct;
        private JPanel p1,p2,p3;
        private JButton Su,B;

        NewSignUp(){
            setLayout(new BorderLayout());
            setSize(600,500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            setVisible(true);
            p1 = new JPanel(new GridLayout(12,12));
           // p2 = new JPanel(new GridLayout(5,2));
            p3 = new JPanel(new FlowLayout());
            fn = new JLabel("First Name");
            ln = new JLabel("Last Name");
            mn = new JLabel("Mobile Number");
            e = new JLabel("Email ID");
            p = new JLabel("Password");
            fnt = new JTextField(10);
            lnt = new JTextField(10);
            mnt = new JTextField(10);
            et = new JTextField(10);
            pt = new JTextField(10);
            Aa = new JLabel("Area");
            Ah = new JLabel("House No");
            As = new JLabel("Street");
            Ac = new JLabel("City");
            Acc = new JLabel("City Code");
            Aat = new JTextField(10);
            Aht = new JTextField(10);
            Ast = new JTextField(10);
            Act = new JTextField(10);
            Acct = new JTextField(10);
            Su = new JButton("Sign Up");
            B = new JButton("Cancel");
            p1.add(fn);
            p1.add(fnt);
            p1.add(ln);
            p1.add(lnt);
            p1.add(mn);
            p1.add(mnt);
            p1.add(e);
            p1.add(et);
            p1.add(p);
            p1.add(pt);
            p1.add(Aa);
            p1.add(Aat);
            p1.add(Ah);
            p1.add(Aht);
            p1.add(As);
            p1.add(Ast);
            p1.add(Ac);
            p1.add(Act);
            p1.add(Acc);
            p1.add(Acct);
            p3.add(Su);
            p3.add(B);
            add(p1,BorderLayout.CENTER);
            //add(p2,BorderLayout.CENTER);
            add(p3,BorderLayout.SOUTH);
            Listener5 a = new Listener5();
            Su.addActionListener(a);
            B.addActionListener(a);
        }

        class Listener5 implements ActionListener {
            public void actionPerformed(ActionEvent ae){
                String fname,lname,phone,email,password,area,Hno,Street,city;
                int cityc;
                Address a;
                Customer C;
                ArrayList<Double> ckout = null;
                Cart c = new Cart(ckout);
                if(ae.getActionCommand().equalsIgnoreCase("Sign Up")) {

                    fname = fnt.getText();
                    lname = lnt.getText();
                    phone = mnt.getText();
                    email = et.getText();
                    password = pt.getText();
                    area = Aat.getText();
                    Hno = Aht.getText();
                    Street = Ast.getText();
                    city = Act.getText();
                    cityc = Integer.parseInt(Acct.getText());

                    if (fname.equals("") & lname.equals("")
                        & phone.equals("") & email.equals("") &
                        password.equals("") & area.equals("")
                        & Hno.equals("") & Street.equals("")
                        & city.equals("") & (cityc < 0)) {
                        JOptionPane.showMessageDialog(new JFrame(), "Fields Empty");
                    }

                    // C.verifyEmail(email);

                    /*if ((fname.equals("")) & (lname.equals(""))
                        & phone.equals("") & email.equals("") &
                        password.equals("") & area.equals("")
                        & Hno.equals("") & Street.equals("")
                        & city.equals(""))
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "Fields Empty");
                    }*/
                    else {
                        a = new Address(area, Hno, Street, city, cityc);
                        C = new Customer(fname, lname, phone, email, password, a, c);

                        try {
                            ArrayList<Customer> custom1List = ReadAllData.readAllData();
                            custom1List.add(C);
                            ObjectOutputStream outputStream;
                            outputStream = new ObjectOutputStream(new FileOutputStream("Cs.ser"));
                            for (int i = 0; i < custom1List.size(); i++) {
                                outputStream.writeObject(custom1List.get(i));
                            }
                            outputStream.close();
                        } catch (FileNotFoundException e1) {
                            System.out.println("File not Found");
                        } catch (IOException exp) {
                            System.out.println("IO Exception while opening file");
                        }

                        setVisible(false);
                        JOptionPane.showMessageDialog(new JFrame(), " Account Created");
                        fnt.setText("");
                        lnt.setText("");
                        mnt.setText("");
                        et.setText("");
                        pt.setText("");
                        Aat.setText("");
                        Aht.setText("");
                        Ast.setText("");
                        Act.setText("");
                        Acct.setText("");

                        setVisible(false);

                        NewSignUp SU = new NewSignUp();
                    }
                }
                else if (ae.getActionCommand().equalsIgnoreCase("Cancel")){
                    setVisible(false);
                    LoginFrame lf = new LoginFrame();
                }


            }
        }
    }
