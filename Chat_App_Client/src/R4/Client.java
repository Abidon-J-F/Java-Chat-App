package R4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private final int PORT_NUM = 4000;
    private final String SERVER_IP = "localhost";
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(){
        try{
            socket = new Socket(SERVER_IP,PORT_NUM);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public String sendRequest(String request){
        out.println(request);
        String response = null;
        try {
            response = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    public void terminateConnection(){
        try {
            socket.close();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
