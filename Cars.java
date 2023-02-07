import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        System.out.println("Cars");
        System.out.println("_________");
        System.out.println("1. Ferrari");
        System.out.println("2. Mustang");
        System.out.println("3. Bugatti");
        System.out.println("4. Lamborghini");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Fastest car in the world");
                System.out.println("i like my Ferrari on red color only");
                ;
                break;
            case 2:
                System.out.println("Mustank has the 480 horsepower");
                System.out.println("i can feel the power of Mustang");
                break;
            case 3:
                System.out.println("Bugatti is one of the most expensive car in the world ");
                System.out.println("i think i can't affort one of the Bugatti");
                break;
            case 4:
                System.out.println("Lamborghini is one of the quickest and fasted car ");
                System.out.println(" i like my lambo in golden color");
                break;
            default:
                System.out.println("oh good morning ! I forgot i am poor");
        }
    }
}
