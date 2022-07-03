import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;

// window class inherits the JFrame class so object instantiation isn't needed.
// Uses 'this' keyword instead.
public class window extends JFrame {
    // window constructor contains code to create a window and its background.
    window() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        Image icon2 = icon.getImage();
        Image sizedown = icon2.getScaledInstance(400, 557, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizedown);

        this.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 234, 125));
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
    }
}
