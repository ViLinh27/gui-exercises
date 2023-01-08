import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first GUI in java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,600);
        JButton button = new JButton("Press");

        frame.getContentPane().add(button);//adds button to content pane of frame
        frame.setVisible(true);
    }
}