package week4;

public class Cipherv1 {

	public static void main(String[] args) {
		String plaintext = "Ghm xouj sgrga yuyg cma rgeg sivu zgyue zgyue";
		String keyword = "gugma";
		
		String decrypted = decrpyt(plaintext,keyword);
		System.out.println(" Decrypted text "+ decrypted);
	}

	public static String decrpyt(String encryptedText, String keyword) {
		StringBuilder decrypted = new StringBuilder();
		
		keyword = keyword.toUpperCase();
		for(int i = 0, j=0; i<encryptedText.length(); i++) {
			char currentchar = encryptedText.charAt(i);
			
			if(Character.isUpperCase(currentchar)) {
				int key =keyword.charAt(j) - 'A';
				char decryptedchar = (char) ((currentchar - key - 'A' + 26) % 26 + 'A');
				decrypted.append(decryptedchar);
				j = (j + 1) % keyword.length();
			} else if (Character.isLowerCase(currentchar)) {
				int key =keyword.charAt(j) - 'A';
				char decryptedchar = (char) ((currentchar - key - 'a' + 26) % 26 + 'a');
				decrypted.append(decryptedchar);
				j = (j + 1) % keyword.length();
			} else {
				decrypted.append(currentchar);
			}
		}
		return decrypted.toString();
	}
}
