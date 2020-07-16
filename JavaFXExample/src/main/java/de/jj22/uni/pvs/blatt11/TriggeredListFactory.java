package de.jj22.uni.pvs.blatt11;

import java.util.Collection;
import java.util.function.Consumer;

import javafx.scene.Node;

public interface TriggeredListFactory<T> {
	public Collection<Node> create(Consumer<T> onAction, @SuppressWarnings("unchecked") T ...listItems) ;
}
