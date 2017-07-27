package day3;

import javax.swing.JOptionPane;

public class quizgame {
	public static void main(String[] args) {

		String question1 = JOptionPane
				.showInputDialog("Which FPS Game was created on 2012 which people still play today.");
		if (question1.equals("CS:GO")) {
			JOptionPane.showMessageDialog(null, "Correct!");

		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is CS:GO! Come on!");
		}
		
		String question2 = JOptionPane.showInputDialog("Which game is Steve and Alex in?");
		if (question2.equals("Minecraft")) {
			JOptionPane.showMessageDialog(null, "Correct!");

		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The Answer was Minecraft! Seriously you didn't know that.");
		}
		
		String question3 = JOptionPane.showInputDialog("Last question: Which game is Scout from?");
		if (question3.equals("TF2")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is TF2! Step it up");

		}
	}
}
