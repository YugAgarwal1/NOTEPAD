package com.notepad.ui;
import java.awt.*;
import javax.swing.JFrame;
public class NotepadFrame extends JFrame{
	private EditorPanel editorPanel;
	public NotepadFrame(){
		this.editorPanel  = new EditorPanel();
		add(editorPanel,BorderLayout.CENTER);
		setJMenuBar(new MenuBar(editorPanel));
	}
}