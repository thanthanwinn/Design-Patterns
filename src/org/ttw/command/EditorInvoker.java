package org.ttw.command;

import java.util.Stack;

public class EditorInvoker {

    private Stack<Command> history = new Stack<>();

    public void execute(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {

        if (!history.isEmpty()) {
            history.pop().undo();
        }

    }

}
