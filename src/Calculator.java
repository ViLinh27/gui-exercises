import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args){//frontend
        new ShowGUI();
    }

}

class ShowGUI{

    ShowGUI(){//constructor
        //main frame
        JFrame frame = new JFrame("Number Addition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);

        //panel
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        //labels and text fields
        JLabel lb1 = new JLabel("First Number: ");
        JTextField tf1 = new JTextField(10);
        JLabel lb2 = new JLabel("Second Number");
        JTextField tf2 = new JTextField(10);
        JLabel lb3 = new JLabel("Result: ");
        JTextField tf3 = new JTextField(10);
        panel.add(lb1);
        panel.add(tf1);
        panel.add(lb2);
        panel.add(tf2);
        panel.add(lb3);
        panel.add(tf3);
        panel.setLayout(new GridLayout(3,2));

        //buttons
        JButton btn = new JButton("Add");
        JButton btn2 =  new JButton("Clear");
        JButton btn3 = new JButton("Exit");
        JButton btn_sub = new JButton("Substract");
        JButton btn_div = new JButton("Divide");
        JButton btn_mult = new JButton("Multiply");
        panel2.add(btn);
        panel2.add(btn_sub);
        panel2.add(btn_div);
        panel2.add(btn_mult);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.setLayout(new GridLayout(2,2));

        //action listener
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExitButtonAction();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //accept input from tf1 and tf2, convert to float
                float num1,num2,result;
                num1 = Float.parseFloat(tf1.getText());
                num2 = Float.parseFloat(tf2.getText());
                result = num1+num2;
                tf3.setText(String.valueOf(result));
                //perform addtion
                //convert sum to string to put in tf3
            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1,num2,result;
                num1 = Float.parseFloat(tf1.getText());
                num2 = Float.parseFloat(tf2.getText());
                result = num1-num2;
                tf3.setText(String.valueOf(result));
            }
        });
        btn_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1,num2,result;
                num1 = Float.parseFloat(tf1.getText());
                num2 = Float.parseFloat(tf2.getText());
                result = num1/num2;
                tf3.setText(String.valueOf(result));
            }
        });
        btn_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1,num2,result;
                num1 = Float.parseFloat(tf1.getText());
                num2 = Float.parseFloat(tf2.getText());
                result = num1*num2;
                tf3.setText(String.valueOf(result));
            }
        });

        frame.getContentPane().add(BorderLayout.NORTH,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,panel2);
        frame.setVisible(true);
    }
    private static void ExitButtonAction(){
        System.exit(0);
    }
}
