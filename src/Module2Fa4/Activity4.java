package Module2Fa4;
import javax.swing.JOptionPane;
public class Activity4 {

	public static void main(String[] args) {
		int num = sumdouble(1,2);
		int num2 = sumdouble(3,2);
		int num3 = sumdouble (2,2);
		
		JOptionPane.showMessageDialog(null, "sumDouble(1,2)-> "+num+"\nsumDouble(3,2)-> "+num2+"\nsumDouble(2,2)-> "+num3,"Created by Hosea James Zacarias",JOptionPane.INFORMATION_MESSAGE);
	}
	public static int sumdouble(int x,int y) {
		if(x==y) {
			return 2*x+y;
			
		} else {
			return x+y;
		}
	}

}
