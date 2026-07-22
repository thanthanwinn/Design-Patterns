package org.ttw.command;

public class PasteCommand implements Command {

    private TextEditor editor;

    private String value;

    private String backup;

    public PasteCommand(TextEditor editor, String value) {
        this.editor = editor;
        this.value = value;
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.paste(value);
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }

}
