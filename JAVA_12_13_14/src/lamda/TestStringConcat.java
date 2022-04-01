package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConCatimpl concat1 = new StringConCatimpl();
		concat1.makestring(s1, s2);
			
		StringConcat concat2 = (s,v) -> System.out.println(s+","+v);
		concat2.makestring(s1, s2);

	}

}
