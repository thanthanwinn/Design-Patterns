package org.ttw.command;


public class TextEditor {
	
	private String text = "";
	
	public void setText(String text) {
		this.text=text;
	}
	
	public String getText() {
		return this.text;
	}
	
	
	public void copy() {
	   System.out.println("Copied: " + text);
	}
	
	
	  public void cut() {
	        System.out.println("Cut: " + text);
	        text = "";
	    }
	  
	  
	  public void paste(String value) {
	        text += value;
	        System.out.println("Current Text: " + text);
	    }
	

}
