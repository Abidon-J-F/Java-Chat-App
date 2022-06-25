package R4.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket clientSocket;

    public ClientHandler(Socket clientSocket){
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        PrintWriter out = null;
        BufferedReader in = null;

        try{
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String clientRequest;
            while((clientRequest = in.readLine()) != null){
                //Request handling happens here
                out.println("server received message: " + clientRequest);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //closing all streams to free resources
            if(out != null){
                out.close();
            }
            if(in != null){
                try {
                    in.close();
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

