import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import SettingsClass.ClientSettings;

public class AppClient {
    private Socket socket = null;
    private static final String GREETING_MSG = "Hello, im the client";

    public AppClient() { }
    public AppClient(String hostName, int port) throws UnknownHostException, IOException {
        Socket socket = new Socket(hostName, port);
        this.socket = socket;
    }

    public Socket getSocket() { return this.socket; }
    public void setSocket(Socket socket) { this.socket = socket; }

    public int checkConnection() throws IOException {
        if(socket == null) {
            System.out.println("Error on Client.socket");
            return -1;
        }

        PrintWriter out = new PrintWriter(getSocket().getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));

        out.println(GREETING_MSG);
        String line = in.readLine();
        System.out.println(line);

        out.close();
        in.close();

        return 0;
    }

    public void closeSocket() throws IOException{
        this.getSocket().close();
    }

    public ClientSettings getSettings() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));

        String settings = in.readLine();
        
        if(settings != null) {
            ClientSettings cs = new ClientSettings(settings);
            return cs;
        } else { return null; }
    }
}