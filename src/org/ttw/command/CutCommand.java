package org.ttw.command;

public class CutCommand implements Command {

    private TextEditor editor;

    private String backup;

    public CutCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.cut();
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }

}