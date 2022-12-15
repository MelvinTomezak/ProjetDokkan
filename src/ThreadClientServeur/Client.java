package ThreadClientServeur;

import JavKkan.Jeu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    String hostname;
    int port;

    public Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void lancer() throws UnknownHostException, IOException {

        Socket socketClient = new Socket(hostname, port);
        String bufSend;
        String bufReceived = "";

        // BufferedReader pour lire depuis le clavier
        BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));

        BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));

        while (true) {
            // lecture depuis le clavier
            bufSend = clavier.readLine();

            out.write(bufSend);
            // rajouter un saut de ligne pour pouvoir utiliser readline c�t� serveur
            out.newLine();
            // vider le buffer
            out.flush();
            // lire la chaine envoy�e par le serveur
            bufReceived = "c'est parti";

            if (bufReceived.equals("c'est parti")  && bufSend.equals("lancer"))
                new Jeu();
            if (bufSend.equals("quit"))
                break;

        }
        in.close();
        out.close();
        clavier.close();
        socketClient.close();

    }

    public static void main(String[] args) throws UnknownHostException, IOException {

        Client client = new Client("127.0.0.1", 10007);

        client.lancer();

    }

}
