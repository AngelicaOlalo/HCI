import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDriven extends JFrame {
    JTextField ftf;
    JTextField ltf;
    JTextField mtf;
    JTextField mntf;
    JTextField etf;
    JFrame output;
    JButton sb;

    class btnSubmit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            output = new JFrame("OUTPUT");
            output.setSize(300, 350);

            JPanel p2 = new JPanel();
            p2.setLayout(new FlowLayout());
            
            p2.add(new JLabel("First Name: " + ftf.getText())); 
            p2.add(new JLabel("Last Name: " + ltf.getText())); 
            p2.add(new JLabel("Middle Name: " + mtf.getText())); 
            p2.add(new JLabel("Mobile No.: " + mntf.getText())); 
            p2.add(new JLabel("Email Add: " + etf.getText()));

            JButton ok = new JButton("Okay");
            p2.add(ok); 
            output.add(p2); 

            ok.addActionListener(new btnOkay()); 
            output.setVisible(true);
        }
    }

    class btnClearAll implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent e) {
            ftf.setText("");
            ltf.setText("");
            mtf.setText("");
            mntf.setText("");
            etf.setText("");
            sb.setEnabled(true);

            if (output != null) {
                output.dispose();
            }
        }
    }

    class btnOkay implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent e) {
            ftf.setText("");
            ltf.setText("");
            mtf.setText("");
            mntf.setText("");
            etf.setText("");
            sb.setEnabled(true);

            if (output != null) { 
                output.dispose();
            }
        }
    }

    public EventDriven() {
        setTitle("INPUT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);

        JPanel p = new JPanel(new FlowLayout());

        ftf = new JTextField(16);
        ltf = new JTextField(16);
        mtf = new JTextField(16);
        mntf = new JTextField(16);
        etf = new JTextField(16);
    
        sb = new JButton("Submit");
        JButton cl = new JButton("Clear All");

        p.add(new JLabel("First Name: ")); 
        p.add(ftf);

        p.add(new JLabel("Last Name: "));  
        p.add(ltf);

        p.add(new JLabel("Middle Name: ")); 
        p.add(mtf);

        p.add(new JLabel("Mobile Number: ")); 
        p.add(mntf);

        p.add(new JLabel("Email Address: ")); 
        p.add(etf);

        p.add(sb);
        p.add(cl);

        sb.addActionListener(new btnSubmit());
        cl.addActionListener(new btnClearAll());

        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventDriven();
    }
}
