package de.jj22.uni.pvs.blatt11.radio;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;

import de.jj22.uni.pvs.blatt11.Color;
import de.jj22.uni.pvs.blatt11.TriggeredListFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Paint;

public class FancyColorRadioGroupFactory implements TriggeredListFactory<Color> {
	private static final Paint txtColor = javafx.scene.paint.Color.WHITE;

	@Override
	public Collection<Node> create(Consumer<Color> onItemChosen, Color... listItems) {

		final var list = new LinkedList<Node>();
		final var tg = new ToggleGroup();

		for (Color color : listItems) {

			final var btn = new RadioButton(color.label);
			btn.setToggleGroup(tg);
			btn.setTextFill(txtColor);

			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					if (tg.getSelectedToggle() == btn) {
						onItemChosen.accept(color);
					}
				}
			});

			list.add(btn);

		}

		return list;
	}
}