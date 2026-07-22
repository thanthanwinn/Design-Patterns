package org.ttw.command;

public class CommandDemo {

	    public static void main(String[] args) {

	        TextEditor editor = new TextEditor();

	        editor.setText("Hello");

	        EditorInvoker invoker = new EditorInvoker();

	        invoker.execute(new CopyCommand(editor));

	        invoker.execute(new CutCommand(editor));

	        System.out.println(editor.getText());

	        invoker.undo();

	        System.out.println(editor.getText());

	        invoker.execute(new PasteCommand(editor, " Java"));

	    }

	}
