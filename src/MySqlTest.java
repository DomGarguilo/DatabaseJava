import java.util.Scanner;

public class MySqlTest {
	public static void main(String[] args) {
		
		System.out.println("ENter id");
		Scanner scan = new Scanner(System.in);
		int tempID = scan.nextInt();
		scan.close();
		LoginPage.login(tempID);

	}

}
