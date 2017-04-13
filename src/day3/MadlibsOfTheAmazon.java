package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
String adjective;
String liquid;
String bodypart;
String verb;
String place;
JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
adjective = JOptionPane.showInputDialog("Please type an adjective to continue");
System.out.println(adjective);
		// Get the user to enter a type of liquid
liquid = JOptionPane.showInputDialog("Now enter a liquid");
System.out.println(liquid);
		// Get the user to enter a body part
bodypart = JOptionPane.showInputDialog("Now enter a body part");
System.out.println(bodypart);
		// Get the user to enter a verb
verb = JOptionPane.showInputDialog("Now give me a verb");
System.out.println(verb);
		// Get the user to enter a place
place = JOptionPane.showInputDialog("Now enter a place");
System.out.println(place);
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null,"Piranhas are more "+adjective+" during the day, so cross the river at night. Piranhas are attracted to fresh "+liquid+" and will most likely take a bite out of your "+bodypart+" if you "+verb+". Whatever you do, if you have an open wound, try to find another way to get back to the "+place+". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

