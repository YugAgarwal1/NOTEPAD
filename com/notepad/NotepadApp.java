package com.notepad;

import javax.swing.JFrame;
import com.notepad.ui.NotepadFrame;
 public class NotepadApp { 
    public static void main(String[]args){
        JFrame frame  = new NotepadFrame();
        frame.setTitle("Notepad");
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  //doubt
    }
 }


