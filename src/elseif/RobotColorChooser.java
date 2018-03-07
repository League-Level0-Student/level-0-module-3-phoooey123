//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot bill = new Robot();
		bill.penDown();
		bill.miniaturize();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 10; i > 0; i--) {
			String answer = JOptionPane.showInputDialog("What color do you want the robot to draw?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (answer.equals("red")) {
				bill.setPenColor(Color.red);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else if (answer.equals("")) {
				bill.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			bill.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int x = 0; x < 3; x++) {
				bill.move(100);
				bill.turn(120);
			}
		}
	}
}
