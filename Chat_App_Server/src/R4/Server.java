package R4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public void startServer(int portNum) throws IOException {
        //creates a server socket that listens on the specified port.
        serverSocket = new ServerSocket(portNum);
        //skips waiting for 120s socket timeout after connection termination
        serverSocket.setReuseAddress(true);

        //while loop handles multiple requests from clients by creating different threads for each
        while (true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("New connection: " + clientSocket.getInetAddress().getHostName());
            //creates an instance of client handler
            ClientHandler client = new ClientHandler(clientSocket);
            //starts a new thread
            new Thread(client).start();
        }
    }

    //Method used to close the server socket
    public void stopServer(){
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


