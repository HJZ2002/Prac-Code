package Module1_week3;
import javax.swing.*;

public class TrafficLight {
	public static void main(String[] args) {
		int randomizer = (int) (Math.random()*3) + 1;
		
		ImageIcon green = new ImageIcon ("green.PNG");
		ImageIcon yellow = new ImageIcon ("yellow.PNG");
		ImageIcon red = new ImageIcon ("red.PNG");
		
		if (randomizer == 1) {
			JOptionPane.showMessageDialog(null, "The Signal is go", "Traffic Light", JOptionPane.PLAIN_MESSAGE, green);
			
		} else if (randomizer == 2) {
			JOptionPane.showMessageDialog(null, "The signal is yellow", "Traffic Light", JOptionPane.PLAIN_MESSAGE, yellow);
			
		} else if (randomizer == 3) {
			JOptionPane.showMessageDialog(null, "The signal is red", "Traffic Light", JOptionPane.PLAIN_MESSAGE, red);
	}

  }
}
