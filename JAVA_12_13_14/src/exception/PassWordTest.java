package exception;

public class PassWordTest {
	private String pass;
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass)throws PasswordException{
		if(pass == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if(pass.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자와 숫자를 혼합하여 쓰세요 ");
		}
		else if(pass.length()<5 || pass.length()>20) {
			throw new PasswordException("비밀번호는 5자 이상 20자 이하로 쓰세요 ");
		}
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		PassWordTest test = new PassWordTest();
		
		String pass = null;
		try {
			test.setPass(pass);
			System.out.println("오류 없음1");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pass = "abcd";
		try {
			test.setPass(pass);
			System.out.println("오류 없음2");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pass = "abcde";
		try {
			test.setPass(pass);
			System.out.println("오류 없음3");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		pass = "abcde1";
		try {
			test.setPass(pass);
			System.out.println("오류 없음4");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}

