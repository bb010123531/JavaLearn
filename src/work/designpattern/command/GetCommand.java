package work.designpattern.command;

public class GetCommand extends AbstractCommand {
    public GetCommand(FTPServer server, String url) {
        super(server, url);
    }

    @Override
    protected void doExec() {
        server.doGet((String)params[0]);
    }
}
