package javaWork3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName()+" "+user.getLastName()+" isimli kullan�c� eklendi.");
		}
	public void multiaddd(User[] users) {
		for(User user:users) {
		add(user);
		}
		}
}