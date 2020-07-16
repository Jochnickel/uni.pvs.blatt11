package de.jj22.uni.pvs.blatt11.board;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Board extends Observable {
	private String message = "";
	
	public void changeMessage(String message) {
		this.message = message;
		setChanged();
		notifyObservers(this.message);
	}
}