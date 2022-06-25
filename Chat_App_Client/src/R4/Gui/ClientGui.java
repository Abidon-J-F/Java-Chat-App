package R4.Gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ClientGui{

    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 500;

    public ClientGui(){
        createClientGui();
    }

    private void createClientGui(){
        JFrame guiFrame = new JFrame("ChatApp");
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        guiFrame.setResizable(false);
        guiFrame.getContentPane().setBackground(Color.decode("#40a2d6"));

        guiFrame.add(createLoginPane());

        guiFrame.setVisible(true);
    }


    private JLabel createAppLabel(){
        JLabel label = new JLabel("Chat App");
        label.setFont(new Font("Serif", Font.BOLD, 28));
        label.setForeground(Color.WHITE);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        return label;
    }

    private JPanel createLoginArea(){
        JPanel loginArea = new JPanel();
        loginArea.setLayout(new BoxLayout(loginArea, BoxLayout.PAGE_AXIS));
        loginArea.setMinimumSize(new Dimension(200,200));
        loginArea.setBorder(new LineBorder(Color.BLACK, 2, true));
        return loginArea;
    }

    private JPanel createLoginPane(){
        JPanel loginPage = new JPanel();
        loginPage.setLayout(new BoxLayout(loginPage, BoxLayout.PAGE_AXIS));
        loginPage.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        loginPage.setBackground(Color.decode("#40a2d6"));
        loginPage.add(createAppLabel());
        loginPage.add(createLoginArea());
        return loginPage;
    }

}
