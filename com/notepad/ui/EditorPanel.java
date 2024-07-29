package com.notepad.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;


public class EditorPanel extends JPanel{
	private JTextArea textArea;
	public EditorPanel(){
		this.textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea),BorderLayout.CENTER);
	}
	public JTextArea getTextArea(){
		return this.textArea;  
	}
}