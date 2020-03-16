package work.designpattern.command;

public class FTPServer {

    public void doGet(String url) {
        System.out.println("ftp get " + url + " ...");
    }

    public void doPut(String url) {
        System.out.println("ftp put " + url + " ...");
    }

    public void doLs() {
        System.out.println("ftp ls ...");
    }

    public void doQuit() {
        System.out.println("ftp quit ...");
    }
}
