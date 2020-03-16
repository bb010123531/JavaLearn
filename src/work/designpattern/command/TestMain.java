package work.designpattern.command;

import sun.net.ftp.FtpClient;

public class TestMain {

    public static void main(String[] args) {
        FTPServer server = new FTPServer();

        FTPClient client = new FTPClient();
        client.addCommand(new GetCommand(server, "getUrl"));
        client.addCommand(new PutCommand(server,"putUrl"));
        client.addCommand(new QuitCommand(server));

        client.exec();
    }
}
