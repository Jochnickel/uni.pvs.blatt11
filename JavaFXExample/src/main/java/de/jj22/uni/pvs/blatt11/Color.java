package de.jj22.uni.pvs.blatt11;

public class Color {
	final static Color BLUE = new Color(javafx.scene.paint.Color.DARKBLUE, "Blau");
	final static Color GREEN = new Color(javafx.scene.paint.Color.GREEN, "Grün");
	final static Color RED = new Color(javafx.scene.paint.Color.DARKRED, "Rot");

	final javafx.scene.paint.Color color;
	final String label;

	public Color(javafx.scene.paint.Color color, String label) {
		this.color = color;
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}
