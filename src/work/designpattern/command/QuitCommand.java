package work.designpattern.command;

public class QuitCommand extends AbstractCommand {
    public QuitCommand(FTPServer server) {
        super(server);
    }

    @Override
    protected void doExec() {
        server.doQuit();
    }
}
