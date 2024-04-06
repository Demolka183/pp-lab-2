import java.util.Scanner;

public class SredniaOcenZTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ile ocen chcesz wprowadzić dla ekonomii? ");
        int[] ekonomia = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla bhp? ");
        int[] bhp = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla matematyki? ");
        int[] matematyka = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla edb? ");
        int[] edb = new int[scanner.nextInt()];
        
        System.out.print("Ile ocen chcesz wprowadzić dla angielskiego? ");
        int[] angielski = new int[scanner.nextInt()];
        
        dodajOceny(ekonomia, scanner, "ekonomia");
        dodajOceny(bhp, scanner, "bhp");
        dodajOceny(matematyka, scanner, "matematyka");
        dodajOceny(edb, scanner, "edb");
        dodajOceny(angielski, scanner, "angielski");
        
        double suma = 0;
        int liczbaOcen = ekonomia.length + bhp.length + matematyka.length + edb.length + angielski.length;
        
        suma += sumaOcen(ekonomia);
        suma += sumaOcen(bhp);
        suma += sumaOcen(matematyka);
        suma += sumaOcen(edb);
        suma += sumaOcen(angielski);
        
        double srednia = suma / liczbaOcen;
        
        System.out.printf("Średnia wszystkich ocen wynosi: %.2f", srednia);
    }
    
    private static void dodajOceny(int[] oceny, Scanner scanner, String przedmiot) {
        for (int i = 0; i < oceny.length; i++) {
            System.out.printf("Podaj ocenę nr %d z %s: ", i + 1, przedmiot);
            oceny[i] = scanner.nextInt();
        }
    }
    
    private static double sumaOcen(int[] oceny) {
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return suma;
    }
}
