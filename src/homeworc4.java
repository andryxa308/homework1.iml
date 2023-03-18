import java.util.Scanner;

public class homeworc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = scanner.nextInt();
        if (t > -5 ) {
            System.out.println("тепло");
        } else if (t >= -20 ) {
            System.out.println("нормально");
        } else if (t <= -20 ) {
            System.out.println("[холодно]");
        } else;

        }
    }

