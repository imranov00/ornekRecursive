import java.util.Scanner;

public class Main {
    public static void islem(int sayi) {
    System.out.print(sayi + " ");

    if (sayi <= 0)
    {
        return;
    }

    islem(sayi - 5);

    if (sayi > 0)
    {
        System.out.print(sayi + " ");
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        islem(n);

    }
}