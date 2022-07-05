import javax.swing.*;

public class ProgramHandler {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Welcome to our Definitely not a WhatsApp rip-off program"); //lol change this :p
                Chat_Client_GUI ccg = new Chat_Client_GUI();
            }

        });

    }
}
