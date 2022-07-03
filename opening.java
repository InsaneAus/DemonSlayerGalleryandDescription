import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Image;

public class opening {
    public static void main(String[] args) {
        // runs the opening2 constructor which causes a new window to pop
       new opening2();
    }
}
// window class inherits the JFrame class so object instantiation isn't needed.
// Uses 'this' keyword instead.
// ActionListener gets implemented in order for the actionPerformed() method to work through method overriding
class opening2 extends JFrame implements ActionListener {
    JButton button = new JButton();
    ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
    JLabel mainpic = new JLabel();
    // Heading becomes Demon Slayer Characters
    maintitle main = new maintitle("Demon Slayer Characters");
    opening2() {
        // Code to make the button "Click to Open". The addActionListener() method registers the event of the button when it is clicked.
        button.setBounds(500, 250, 430, 150);
        button.addActionListener(this);
        button.setText("Click to open");
        button.setFont(new Font("EDO SZ", Font.PLAIN, 60));
        button.setFocusable(false);
        // Creates image of the Demon Slayer wallpaper image that is located on the left of the button
        // Resizes image as well
        Image icon2 = icon.getImage();
        Image sizedown = icon2.getScaledInstance(400, 557, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizedown);

        mainpic.setIcon(icon);
        mainpic.setBounds(50, 120, 400, 557);
        // Code for the window and the background
        this.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 234, 125));
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
        // Adds the button, picture and the large title to the JFrame so that it can be seen and used when the code is run.
        this.add(main.title);
        this.add(button);
        this.add(mainpic);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // When clicked, the current will be disposed and a new window will open.
        if(e.getSource() == button) {
            this.dispose();
            new characterlist();
        }
    }
}
