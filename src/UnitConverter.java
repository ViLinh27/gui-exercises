import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UnitConverter {
    public static void main(String[] args) {
        new DisplayGUI();
    }
}

class DisplayGUI{
    DisplayGUI(){
        //main frame
        JFrame frame = new JFrame("Unit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,400);

        //panels
        JPanel panel = new JPanel();
        JPanel tempPanel = new JPanel();
        JPanel measurePanel = new JPanel();

        //temperature
        JLabel templbl = new JLabel("Convert temperature");
        JLabel inputlbl_t = new JLabel("input:");
        JTextField tempinput_tf = new JTextField(10);
        JLabel outputlbl_t= new JLabel("output:");
        JTextField tempOutput_tf = new JTextField(10);
        tempPanel.add(inputlbl_t);
        tempPanel.add(tempinput_tf);
        tempPanel.add(outputlbl_t);
        tempPanel.add(tempOutput_tf);

        //measurement
        JLabel measurelbl = new JLabel("Convert between metric/imperial");
        JLabel inputlbl_m = new JLabel("input:");
        JTextField measureinput_tf = new JTextField(10);
        JLabel outputlbl_ms= new JLabel("output:");
        JTextField measureOutput_tf = new JTextField(10);
        measurePanel.add(inputlbl_m);
        measurePanel.add(measureinput_tf);
        measurePanel.add(outputlbl_ms);
        measurePanel.add(measureOutput_tf);

        //buttons
        JButton CFbtn = new JButton("C to F");
        JButton FCbtn = new JButton("F to C");
        JButton KMibtn = new JButton("Km to Mi");
        JButton MiKbtn = new JButton("Mi to Km");
        JButton MFtbtn = new JButton("M to Ft");
        JButton FtMbtn = new JButton("Ft to M");
        JButton CmInbtn = new JButton("Cm to In");
        JButton InCmbtn = new JButton("In to Cm");

        panel.add(templbl);
        panel.add(tempPanel);
        panel.add(measurelbl);
        panel.add(measurePanel);
        panel.add(CFbtn);
        panel.add(FCbtn);
        panel.add(KMibtn);
        panel.add(MiKbtn);
        panel.add(MFtbtn);
        panel.add(FtMbtn);
        panel.add(CmInbtn);
        panel.add(InCmbtn);
        panel.setLayout(new GridLayout(6,2));

        frame.getContentPane().add(BorderLayout.NORTH,panel);
        frame.setVisible(true);
    }
}
