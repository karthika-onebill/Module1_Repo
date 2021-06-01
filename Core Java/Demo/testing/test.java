

public class test {

	public static void main(String[] args) {
		
		String s1="Hello" ;
		String s2 = s1;// String pool point to (Hello) =>Hello content cannot be changed
		s2="Karthika";  // s1 -> point to (karthika)
		System.out.println(s2);
	}

}

