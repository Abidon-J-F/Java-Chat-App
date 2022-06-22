package R4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.startConnection();
        Scanner userIn = new Scanner(System.in);
        String userLine;
        while (!(userLine = userIn.nextLine()).equalsIgnoreCase("exit")){
            System.out.println("Server response: " + client.sendRequest(userLine));
        }
    }
}
