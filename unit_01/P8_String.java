package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		System.out.println(obj.stringEqualOrNot(s1, s2));

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		char[] name = s.toCharArray();
		int i = 0;
		int c = 0;
		int j = name.length - 1;
		while (i < j) {
			if (name[i] == name[j]) {
				c = 0;
			} else {
				c++;
			}
			i++;
			j--;
		}
		if (c == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	void reverseOfAString(String s) {
		char[] name = s.toCharArray();
		char temp;
		int i = 0;
		int j = name.length - 1;
		while (i < j) {
			temp = name[i];
			name[i] = name[j];
			name[j] = temp;
			i++;
			j--;
		}
		System.out.println(name);
	}

	boolean stringEqualOrNot(String s1, String s2) {
		char[] n1 = s1.toCharArray();
		char[] n2 = s2.toCharArray();
		if (n1.length != n2.length) {
			return false;
		}
		for (int i = 0; i < n1.length; i++) {
			if (n1[i] != n2[i]) {
				return false;
			}
		}
		return true;
	}
}