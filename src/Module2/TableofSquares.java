package Module2;
import javax.swing.JOptionPane;

public abstract class TableofSquares {

    public static void main(String[] args) {

        String message = "\n Created by Hosea James Zacarias ";
        message += "\n---Using Loop\n";
        for (int i = 1; i<=20; i++) {
            message += " Number " + i +  " squared  " + i * i + "\n";
        }

        JOptionPane.showMessageDialog(null, message);

        int num =1;
        message = "\n---Using while loop---\n";

        while(num<=20) {
            message += "Number " + num + " squared " + num * num + "\n";
            num++;
        }

        JOptionPane.showMessageDialog(null, message);

        message = "\n---Using do while loop---\n";
        int var = 1;
        do {
            message += " Number " + var + " squared " + var * var + "\n";
            var++;
        } while (var<=20);

        JOptionPane.showMessageDialog(null, message);
    }
}