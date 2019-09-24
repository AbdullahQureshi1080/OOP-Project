import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class trial2222 extends JFrame{
        JPanel jp = new JPanel();
        JLabel jl = new JLabel();

        public trial2222()
        {
            setTitle("Tutorial");
            setVisible(true);
            setSize(400, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            jl.setIcon(new ImageIcon("C:\\Users\\Abdullah\\IdeaProjects\\GUIProject\\download.jpg"));
            jp.add(jl);
            add(jp);

            validate();
        }


        public static void main(String[] args)
        {
            trial2222 t = new trial2222();
        }
    }

