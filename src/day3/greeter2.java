package day3;

import javax.swing.JOptionPane;

public class greeter2 {

	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("Whats your name?");
		System.out.println("Hello " + name);
		String phone = JOptionPane.showInputDialog("Whats your phone number?");
		System.out.println("Thanks for your phone number is it " + phone);
		String house = JOptionPane.showInputDialog("Where do you live?");
	}

}
