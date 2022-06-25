package R4;

import R4.Server.Server;


public class Main {


    public static void main(String[] args) {
        Server server = new Server();
        MailServer mailServer = new MailServer();

        mailServer.sendMail("Mail goes here");
        //DataBaseHandler db = new DataBaseHandler();
/*
        System.out.println("Server listening for connections:");
        try {
            server.startServer(4000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            server.stopServer();
        }
 */

    }
}
