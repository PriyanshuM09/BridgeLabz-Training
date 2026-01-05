package com.linkedlist.undoredo;

public class Main {
	    public static void main(String[] args) {

	        TextList editor = new TextList();

	        editor.addState("Hello");
	        editor.addState("Hello World");
	        editor.addState("Hello World!");
	        editor.addState("Hello World!!");
	        editor.displayCurrentState();
	        editor.undo();
	        editor.displayCurrentState();
	        editor.undo();
	        editor.displayCurrentState();
	        editor.redo();
	        editor.displayCurrentState();
	        editor.addState("Hello World!!!");
	        editor.displayCurrentState();
	    }
	}


