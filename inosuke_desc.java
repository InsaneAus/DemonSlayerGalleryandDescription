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
public class inosuke_desc implements ActionListener {
    JLabel label = new JLabel();
    JPanel image = new JPanel();
    JPanel description = new JPanel();
    JButton homebutton = new JButton();
    JPanel panel = new JPanel();
    // Window constructor from window.java so that new window appears
    window win = new window();
    // Heading becomes Inosuke Hashibira
    maintitle main = new maintitle("Inosuke Hashibira");
    inosuke_desc() {
        //Resizes image
        ImageIcon inosuke_pic = new ImageIcon("inosukehashibira.jpg");
        Image inosuke_pic2 = inosuke_pic.getImage();
        Image inosuke_size = inosuke_pic2.getScaledInstance(350, 547, java.awt.Image.SCALE_SMOOTH);
        inosuke_pic = new ImageIcon(inosuke_size);
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
        panel.setBounds(20, 150, 370, 567);
        // Adds image to JLabel component
        label.setIcon(inosuke_pic);
        // Adds JLabel component to JPanel container
        panel.add(label); 
        // Sets position, width and height of JPanel component that will store the text area below.
        description.setBounds(440, 150, 450, 400);
        // Sets appearance of the description and the text area itself.
        JTextArea textArea = new JTextArea(
            "Inosuke is a protagonist of Demon Slayer: Kimetsu no Yaiba. He wears a boar head and usually doesn't wear a shirt and he " +
            "is very short-tempered and doesn't like to think when it comes to battling demons." +
            "He also tends to forget people's names like Tanjiro's and he can refer Tanjiro as Kentaro.", 38, 38
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
