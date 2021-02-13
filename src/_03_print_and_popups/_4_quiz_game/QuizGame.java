package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
        int score=0;

		// ASK A QUESTION AND CHECK THE ANSWER
        String answer = JOptionPane.showInputDialog(null, "what is the best color");

		// 2. Ask the user a question
        

		// 3. Use an if statement to check if their answer is correct
        if (answer.equals("blue")) {
        	
        			
        	score = score + 1;
        } else {
        	score = score - 1;	
               }
        
        

		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
        
        String answer1 = JOptionPane.showInputDialog(null, "whats your favorite fruit");
        if (answer.equals("watermelon")) {
        	score = score + 1;
        	}
        
        String answer2 = JOptionPane.showInputDialog(null, "whats your favorite number");
        if (answer.equals("10")) {
        	score = score + 1;
        }
        
        
		// After all the questions have been asked, tell the user their final score

	}
}
