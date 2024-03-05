import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        UserAccount userAccount = new UserAccount();

        System.out.print("Put your account number: ");
        userAccount.setAccountNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Put your name: ");
        userAccount.setUserName(sc.nextLine());
        System.out.print("Put your agency: ");
        userAccount.setAgency(sc.next());
        System.out.print("Put your balance: ");
        userAccount.setBalance(sc.nextDouble());

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
        System.out.println(userAccount);
    }
}