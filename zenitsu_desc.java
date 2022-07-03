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
public class zenitsu_desc implements ActionListener {
    JLabel label = new JLabel();
    JPanel image = new JPanel();
    JPanel description = new JPanel();
    JButton homebutton = new JButton();
    JPanel panel = new JPanel();
    // Window constructor from window.java so that new window appears
    window win = new window();
    // Heading becomes Zenitsu Agatsuma
    maintitle main = new maintitle("Zenitsu Agatsuma");
    zenitsu_desc() {
        // Resizes image
        ImageIcon zenitsu_pic = new ImageIcon("zenitsuagatsuma.jpg");
        Image zenitsu_pic2 = zenitsu_pic.getImage();
        Image zenitsu_size = zenitsu_pic2.getScaledInstance(350, 610, java.awt.Image.SCALE_SMOOTH);
        zenitsu_pic = new ImageIcon(zenitsu_size);
        // The button that will close the current window and opens a new window which is the list of characters from Demon Slayer
        // when clicked.
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 14));
        homebutton.setBounds(650, 600, 250, 50);
        homebutton.setFocusable(false);
        homebutton.addActionListener(this);
        // JPanel component's appearance
        panel.setBackground(Color.white);
        panel.setBounds(30, 130, 370, 630);
        // Adds image to JLabel component
        label.setIcon(zenitsu_pic);
        // Adds JLabel component to JPanel component
        panel.add(label); 
        // Sets position, width and height of JPanel component that will store the text area below.
        description.setBounds(450, 150, 450, 400);
        // JTextArea component contains the description of a certain Demon Slayer Character
        JTextArea textArea = new JTextArea(
            "Zenitsu Agatsuma is a protagonist of Demon Slayer: Kimetsu no Yaiba. " +
            "Despite being a demon slayer, he tended to be extremely scared of demons earlier in the series but was " +
            "romantically attracted to Nezuko even though she was a demon. When he was sleeping, his fear of demons disappeared " + 
            "and it made him utilize most of his powers and abilities with great potential when fighting against demons.", 38, 38
        );
        // Sets appearance of the description and the text area itself.
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        // Adds JTextArea component to JPanel component
        description.add(textArea);
        // Adds JPanel component to JFrame
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
