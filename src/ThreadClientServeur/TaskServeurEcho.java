package ThreadClientServeur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TaskServeurEcho implements Runnable {
    private Socket client;

    public TaskServeurEcho(Socket client) {
        this.client = client;
    }

    public void run() {
        String chaine;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

            while ((chaine = in.readLine()) != null) {

                if (chaine.equals("quit"))
                    break;

            }

            out.close();
            in.close();
            client.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}