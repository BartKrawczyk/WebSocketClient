import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Launcher {

    public Launcher() {
        try {
            initiateConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initiateConnection() throws IOException {
        Socket socket = new Socket("127.0.0.1", 6700);
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());
        br.close();
    }
}
