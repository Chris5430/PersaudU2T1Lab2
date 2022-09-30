import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 5);
        System.out.println("Please enter your name: ");
        String yourName = input.nextLine();
        debbie.greeting(yourName);
        debbie.weather();
        System.out.println("How tall are you in feet?");
        int height = input.nextInt();
        double heightInMeters = debbie.convertFeetToMeters(height);
        System.out.println("You are " + heightInMeters + " meters tall.");
        System.out.println("What is your favorite number?");
        int number = input.nextInt();
        System.out.println("The sum of those numbers is " + debbie.favoriteNumber(number));
        System.out.println("Give me 3 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        debbie.addNumbers(num1, num2, num3);
        System.out.println(debbie.goodbye());
    }
}
