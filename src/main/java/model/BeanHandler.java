package model;

public class BeanHandler {

private static String username = "William";
private static String username2 = "Kratos";
private static String password1 = "123";
private static String password2 = "boy";

public static boolean users(String users, String password) {
	if(username.equals(users)&& password.equals(password1)) {
		return true;
		
	} else if(username2.equals(users)&& password.equals(password2)) {
		return true;
	}else {
		return false;
	}
}

}
