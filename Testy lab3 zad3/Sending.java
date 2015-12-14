package dad;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sending {
	public static List<Message> messageList = new LinkedList<>();

	public void sendMessage() {
		int 
		numberOfMessage= 6;
		for (int i = 0; i < numberOfMessage; i++) {
			messageList.add(new Message(12, "INFO",Priority.valueOf("LOW")));
		}

	}

	public String readLine() {

		Scanner scanner = new Scanner(System.in);
		String send = scanner.nextLine();
		return send;
	}

	public int readLineInt() {

		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		return userChoice;

	}
}
