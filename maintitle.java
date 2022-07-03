import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class maintitle {
    JLabel title = new JLabel();
    // maintitle constructor that will modify the JLabel component's appearance as well as the text in it
    // This results in the background of the JLabel being blue and the text color being white.
    maintitle(String text) {
        title.setText(text);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(200, 20, 600, 75);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("EDO SZ", Font.PLAIN, 50));
        title.setBackground(Color.blue);
        title.setForeground(Color.white);
        title.setOpaque(true);
    }
}
