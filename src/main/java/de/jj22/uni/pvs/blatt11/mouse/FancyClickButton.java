package de.jj22.uni.pvs.blatt11.mouse;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class FancyClickButton extends Button {
	private Boolean pressed = null;
	private Boolean entered = null;
	private long clicked = 0;
	private static final int minWidth = 400;

	public FancyClickButton(String name, TextArea textArea) {
		super(name);
		this.setMinWidth(minWidth);

		final Runnable updateText = () -> textArea.setText(String
				.format("Mouse pressed: %b \nMouse clicked: %s \nMouse entered: %b \n", pressed, clicked, entered));

		this.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				pressed = true;
				updateText.run();
			}

		});

		this.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				pressed = false;
				updateText.run();
			}
		});

		this.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				clicked++;
				updateText.run();
			}
		});

		this.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				entered = true;
				updateText.run();
			}
		});

		this.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				entered = false;
				updateText.run();

			}
		});

	}
}