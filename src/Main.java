import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //the main frame
        JFrame frame = new JFrame("My first GUI in java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        //menubar with components
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("HELP");
        menuBar.add(menu1);
        menuBar.add(menu2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        JMenuItem m33 = new JMenuItem("Settings");
        JMenuItem m44 = new JMenuItem("Preferences");
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