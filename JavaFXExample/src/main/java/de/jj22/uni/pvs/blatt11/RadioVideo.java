package de.jj22.uni.pvs.blatt11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * @author System of a Down
 */
public class RadioVideo extends Application {

	private static final int SCENE_WIDTH = 400;
	private static final int SCENE_HEIGHT = 400;
	private static final Paint defaultBgColor = javafx.scene.paint.Color.GRAY;


	@Override
	public void start(Stage primaryStage) throws Exception {

		final var pane = new VBox();
		final var scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

		pane.setBackground(new Background(new BackgroundFill(defaultBgColor, null, null)));
		pane.getChildren()
				.addAll(new FancyColorRadioGroupFactory().create(
						c -> pane.setBackground(new Background(new BackgroundFill(c.color, null, null))), Color.RED,
						Color.GREEN, Color.BLUE));

		
		primaryStage.setTitle("Radio Gaga");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
