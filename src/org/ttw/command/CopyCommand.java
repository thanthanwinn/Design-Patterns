package org.ttw.command;

public class CopyCommand implements Command {

    private TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }

    @Override
    public void undo() {
        // nothing to undo
    }
}
