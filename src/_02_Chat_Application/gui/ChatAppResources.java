package _02_Chat_Application.gui;

import javax.swing.*;

public class ChatAppResources extends ChatApp
{
    public void ServerWindow(){
        JFrame serverFrame = new JFrame("Server");
        JPanel serverPanel = new JPanel();
        JTextArea messageArea = new JTextArea();
        JButton sendButton = new JButton();
        serverPanel.add(messageArea);
        serverPanel.add(sendButton);
        serverPanel.add(messageArea);
        serverPanel.add(sendButton);
        serverFrame.pack();
        serverFrame.setVisible(true);

    }
    public void ClientWindow(){
        JFrame clientFrame = new JFrame("Client");
        JTextArea messageArea = new JTextArea();
        JButton sendButton = new JButton();
        clientFrame.add(messageArea);
        clientFrame.add(sendButton);
        clientFrame.setVisible(true);
        clientFrame.setSize(300,140);
        clientFrame.pack();
    }
}
