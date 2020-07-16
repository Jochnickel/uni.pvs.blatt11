package de.jj22.uni.pvs.blatt11.board;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Student implements Observer {
	final String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		thinkAbout((String)arg);

	}

	public void thinkAbout(String message) {
		System.out.printf("%s thinks about what was on the board: \"%s\"\n", name, message);
	}

	public void observeBoard(Board board) {
		board.addObserver(this);
		System.out.printf("%s registered on the board.\n",name);
	}
	
	public void stopObservingBoard(Board board) {
		board.deleteObserver(this);
		System.out.printf("%s unregistered from the board.\n",name);
	}

}