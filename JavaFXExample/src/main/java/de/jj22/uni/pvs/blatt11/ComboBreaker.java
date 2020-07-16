package de.jj22.uni.pvs.blatt11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ComboBreaker extends Application {

	private static final int SCENE_WIDTH = 400;
	private static final int SCENE_HEIGHT = 400;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		final var pane = new StackPane();
		final var scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

		final var comboBox = new ColorComboBoxFactory().create(
				c -> pane.setBackground(new Background(new BackgroundFill(c.color, null, null))), Color.RED,
				Color.GREEN, Color.BLUE);

		pane.getChildren().addAll(comboBox);

		primaryStage.setTitle("RIP Combo (Breaking Bad)!!");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
