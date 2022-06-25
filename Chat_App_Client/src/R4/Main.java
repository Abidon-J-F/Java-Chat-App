package R4;

import R4.Gui.ClientGui;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.startConnection();
        Scanner userIn = new Scanner(System.in);
        ClientGui cl = new ClientGui();
        String userLine;
        while (!(userLine = userIn.nextLine()).equalsIgnoreCase("exit")){
            System.out.println("Server response: " + client.sendRequest(userLine));
        }
    }
}
