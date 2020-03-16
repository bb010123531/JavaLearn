package work.designpattern.command;

public abstract class AbstractCommand implements ICommand {

    protected FTPServer server;

    protected Object[] params;

    public AbstractCommand(FTPServer server) {
        this.server = server;
    }

    public AbstractCommand(FTPServer server, Object... params) {
        this.server = server;
        this.params = params;
    }

    @Override
    public void exec() {
        this.doExec();
    }

    protected abstract void doExec();
}
