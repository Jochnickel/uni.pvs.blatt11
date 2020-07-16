package de.jj22.uni.pvs.blatt11;

public class Color {
	public final static Color BLUE = new Color(javafx.scene.paint.Color.DARKBLUE, "Blau");
	public final static Color GREEN = new Color(javafx.scene.paint.Color.GREEN, "Gr�n");
	public final static Color RED = new Color(javafx.scene.paint.Color.DARKRED, "Rot");

	public final javafx.scene.paint.Color color;
	public final String label;

	public Color(javafx.scene.paint.Color color, String label) {
		this.color = color;
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}