package tugas;

public class b {
    public static void main(String[] args) {
        System.out.println("Do While");
        System.out.println("Bilangan kelipatan 2 (0 - 100)");
        System.out.println("==============================");
        int i = 0;
        do {
            if(i == 0) {
                i = 1;
            } else {
                System.out.print(i + " ");
            }
            i = i * 2;
        } while(i <= 100);
        System.out.println("");
        System.out.println("Bilangan [perkalian 2 (0 - 100)");
        System.out.println("==============================");
        int j = 0;
        do {
            if(j == 0) {
                j = 1;
            } else {
                System.out.print(j * 2 + " ");
            }
            j++;
        } while(j <= 100);
        
        
    }
}
