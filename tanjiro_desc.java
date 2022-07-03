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
public class tanjiro_desc implements ActionListener {
    JLabel label = new JLabel();
    JPanel image = new JPanel();
    JPanel description = new JPanel();
    JButton homebutton = new JButton();
    JPanel panel = new JPanel();
    // Window constructor from window.java so that new window appears
    window win = new window();
    // Heading becomes Tanjiro Kamado
    maintitle main = new maintitle("Tanjiro Kamado");
    // Constructor that contains and adds the components about the text and picture of Demon Slayer characters
    tanjiro_desc() {
        // Resizes image
        ImageIcon tanjiro_pic = new ImageIcon("tanjirokamado.png");
        Image tanjiro_pic2 = tanjiro_pic.getImage();
        Image tanjiro_size = tanjiro_pic2.getScaledInstance(300, 600, java.awt.Image.SCALE_SMOOTH);
        tanjiro_pic = new ImageIcon(tanjiro_size);
        // JPanel container's appearance 
        panel.setBackground(Color.white);
        panel.setBounds(50, 150, 300, 600);
        // JLabel component contains the character picture
        label.setIcon(tanjiro_pic);
        // Adds JLabel component to the JPanel container
        panel.add(label); 
        // Sets position, width and height of JPanel component that will store the text area below.
        description.setBounds(420, 150, 450, 400);

        // JTextArea component contains the description of a certain Demon Slayer Character
        JTextArea textArea = new JTextArea(
            "Tanjiro Kamado is a protagonist from Demon Slayer: Kimetsu no Yaiba and Nezuko Kamado is his sister. After the murder of " +
            "most of his family with the exception of Nezuko who unfortunately turned into a demon, he became a demon slayer and his goals were to " +
            "eliminate Muzan Kibutsuji, the king of the demons, and turn Nezuko back into her human form. His allies included Zenitsu Agatsuma and " +
            "Inosuke Hashibira.", 38, 38
        );
        // Sets appearance of the description and the text area itself.
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        // Adds JTextArea component to JPanel container
        description.add(textArea);
        // The button that will close the current window and opens a new window which is the list of characters from Demon Slayer
        // when clicked.
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 14));
        homebutton.setBounds(650, 600, 250, 50);
        homebutton.setFocusable(false);
        homebutton.addActionListener(this);
        // Adds the components to the JFrame container so that they can be seen
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
