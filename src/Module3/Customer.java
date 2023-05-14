package Module3;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Customer {

	public static void main(String[] args) {
		String menu[]={"[A]dd Customer","[V]iew Customers","[S]earch Customers", "[E]dit Customer", "[D]elete Customer", "[E]xit"};
		//Code By: Elman, Jhonna Mae M.
		
		int MAX=10, index=1;
		
		int customer_id[]=new int[MAX];
		String customer_name[]=new String[MAX];
		String customer_gender[]=new String[MAX];
		int customer_age[]=new int[MAX];
		String choice="", all = "", hold = "";
		
		
		do{
		choice=JOptionPane.showInputDialog(null, "Please Select\nCode By: Elman, Jhonna Mae M.", "Menu", 1, null,menu,menu[0]).toString();
		
		
		switch(choice){
		case "[A]dd Customer": //Case 1
			customer_id[index]= index;
			customer_name[index]=JOptionPane.showInputDialog("Customer Name: ");
			customer_age[index]=Integer.parseInt(JOptionPane.showInputDialog("Customer Age: "));
			customer_gender[index]=JOptionPane.showInputDialog("Customer Gender: ");
			JOptionPane.showMessageDialog(null, "Added new customer successfully");
			index++;
			break;
//end of case 1
		case "[V]iew Customers": //Case 2
			all="Customer's Info\nID\tName\tAge\tGender\n";
			for(int x=1;x<index;x++){
				all=all+customer_id[x]+"\t"+customer_name[x]+"\t"+customer_age[x]+"\t"+customer_gender[x]+"\n";
				}
			JOptionPane.showMessageDialog(null, new JTextArea(all));
			break;
//end of case 2
		case "[S]earch Customers": //Case 3
			//Only by name
			String search = JOptionPane.showInputDialog("Enter Name: ");
			int x=1;
			while (x<index) {
				if (search.equals(customer_name[x])) {
						hold="Customer's Info\nID\tName\tAge\tGender\n";
						hold=hold+customer_id[x]+"\t"+customer_name[x]+"\t"+customer_age[x]+"\t"+customer_gender[x]+"\n";
						break;
					}else {
						hold = "Sorry, " + search + " cannot be found.";
				}
				x++;
			}
			JOptionPane.showMessageDialog(null, new JTextArea(hold));
			break;
//end of case 3
		case "[E]dit Customer": //Case 4
			//Edit by name
			String customerName = JOptionPane.showInputDialog("Enter Name to edit: ");
			int y=1;
			while (y<index) {
				if(customerName.equals(customer_name[y])) {
					hold = "Change successful\nID\tName\tAge\tGender\n";
					customer_name[y]=JOptionPane.showInputDialog("Customer Name: ");
					customer_age[y]=Integer.parseInt(JOptionPane.showInputDialog("Customer Age: "));
					customer_gender[y]=JOptionPane.showInputDialog("Customer Gender: ");
					
					hold += customer_id[y]+"\t"+customer_name[y]+"\t"+customer_age[y]+"\t"+customer_gender[y]+"\n";
					break;
				}else {
					hold = "Sorry, " + customerName + " cannot be found.";
				}
				y++;
			}
			JOptionPane.showMessageDialog(null, new JTextArea(hold));
			break;
//end of case 4
		case "[D]elete Customer": //Case 5
			//Delete by name
			String customerNameDelete = JOptionPane.showInputDialog("Enter Name to Delete: ");
			int z=1;
			while(z<index) {
				if (customerNameDelete.equals(customer_name[z])) {
					//cascade delete babyyyyy
					hold = customer_name[z] + " has been removed from the System and Reality";
					for (int ctr = z; ctr < index; ctr++) {
						customer_id[ctr] = customer_id[ctr];
						customer_name[ctr] = customer_name[ctr+1];
						customer_age[ctr] = customer_age[ctr+1];
						customer_gender[ctr] = customer_gender[ctr+1];
					}
					index--;
					break;
				}else {
					hold = "Sorry, " + customerNameDelete + " cannot be found.";
				}
				z++;
			}
			JOptionPane.showMessageDialog(null, new JTextArea(hold));
			break;
//end of case 5
			
		case "[E]xit": //Case 6
			System.exit(0);
//end of case 6
		}//end of switch
		
	}while(!choice.equals("[E]xit")); //end of do while
}//end of main
}//end of class
			
		