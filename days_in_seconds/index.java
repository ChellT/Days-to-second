import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		

        int Hours = days*24;
        int Minutes = Hours*60;
        int seconds = Minutes*60;

        System.out.println( days + " days in seconds is " + seconds);
	}
}