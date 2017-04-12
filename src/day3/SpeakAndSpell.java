package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
String mandlebrot = "spell mandlebrot";
speak(mandlebrot);
System.out.println(mandlebrot);
		// 2. Catch the user's answer in a String
String spelling;
spelling = JOptionPane.showInputDialog("what is the spelling?");
System.out.println(spelling);

		// 3. If the user spelled the word correctly, speak "correct"
if(spelling.equals("mandlebrot")){
String correct = "correct";
speak(correct);
System.out.println(correct);}
		// 4. Otherwise say "wrong"
else{
	speak("incorrect");
	System.out.println("incorrect");}

		// 5. repeat the process for other words
		
	String progressive = "spell progressive";
	speak(progressive);
	System.out.println(progressive);
	String spell;
	spell = JOptionPane.showInputDialog("What is the spelling?");
	if(spell.equals("progressive")){
	String correct = "correct";
	speak(correct);
	System.out.println(correct);}
	else{speak("incorrect");
	System.out.println("incorrect");
	
	String barbaric = "spell barbaric";
	speak(barbaric);
	System.out.println(barbaric);
	String thespelling;
	thespelling = JOptionPane.showInputDialog("What is the spelling?");
	if(thespelling.equals(barbaric)){
	String correct = "correct";
	speak(correct);
	System.out.println(correct);
	else{speak("incorrect");
	System.out.println("correct");
	}
	}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


