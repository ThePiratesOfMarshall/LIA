import java.io.IOException;
import java.net.UnknownHostException;

import SettingsClass.ClientSettings;

public class TestClient {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int PORT = 9090;

    public static void main(String[] args) {
        try {
            AppClient client = new AppClient(SERVER_IP, PORT);

            ClientSettings cs = client.getSettings();
            System.out.println(cs);

            client.closeSocket();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
