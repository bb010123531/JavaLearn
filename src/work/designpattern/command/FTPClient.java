package work.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class FTPClient {

    List<ICommand> commandList = new ArrayList<>();

    public void addCommand(ICommand command) {
        commandList.add(command);
    }

    public void exec() {
        if (commandList.size() == 0) {
            return;
        }

        for (ICommand command : commandList) {
            command.exec();
        }
    }
}
