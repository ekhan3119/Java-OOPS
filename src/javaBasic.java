
public class  javaBasic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//palindrome(words that spells same when put it backword)
		
		String s = "madam";
		String t = " ";
		for (int i = s.length()-1; i>=0; i--) {
			t= t + s.charAt(i);
		}
		System.out.println(t);
		if (s==t) {
			//if s=t then palindrome.
		}
	}

}


