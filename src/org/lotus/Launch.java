package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Button;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setLocationRelativeTo(null); //put in center of screen
				Button b = new Button("Press ctrl + c on terminal to exit"); //new label
				f.add(b); //add button to frame
				f.pack(); //set auto width, height
				f.setVisible(true); //show to the user
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
