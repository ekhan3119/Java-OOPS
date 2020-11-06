package inheritance;




public class son extends grandfather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s =new son();
		s.city();
		s.country();
		System.out.println(s.i);
	}

	public void activities() {
		System.out.println("acivity");
	}
}
