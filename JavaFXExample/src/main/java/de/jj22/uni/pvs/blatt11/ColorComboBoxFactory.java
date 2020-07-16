package de.jj22.uni.pvs.blatt11;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;

public class ColorComboBoxFactory implements TriggeredListFactory<Color> {

	@Override
	public Collection<Node> create(Consumer<Color> onAction, Color... listItems) {
		final var out = new LinkedList<Node>();
		final var comboBox = new ComboBox<>();
		for (var color : listItems) {
			comboBox.getItems().add(color);
		}
		comboBox.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				onAction.accept((Color) comboBox.getValue());
			}
		});
		out.add(comboBox);
		return out;
	}
}
