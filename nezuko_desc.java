import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Image;
// ActionListener gets implemented in order for the actionPerformed() method to work through method overriding
public class nezuko_desc implements ActionListener {
    JLabel label = new JLabel();
    JPanel image = new JPanel();
    JPanel description = new JPanel();
    JButton homebutton = new JButton();
    JPanel panel = new JPanel();
    // Window constructor from window.java so that new window appears
    window win = new window();
    // Heading becomes Nezuko Kamado
    maintitle main = new maintitle("Nezuko Kamado");
    // Constructor that contains and adds the components about the text and picture of Demon Slayer characters
    nezuko_desc() {
        // Resizes image
        ImageIcon nezuko_pic = new ImageIcon("nezukokamado.jpg");
        Image nezuko_pic2 = nezuko_pic.getImage();
        Image nezuko_size = nezuko_pic2.getScaledInstance(350, 490, java.awt.Image.SCALE_SMOOTH);
        nezuko_pic = new ImageIcon(nezuko_size);
        // The button that will close the current window and opens a new window which is the list of characters from Demon Slayer
        // when clicked.
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 14));
        homebutton.setBounds(650, 600, 250, 50);
        homebutton.setFocusable(false);
        homebutton.addActionListener(this);
        // JPanel container's appearance
        panel.setBackground(Color.white);
        panel.setBounds(10, 150, 370, 510);
        // Add image to JLabel component
        label.setIcon(nezuko_pic);
        // Add JLabel component to JPanel container
        panel.add(label); 
        // Sets position, width and height of JPanel component that will store the text area below.
        description.setBounds(430, 150, 450, 400);
        // JTextArea component contains the description of a certain Demon Slayer Character
        JTextArea textArea = new JTextArea(
            "Nezuko Kamado is a supporting character of Demon Slayer and is the sister of Tanjiro Kamado. " +
            "Despite being a demon, Nezuko helped Tanjiro and his allies to fight against the demons, controlled by Muzan Kibutsuji. " +
            "She was found to be very attractive by Zenitsu.", 38, 38
        );
        // Sets appearance of the description and the text area itself.
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        // Add JTextArea component to JPanel component
        description.add(textArea);
        // Add components to JFrame
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
