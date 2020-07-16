package de.jj22.uni.pvs.blatt11;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
//		ComboBreaker.main(args);
//		RadioVideo.main(args);
		Maus.main(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
//		new ComboBreaker().start(arg0);
//		new RadioVideo().start(arg0);
		new Maus().start(arg0);
	}
}
