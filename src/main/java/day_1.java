import java.util.Scanner;
public class day_1 {
    public static void main(String[] args) {

        String[] userName = new String[5];
        String[] passWord = new String[5];

        Scanner details = new Scanner(System.in);

        int i = 0;

        while (i < 5) {
            System.out.print("Enter Username  :");
            String newName = details.nextLine();
            userName[i] = newName;

            System.out.print("Enter Password  :");
            String newPass = details.nextLine();
            passWord[i] = newPass;

            i++;
        }

        Scanner logIn = new Scanner(System.in);

        int x = 0;

        while (x < 5) {
            System.out.print("Username   :");
            String usName = logIn.nextLine();
            System.out.print("Password :");
            String pass = logIn.nextLine();

            if (userName[x].equals(usName) && passWord[x].equals(pass)) {
                System.out.println("Welcome");
                break;
            } else System.out.println("Try Again");
            x++;
        }
    }
}
