import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Image;
// ActionListener gets implemented in order for the actionPerformed() method to work through method overriding
public class characterlist implements ActionListener {
    button tanjiro, nezuko, inosuke, zenitsu, daki;
    JPanel panel_tanjiro, panel_nezuko, panel_inosuke, panel_zenitsu, panel_daki;
    // Heading becomes Demon Slayer Characters
    maintitle main = new maintitle("Demon Slayer Characters");
    JButton homebutton = new JButton();
    JFrame frame = new JFrame();
    // Constructor for the character list window
    characterlist() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        Image icon2 = icon.getImage();
        Image sizedown = icon2.getScaledInstance(400, 557, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizedown);
        // Objects created from characterpic constructor that is found down below
        // What it does is that it will resize the image
        characterpic tanjiro_pic = new characterpic(new ImageIcon("tanjirosquare.png"));
        characterpic nezuko_pic = new characterpic(new ImageIcon("nezukosquare.png"));
        characterpic inosuke_pic = new characterpic(new ImageIcon("inosukesquare.png"));
        characterpic zenitsu_pic = new characterpic(new ImageIcon("zenitsusquare.png"));
        characterpic daki_pic = new characterpic(new ImageIcon("dakisquare.png"));
        // Objects created from label constructor that is found down below
        // What it does is that it adds the image to the JLabel which will be added to the JPanel and it will be added
        // to the JFrame so the pictures can be seen
        label show_tanjiro = new label(tanjiro_pic.image);
        label show_nezuko = new label(nezuko_pic.image);
        label show_inosuke = new label(inosuke_pic.image);
        label show_zenitsu = new label(zenitsu_pic.image);
        label show_daki = new label(daki_pic.image);
        // Objects created from button constructor that is found down below
        // What it does is that it creates a specific button for each character and when clicked,
        // the current window will be closed and a new window will be opened.
        tanjiro = new button("Tanjiro Kamado");
        tanjiro.button.addActionListener(this);
        
        nezuko = new button("Nezuko Kamado");
        nezuko.button.addActionListener(this);

        inosuke = new button("Inosuke Hashibira");
        inosuke.button.addActionListener(this);

        zenitsu = new button("Zenitsu Agatsuma");
        zenitsu.button.addActionListener(this);

        daki = new button("Daki");
        daki.button.addActionListener(this);

        // CreatePanel(button, label, x, y) Method that returns JPanel container
        // The JPanels will store the buttons and the labels from the previous code above and they can be positioned
        // based on the x and y coordinates
        panel_tanjiro = CreatePanel(tanjiro.button, show_tanjiro.part, 30, 110);
        panel_nezuko = CreatePanel(nezuko.button, show_nezuko.part, 310, 110);
        panel_inosuke = CreatePanel(inosuke.button, show_inosuke.part, 30, 440);
        panel_zenitsu = CreatePanel(zenitsu.button, show_zenitsu.part, 310, 440);
        panel_daki = CreatePanel(daki.button, show_daki.part, 590, 300);
        
        panel_tanjiro.add(tanjiro.button);
        panel_tanjiro.add(show_tanjiro.part);
        
        panel_nezuko.add(nezuko.button);
        panel_nezuko.add(show_nezuko.part);
        
        panel_inosuke.add(inosuke.button);
        panel_inosuke.add(show_inosuke.part);
        
        panel_zenitsu.add(zenitsu.button);
        panel_zenitsu.add(show_zenitsu.part);

        panel_daki.add(daki.button);
        panel_daki.add(show_daki.part);
        
        // Code for window and its background
        frame.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(123, 234, 125));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        // Code to add the components to the JFrame
        frame.add(panel_tanjiro);
        frame.add(panel_nezuko);
        frame.add(panel_inosuke);
        frame.add(panel_zenitsu);
        frame.add(panel_daki);
        frame.add(main.title);
    }

    public static JPanel CreatePanel(JButton button, JLabel label, int x, int y) {
        // JPanel's appearance 
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(x, y, 250, 270);
        return panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Will close the window and open a new one when clicked
        if (e.getSource() == tanjiro.button) {
            frame.dispose();
            new tanjiro_desc();
        }
        if (e.getSource() == nezuko.button) {
            frame.dispose();
            new nezuko_desc();
        }
        if (e.getSource() == inosuke.button) {
            frame.dispose();
            new inosuke_desc();
        }
        if (e.getSource() == zenitsu.button) {
            frame.dispose();
            new zenitsu_desc();
        }
        if (e.getSource() == daki.button) {
            frame.dispose();
            new daki_desc();
        }
        
    }
    
}
// characterpic class that has the constructor to resize image
class characterpic {
    ImageIcon image;
    characterpic(ImageIcon pic) {
        Image pic2 = pic.getImage();
        Image pic_size = pic2.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
        pic = new ImageIcon(pic_size);
        image = pic;
    }
}
// button class that has the constructor to create the button's appearance specifically
class button {
    JButton button = new JButton();
    button(String text) {
        button.setText(text);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.TOP);
        button.setFocusable(false);
        button.setBounds(0, 0, 230, 50);
        button.setFont(new Font("MV Boli", Font.PLAIN, 10));
    }
}
// label class that has the constructor to add the image to the JLabel component
class label {
    JLabel part = new JLabel();
    label(ImageIcon icon) {
        part.setIcon(icon);
        part.setHorizontalAlignment(JLabel.CENTER);
        part.setVerticalAlignment(JLabel.BOTTOM);
    }
}


