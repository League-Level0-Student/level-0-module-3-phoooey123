import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Robot bill = new Robot();

	public static void main(String[] args) {
		bill.penDown();

		String shape = JOptionPane.showInputDialog("What shape should I draw?");
		if (shape.equals("square")) {
			drawSquare();
		} else if (shape.equals("triangle")) {
			drawTriangle();
		} else if (shape.equals("circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {

			bill.move(100);
			bill.turn(90);
		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			bill.move(100);
			bill.turn(120);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 180; i++) {
			bill.move(2);
			bill.turn(2);
		}
	}
}
