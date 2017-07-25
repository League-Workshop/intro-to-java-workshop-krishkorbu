package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class myfirstjava {

	public static void main(String[] args) {
		Robot puttputt = new Robot();
		puttputt.setSpeed(100);
		puttputt.sparkle();
		puttputt.penDown();
		
		
		for (int i=0; i < 6;i++){
		puttputt.move(200);	
		puttputt.turn(360/6);
		}
	}

	
}
