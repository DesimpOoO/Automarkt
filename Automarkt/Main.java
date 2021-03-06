package database;

import config.ReadConfig;
import entitys.Car;
import entitys.User;

public class Main {

	private static String username;
	private static String password;

	public static void main(String[] args) {

		/*
		 * Neue Autos, Innenausstattungen und User sollten am besten als JSON
		 * kommen Ich geb den Kram aus der DB auch wiede als JSON zurück
		 */

		ReadConfig config = new ReadConfig();
		String url = ReadConfig.readConfig();

		DBQuerys connection = new DBQuerys(url, username, password);

		// dummy image
		byte[] image = null;
		Car car = new Car("mercedes", "amg", "12.09.2018", 98000, image, 20000, 2, 467, 5, 5, 9.7, "EURO 6", 5, 3982);
		connection.addCar("cars", car);

		User user = new User("Fionera", "Tim", "Windelschmidt", "DickLover", "12.09.2018", "Fionera@fionera.com", true);
		connection.addUser("user", user);
	}
	
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		Main.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Main.password = password;
	}
}
