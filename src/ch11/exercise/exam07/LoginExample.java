package ch11.exercise.exam07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIDException(id + "가 없습니다.");
		}

		if (!password.equals("12345")) {
			throw new WrongPasswordException(password + "가 일치하지 않습니다.");
		}
	}
}
