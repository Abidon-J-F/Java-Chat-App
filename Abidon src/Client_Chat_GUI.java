import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client_Chat_GUI extends JFrame implements ActionListener {

    JFrame ccgframe = new JFrame();

    JPanel centerpnl = new JPanel(new GridBagLayout());
    JPanel southpnl = new JPanel(new GridBagLayout());

    JPanel toppnl = new JPanel(new GridBagLayout());

    JPanel eastpnl = new JPanel(new GridBagLayout());

    Font LabelFnt = new Font("Times New Roman", Font.PLAIN, 30);

    JLabel lblUserNameDisplay = new JLabel();

    JButton btnConnect = new JButton("Connect");
    JButton btnClose = new JButton("Close");

    JButton btnSend = new JButton("Send");
    JButton btnExit = new JButton("Exit");
    JTextField txtInputUserName = new JTextField(50);
    JTextField txtMessageBox = new JTextField(100);

    public GridBagConstraints gbc;

    public JTextArea txtChatBox = new JTextArea(40, 150);

    JScrollPane textAreaSP = new JScrollPane(txtChatBox);

    Login_GUI main;

    public Client_Chat_GUI(Login_GUI m) {
        main = m;
        Client_GUI();
    }

    private void Client_GUI(){

        btnConnect.addActionListener(this);
        btnExit.addActionListener(this);

        btnClose.addActionListener(this);
        btnSend.addActionListener(this);


        lblUserNameDisplay.setText("Welcome (UserName)");
        lblUserNameDisplay.setFont(LabelFnt);

        txtChatBox.setEditable(false);

        textAreaSP.setPreferredSize(new Dimension(1200,600));

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(15,15, 15, 15);

        //Top Panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        toppnl.add(lblUserNameDisplay,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        toppnl.add(txtInputUserName,gbc);

        gbc.gridx = 50;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        toppnl.add(btnConnect,gbc);

        //East
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        eastpnl.add(btnClose,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        eastpnl.add(btnExit,gbc);

        //Centre
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        centerpnl.add(textAreaSP,gbc);


        //South
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(txtMessageBox,gbc);

        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnSend,gbc);

        ccgframe.add(toppnl, BorderLayout.NORTH);
        ccgframe.add(centerpnl, BorderLayout.CENTER);
        ccgframe.add(southpnl, BorderLayout.SOUTH);
        ccgframe.add(eastpnl, BorderLayout.EAST);



        ccgframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ccgframe.setTitle("Local Client Side ChatApp"); //Add a new Title
        ccgframe.pack();
        ccgframe.setVisible(true);
        ccgframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnConnect) {

        }

        if (ae.getSource() == btnSend) {
        }

        if (ae.getSource() == btnExit) {
            System.exit(0);
        }

        if (ae.getSource() == btnClose) {
            ccgframe.setVisible(false);
            main.frame.setVisible(true);
        }

    }

}
