import javax.swing.*;

public class ProgramHandler {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login_GUI lg = new Login_GUI();
            }

        });

    }
}
