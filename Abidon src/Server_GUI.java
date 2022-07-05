import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server_GUI extends JFrame implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Server_GUI sg = new Server_GUI();
            }

        });

    }


    JFrame sgframe = new JFrame();

    JPanel centerpnl = new JPanel(new GridBagLayout());
    JPanel southpnl = new JPanel(new GridBagLayout());
    JPanel toppnl = new JPanel(new GridBagLayout());

    Font LabelFnt = new Font("Times New Roman", Font.PLAIN, 30);

    JLabel lblServerNameDisplay = new JLabel();

    JButton btnActivate = new JButton("Activate Server");
    JButton btnDeactivate = new JButton("Deactivate Server");

    JButton btnOnlineUsers = new JButton("Online Users");
    JButton btnExit = new JButton("Exit");

    public GridBagConstraints gbc;

    public JTextArea txtServerBox = new JTextArea(40, 150);

    JScrollPane textAreaSP = new JScrollPane(txtServerBox);

    //Server_GUI main;

    public Server_GUI(){//Server_GUI m) {
       // main = m;
        Client_GUI();
    }

    private void Client_GUI(){

        btnActivate.addActionListener(this);
        btnExit.addActionListener(this);

        btnDeactivate.addActionListener(this);
        btnOnlineUsers.addActionListener(this);


        lblServerNameDisplay.setText("Server");
        lblServerNameDisplay.setFont(LabelFnt);

        txtServerBox.setEditable(false);

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
        toppnl.add(lblServerNameDisplay,gbc);


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
        southpnl.add(btnActivate,gbc);

        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnDeactivate,gbc);

        gbc.gridx = 20;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnOnlineUsers,gbc);

        gbc.gridx = 30;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.gridwidth = 4;
        gbc.fill = 4;
        southpnl.add(btnExit,gbc);


        sgframe.add(toppnl, BorderLayout.NORTH);
        sgframe.add(centerpnl, BorderLayout.CENTER);
        sgframe.add(southpnl, BorderLayout.SOUTH);



        sgframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sgframe.setTitle("Local Server Side ChatApp"); //Add a new Title
        sgframe.pack();
        sgframe.setVisible(true);
        sgframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnActivate) {

        }

        if (ae.getSource() == btnDeactivate) {
        }

        if (ae.getSource() == btnExit) {
            System.exit(0);
        }

        if (ae.getSource() == btnOnlineUsers) {
        }

    }
}
