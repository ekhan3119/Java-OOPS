
public class ReverseStringPrac {

	public static void main(String[] args) {
		String str= "Hello World!";
		System.out.println(reverseWithStringBuilder(str));
	

	}

	private static String reverseWithStringBuilder(String str) {
		
		return new StringBuilder(str)
				.reverse()
				.toString();
	}
	

}
