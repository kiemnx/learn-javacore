package buoi2;

public class Activity2a1 {
    public static void main(String[] args) {
        System.out.println("Divided 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Divided 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Divided 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i + " ");
            }
        }

    }
}