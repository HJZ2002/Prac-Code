package Module1_week3;

import javax.swing.JOptionPane;

public class BowlingGame {

	public static void main(String[] args) {
		int player1score1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the score ","Score momment ello",JOptionPane.PLAIN_MESSAGE));
		int player1score2=   Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your score","score momment",JOptionPane.PLAIN_MESSAGE));
		int player1score3  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your score one more time ","one more score ?",JOptionPane.PLAIN_MESSAGE));
		
		int totalplayer = player1score1 + player1score2 + player1score3;
		
		int player2score4  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the score", "MOMMINT", JOptionPane.QUESTION_MESSAGE));
		
		int player2score5  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the score", "MOMMINT", JOptionPane.QUESTION_MESSAGE));
		
		int player2score6  = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the score", "MOMMINT", JOptionPane.QUESTION_MESSAGE));
		
		int totalplayer1 = player2score4 + player2score5 + player2score6;
		
		String winner ="";
		
		if (totalplayer > totalplayer1) {
			winner = ("Congrats u win player 1 :D");
		}else {
			winner =("Congrats u win player 2  :D");
			
		}
		String display = ("Player 1 total score :"+ totalplayer+
				"\nPlayer 2 total score :"+ totalplayer1 +
				"\n" + winner + "\nMade by Hosea James Zacarias");
		
		JOptionPane.showMessageDialog(null, display,"Congrats u deserve it",JOptionPane.INFORMATION_MESSAGE);
	}

}
