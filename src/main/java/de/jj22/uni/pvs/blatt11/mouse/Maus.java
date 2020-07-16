package de.jj22.uni.pvs.blatt11.mouse;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Maus extends Application {

	private static final int SCENE_WIDTH = 400;
	private static final int SCENE_HEIGHT = 400;

	@Override
	public void start(Stage primaryStage) {
		final var pane = new VBox();
		final var scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

		final var textArea = new TextArea("Lorem ipsum im Ferrari mit Spiritus Amen");
		final Button button1 = new FancyClickButton("click me, i am better",textArea);
		final Button button2 = new FancyMouseoverButton();
		
		pane.getChildren().add(textArea);
		pane.getChildren().add(button1);
		pane.getChildren().add(button2);

		primaryStage.setTitle("Hier kommt die Maus!");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}