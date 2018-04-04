package extras;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Random random = new Random();
		Robot bill = new Robot("mini");
		bill.setWindowColor(Color.BLACK);
		bill.setX(50);
		bill.setY(400);
		bill.hide();
		bill.penDown();
		bill.setSpeed(80);

		for (int i = 0; i < 16; i++) {
			int height = random.nextInt(251) + 50;
			if (height <= 150) {
				DrawPointy(height, bill);
			} else {
				DrawFlat(height, bill);
			}

		}
	}

	private static void DrawFlat(int height, Robot bill) {
		bill.setPenWidth(10);
		bill.setRandomPenColor();
		bill.move(height);
		bill.turn(90);
		bill.move(35);
		bill.turn(90);
		bill.move(height);
		bill.turn(-90);
		bill.setPenWidth(1);
		bill.setPenColor(Color.GREEN);
		bill.move(20);
		bill.setAngle(0);
	}

	private static void DrawPointy(int height, Robot bill) {
		bill.setPenWidth(10);
		bill.setRandomPenColor();
		bill.move(height);
		bill.turn(45);
		bill.move(25);
		bill.turn(90);
		bill.move(25);
		bill.setAngle(180);
		bill.move(height);
		bill.turn(-90);
		bill.setPenWidth(2);
		bill.setPenColor(Color.GREEN);
		bill.move(20);
		bill.setAngle(0);
	}
}
