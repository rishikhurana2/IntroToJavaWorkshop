package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {String name;
		name = JOptionPane.showInputDialog("Well Hi there");
		System.out.println(name);
		JOptionPane.showMessageDialog(null,"Hello "+name);
	}

}
