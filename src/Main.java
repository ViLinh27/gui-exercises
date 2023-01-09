import javax.swing.*;//imports swing library
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //the main frame
        JFrame frame = new JFrame("My first GUI in java");//Top Title of Gui File ~A
        //JFrame sounds like a class that helps you summon a gui~A
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Can't tell what this does ~A
        frame.setSize(300,300);//Default size of file ~A

        //menubar with components
        JMenuBar menuBar = new JMenuBar();//Summons a menu bar to frame it seems ~A
        JMenu menu1 = new JMenu("FILE");//makes menu button ~A
        JMenu menu2 = new JMenu("HELP");//maeks menu button ~A
        menuBar.add(menu1);//adds menu buton to menu bar ~A
        menuBar.add(menu2);//adds menu buton to menu bar ~A
        JMenuItem m11 = new JMenuItem("Open");// Adds Drop Down Menu Item Option to menu1 Button ~A
        JMenuItem m22 = new JMenuItem("Save as");// Adds Drop Down Menu Item Option to menu1 Button ~A
        JMenuItem m33 = new JMenuItem("Settings");// Adds Drop Down Menu Item Option to menu2 Button ~A
        JMenuItem m44 = new JMenuItem("Preferences");// Adds Drop Down Menu Item Option to menu2 Button ~A
        menu1.add(m11);
        menu1.add(m22);
        menu2.add(m33);
        menu2.add(m44);

        //buttons
        //JButton button = new JButton("Press 1");
        //JButton button2 = new JButton("Press 2");
        //frame.getContentPane().add(button);//adds button to content pane of frame
        //frame.getContentPane().add(button2);
        //frame.setVisible(true);

        //panel at the bottom with components
        JPanel panel = new JPanel();//panel not visible in output
        JLabel label = new JLabel("Enter Text Here: ");
        JTextField tf = new JTextField(10);//accepts 10 characters here
        JButton send = new JButton("Send");
        JButton resetbtn = new JButton("Reset");
        panel.add(label);//components added using FLow Layout//single row layout
        panel.add(tf);
        panel.add(send);
        panel.add(resetbtn);

        //text area
        JTextArea ta = new JTextArea();

        //adding components to frame;
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}