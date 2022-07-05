import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_GUI extends JFrame implements ActionListener {

    JFrame frame = new JFrame();

    JPanel centerpnl = new JPanel(new GridBagLayout());
    JPanel southpnl = new JPanel(new GridBagLayout());


    Font LabelFnt = new Font("Times New Roman", Font.PLAIN, 20);

    JLabel lblUsernameAndEmail = new JLabel();
    JLabel lblPassword = new JLabel();
    JLabel lblConfirmPassword = new JLabel();

    JButton btnEnter = new JButton("Enter");
    JButton btnExit = new JButton("Exit");

    JTextField txtUsernameAndEmail = new JTextField(30);
    JTextField txtPassword = new JTextField(30);
    JTextField txtConfirmPassword = new JTextField(30);

    public GridBagConstraints gbc;

    public Login_GUI() {
        GUI_Client();
    }

    private void GUI_Client(){

    btnEnter.addActionListener(this);
    btnExit.addActionListener(this);

    lblUsernameAndEmail.setText("Username/Email");
    lblUsernameAndEmail.setFont(LabelFnt);

    lblPassword.setText("Password");
    lblPassword.setFont(LabelFnt);

    lblConfirmPassword.setText("Confirm Password");
    lblConfirmPassword.setFont(LabelFnt);

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(15,15, 15, 15);

        //Center
        //Username/Email
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(lblUsernameAndEmail,gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(txtUsernameAndEmail,gbc);

        //Password
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(lblPassword,gbc);

        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(txtPassword,gbc);

        //Confirm Password
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(lblConfirmPassword,gbc);

        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(txtConfirmPassword,gbc);

        //South
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnEnter,gbc);

        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnExit,gbc);


        frame.add(centerpnl, BorderLayout.CENTER);
        frame.add(southpnl, BorderLayout.SOUTH);


        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Local Client to Server ChatApp"); //Add a new Title
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnEnter) {
            Client_Chat_GUI ccg = new Client_Chat_GUI(this);
            frame.setVisible(false);

            /*if (txtUsernameAndEmail != "something something database") {
                JOptionPane.showMessageDialog(null, "Username/Email not recognised");
            }
            if (txtPassword != "something something database"){
                JOptionPane.showMessageDialog(null, "Incorrect Password");
            }
            //Logic error for this If Statement.
            for (int txtPassword = 0; t < txtConfirmPassword.length();){

            }
            if (txtConfirmPassword == txtPassword) {
                JOptionPane.showMessageDialog(null, "Access Granted");
            } else {
                JOptionPane.showMessageDialog(null, "Re-Input your Confirmation Password");
            }*/

        }
        if (ae.getSource() == btnExit) {
            System.exit(0);
        }
    }
}
