package work.designpattern.command;

public class PutCommand extends AbstractCommand {
    public PutCommand(FTPServer server, String url) {
        super(server, url);
    }

    @Override
    protected void doExec() {
        server.doPut((String)params[0]);
    }
}
