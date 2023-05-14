package Module2Fa4;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Setoperations {

		public static void main(String[] args) {
			
			 //sets from the user
	        String inputA = JOptionPane.showInputDialog(null, "Enter set A separated by commas (e.g. 1,2,3):");
	        String inputB = JOptionPane.showInputDialog(null, "Enter set B separated by commas (e.g. 2,3,4):");
	        
	        // Convert the user input into arrays of integers
	        int[] setA = Arrays.stream(inputA.split(",")).mapToInt(Integer::parseInt).toArray();
	        int[] setB = Arrays.stream(inputB.split(",")).mapToInt(Integer::parseInt).toArray();
	        
	        // set operations
	        int[] union = union(setA, setB);
	        int[] intersection = intersection(setA, setB);
	        int[] difference = difference(setA, setB);
	        int[] complementA = complement(setA, union);
	        int[] complementB = complement(setB, union);
	        int[] symmetricDifference = symmetricDifference(setA, setB);
	        
	        // Display
	        JOptionPane.showMessageDialog(null, "Set A: " + Arrays.toString(setA));
	        JOptionPane.showMessageDialog(null, "Set B: " + Arrays.toString(setB));
	        JOptionPane.showMessageDialog(null, "Union: " + Arrays.toString(union));
	        JOptionPane.showMessageDialog(null, "Intersection: " + Arrays.toString(intersection));
	        JOptionPane.showMessageDialog(null, "Difference (A \\ B): " + Arrays.toString(difference));
	        JOptionPane.showMessageDialog(null, "Complement of A: " + Arrays.toString(complementA));
	        JOptionPane.showMessageDialog(null, "Complement of B: " + Arrays.toString(complementB));
	        JOptionPane.showMessageDialog(null, "Symmetric Difference: " + Arrays.toString(symmetricDifference));
	    }
	    
	    public static int[] union(int[] setA, int[] setB) {
	        int[] result = new int[setA.length + setB.length];
	        int i = 0;
	        for (int element : setA) {
	            result[i++] = element;
	        }
	        for (int element : setB) {
	            if (!contains(result, element)) {
	                result[i++] = element;
	            }
	        }
	        return Arrays.copyOf(result, i);
	    }
	    
	    public static int[] intersection(int[] setA, int[] setB) {
	        int[] result = new int[Math.min(setA.length, setB.length)];
	        int i = 0;
	        for (int element : setA) {
	            if (contains(setB, element)) {
	                result[i++] = element;
	            }
	        }
	        return Arrays.copyOf(result, i);
	    }
	    
	    private static boolean contains(int[] setB, int element) {

			return false;
		}

		public static int[] difference(int[] setA, int[] setB) {
	        int[] result = new int[setA.length];
	        int i = 0;
	        for (int element : setA) {
	            if (!contains(setB, element)) {
	                result[i++] = element;
	            }
	        }
	        return Arrays.copyOf(result, i);
	    }
	    
	    public static int[] complement(int[] set, int[] universalSet) {
	        return difference(universalSet, set);
	    }
	    
	    public static int[] symmetricDifference(int[] setA, int[] setB) {
	        int[] result = new int[setA.length + setB.length];
	        int i = 0;
	        for (int element : setA) {
	            if (!contains(setB, element)) {
	                result[i++] = element;
	            }
	        }
			return result;
	    }
}