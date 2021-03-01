package _02_Chat_Application.gui;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApp implements ActionListener
{
    /*
    Create a set of buttons, one for the server, and one for the client
    The buttons will create one of two new JFrames, a client window, or a server window.
    Above the buttons, include a JInput area to write messages back and forth
    print out the messages in the console
    use UTF.write method to write messages between the client and server
    use UTF.read method to print to the console
    include an actionlistener for the buttons that will start a client or a server depending on the button pressed

1. find the output stream and input streams used in button clicker
2. Convert the text in the client and server windows into a data stream
3. create an input in the server window that receives a port number and the ip address
4. Create an input in the client to enter the ip address and port number
5. send the converted input stream from the client to the serveer and vice versa
6. display the results as a JOptionPane message.
    */
    private static ChatAppResources chatAppResources = new ChatAppResources();
    static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static JFrame chatSetupFrame = new JFrame();
    private static JPanel chatPanel = new JPanel();
    private static JButton serverButton = new JButton("Start a server");
    private static JButton clientButton = new JButton("Start a client");
    private static JTextField textField = new JTextField(20);

    public static void main(String[] args)
    {
        ChatApp chatApp = new ChatApp();
        chatApp.componentHolder();
    }

    public void componentHolder(){
        serverButton.addActionListener(this);
        clientButton.addActionListener(this);
        FlowLayout chatLayoutManager = new FlowLayout();
        chatSetupFrame.add(chatPanel);
        chatPanel.add(serverButton);
        chatPanel.add(clientButton);
        chatPanel.add(textField);
        chatPanel.setLayout(chatLayoutManager);
        chatSetupFrame.pack();
        chatSetupFrame.setLocation(screenSize.width/2- chatSetupFrame.getWidth()/2,screenSize.height/2- chatSetupFrame.getHeight()/2);
        chatSetupFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(serverButton)){
            System.out.println("ServerButton clicked");
            chatAppResources.ServerWindow();
        }
        if(e.getSource().equals(clientButton)){
            System.out.println("ClientButton clicked");
            chatAppResources.ClientWindow();
        }

    }
}
