import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
	public static void main(String[] args) {
		Robot bob = new Robot("mini");
		bob.moveTo(80, 50);
		bob.move(-200);
		bob.setSpeed(10);
		bob.penDown();
		
	
}
}
