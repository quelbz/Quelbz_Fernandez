import java.util.Scanner;
public class day_1 {
    public static void main(String[] args) {

        String[] newUser = new String[5];
        String[] newUserPass = new String[5];
        String[] userList = {"quelbz","obet","tantin","nek","raquel"};
        String[] passList = {"quelbz123","obet123","tantin123","nek123","raquel123"};

        Scanner action = new Scanner(System.in);
        System.out.print("Register or LogIn?    :");
        String input_1 = action.nextLine();

        switch (input_1) {
            case "Register":

                Scanner reg = new Scanner(System.in);

                System.out.print("Enter your username   : ");
                String nUser = reg.nextLine();

                System.out.print("Enter your password   : ");
                String nPass = reg.nextLine();

                userList[userList.length-1] = nUser;
                userList[passList.length-1] = nPass;

                System.out.println("Welcome, " + nUser);

                break;

            case "Log-in":

                Scanner log = new Scanner(System.in);

                int count = 0;
                while (count < 5) {

                    System.out.print("Username  :");
                    String userIn = log.nextLine();
                    System.out.print("Password  :");
                    String userPass = log.nextLine();

                    int x = 0;
                    while (x < userList.length) {
                        if (userList[x].equals(userIn) && passList[x].equals(userPass)) {
                            System.out.println("Welcome");
                            break;
                        }
                        x++;
                    }
                    count++;
                }

                break;

            default:
                System.out.println("Invalid Output");
                break;

        }

    }
}
