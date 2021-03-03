import javax.swing.*;
import java.awt.event.ActionListener;

public class Gui extends JFrame {
    private JTextField tf;
    private JPanel jp;
    private String name;
    public Gui(){


tf = new JTextField("h",20);
        name = "-1";
        this.setTitle("The Game");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jp = new JPanel();
        ActionListener al = e->{ this.name = tf.getText();
     //   System.out.println("Name set to " + name);
        };
        tf.addActionListener(al);
        jp.add(tf);
        this.add(jp);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

    }
public String getVal() {
        if (this.name.equals("-1")){ return "-1"; }

        String n = name;
        name = "-1";
     //   System.out.println("Returning" +n);
        return n;
}
}
