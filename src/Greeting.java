import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Greeting {
    public static void main(String[] args){
        new ShowApp();
    }//frontend
}
class ShowApp{
    ShowApp(){//constructor
        JFrame frame = new JFrame("Greeting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,400);

        //panels
        JPanel mainPanel = new JPanel();

        //labels and stuff
        JLabel nameLbl = new JLabel("What is your name");
        JTextField nametf = new JTextField(20);
        mainPanel.add(nameLbl);
        mainPanel.add(nametf);

        //languge buttons
        JButton btn_eng = new JButton("English");
        JButton btn_fr = new JButton("Francais");
        JButton btn_esp = new JButton("Español");
        JButton btn_jp = new JButton("日本語 ");
        mainPanel.add(btn_eng);
        mainPanel.add(btn_fr);
        mainPanel.add(btn_esp);
        mainPanel.add(btn_jp);
        mainPanel.setLayout(new GridLayout(3,2));

        //output panel
        JLabel outputlbl = new JLabel();

        //action listeners
        btn_eng.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nametf.getText();
                String result = String.format("Hello, my name is %s",userName);
                outputlbl.setText(String.valueOf(result));
            }
        });
        btn_fr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nametf.getText();
                String result = String.format("Bonjour, je m'appelle %s",userName);
                outputlbl.setText(result);
            }
        });
        btn_esp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nametf.getText();
                String result = String.format("Hola, soy %s",userName);
                outputlbl.setText(result);
            }
        });
        btn_jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nametf.getText();
                String  result = String.format("こんにちは、私の名前は %s",userName);
                outputlbl.setText(result);
            }
        });

        //frame settings for output
        frame.getContentPane().add(BorderLayout.NORTH,mainPanel);
        frame.getContentPane().add(BorderLayout.CENTER,outputlbl);
        frame.setVisible(true);
    }
}
