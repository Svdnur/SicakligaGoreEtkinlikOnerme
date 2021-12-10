import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen celcius türünden hava sıcaklığını giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Bugün hava kayak yapmak için çok ideal!");

        } else if (heat >= 5 && heat <= 25) {

            if (heat <= 15) {
                System.out.println("Bugün hava piknik yapmak için çok ideal!");
            }
            if (heat >= 10) {
                System.out.println("Bugün hava sinemaya gitmek için çok ideal!");
            }
        } else if (heat > 25) {
            System.out.println("Bugün hava yüzmeye gitmek için çok ideal!");
        }
    }
}
