import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
// ActionListener gets implemented in order for the actionPerformed() method to work through method overriding
public class daki_desc implements ActionListener {
    JLabel label = new JLabel();
    JPanel image = new JPanel();
    JPanel description = new JPanel();
    JButton homebutton = new JButton();
    JPanel panel = new JPanel();
    // Window constructor from window.java so that new window appears
    window win = new window();
    // Heading becomes Daki
    maintitle main = new maintitle("Daki");
    daki_desc() {
        // Resize image
        ImageIcon daki_pic = new ImageIcon("dakidemonslayer.jpg");
        Image daki_pic2 = daki_pic.getImage();
        Image daki_size = daki_pic2.getScaledInstance(400, 200, java.awt.Image.SCALE_SMOOTH);
        daki_pic = new ImageIcon(daki_size);
        // The button that will close the current window and opens a new window which is the list of characters from Demon Slayer
        // when clicked.
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 14));
        homebutton.setBounds(650, 600, 250, 50);
        homebutton.setFocusable(false);
        homebutton.addActionListener(this);
        // JPanel Component's Appearance
        panel.setBackground(Color.white);
        panel.setBounds(50, 150, 420, 220);
        // Add image to JLabel component
        label.setIcon(daki_pic);
        // Add JLabel component to JPanel component
        panel.add(label); 
        // Sets position, width and height of JPanel component that will store the text area below.
        description.setBounds(520, 150, 450, 400);
        // JTextArea component contains the description of a certain Demon Slayer Character
        JTextArea textArea = new JTextArea(
            "Daki is an antagonist in the Entertainment District arc of Demon Slayer: Kimetsu no Yaiba. " +
            "She worked as a courtesan in Yoshiwara, Tokyo for hundreds of years as a demon and she had killed and eaten many people. " +
            "Her brother was Gyutaro who was also a demon.", 38, 38
        );
        // Sets appearance of the description and the text area itself.
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        // Adds JTextArea component to JPanel component
        description.add(textArea);
        // Adds components to JFrame component
        win.add(description);
        win.add(panel);
        win.add(main.title);
        win.add(homebutton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // When the button is clicked, the current window will be closed and the window that contains the character list will open.
        if (e.getSource() == homebutton) {
            win.dispose();
            new characterlist();
        }
        
    }
}
