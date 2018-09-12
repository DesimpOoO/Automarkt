package database;

import config.ReadConfig;
import entitys.Car;
import entitys.User;

public class Main {

	private static String username;
	private static String password;

	public static void main(String[] args) {

		ReadConfig config = new ReadConfig();
		String url = ReadConfig.readConfig();

		DBQuerys connection = new DBQuerys(url, username, password);

		/* dummy image */
		byte[] image = null;
		Car car = new Car("mercedes", "amg", "12.09.2018", 98000, image, 20000, 2, 467, 5, 5, 9.7, "EURO 6", 5, 3982);
		connection.addCar("cars", car);

		User user = new User("Fionera", "Tim", "Windelschmidt", "DickLover", "12.09.2018", "Fionera@fionera.com", true);
		connection.addUser("users", user);
	}
}