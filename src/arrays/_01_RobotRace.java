package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int robotnumber = 0;

	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] bots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bots.length; i++) {
			bots[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			bots[i].setY(600);
			bots[i].setX(i*200+100);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		
		while (bots[robotnumber].getY()>=0) {
			for (int i1 = 0; i1 < bots.length; i1++) {
				robotnumber = i1;
				Random rand = new Random();
				int value = rand.nextInt(50);
				bots[i1].move(value);
				if(bots[i1].getY()<=10) {
					System.out.println("Bot "+i1+"is the winner!");
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
