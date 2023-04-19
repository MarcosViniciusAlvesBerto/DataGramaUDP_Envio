package principal;

import java.io.*;
import java.net.*;
import javax.swing.*;

import java.net.DatagramSocket;

public class Envio {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket con = new DatagramSocket();//cria o objeto
        System.out.println("Inicio cliente");
        String mensagem = "";
        while (!mensagem.equals("fim")) {
            mensagem = JOptionPane.showInputDialog("Digite a Mensagem ou fim para sair");
//Converte a mensagem em um vetor de byte
            byte dado[] = mensagem.getBytes();
//Configura o pacote
            DatagramPacket pacote = new DatagramPacket(dado,
                    dado.length, InetAddress.getByName("10.150.127.255"), 62720);
            con.send(pacote); //envia o pacote
        }
    }
}

    
 