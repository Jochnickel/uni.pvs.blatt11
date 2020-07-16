package de.jj22.uni.pvs.blatt11;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FancyMouseoverButton extends Button {

	private static final String defaultText = "Knopf";
	private static final int minWidth = 400;
	
	public FancyMouseoverButton() {
		super(defaultText);
		this.setMinWidth(minWidth);
		this.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println(event);
				textProperty().set(String.format("X: %.0f Y: %.0f",event.getSceneX(),event.getSceneY()));
			}
		});

		this.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				textProperty().set(defaultText);
			}
		});

	}

}
