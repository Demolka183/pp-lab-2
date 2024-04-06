import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ekonomia, bhp, matematyka, edb, angielski;

        System.out.print("Podaj ocenę z ekonomii: ");
        ekonomia = scanner.nextInt();

        System.out.print("Podaj ocenę z bhp: ");
        bhp = scanner.nextInt();

        System.out.print("Podaj ocenę z matematyki: ");
        matematyka = scanner.nextInt();

        System.out.print("Podaj ocenę z edb: ");
        edb = scanner.nextInt();

        System.out.print("Podaj ocenę z angielskiego: ");
        angielski = scanner.nextInt();

        double srednia = (ekonomia + bhp + matematyka + edb + angielski) / 5.0;

        System.out.printf("Średnia ocen wynosi: %.2f", srednia);
    }
}
