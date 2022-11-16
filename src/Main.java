import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kenar uzunlugunu giriniz: ");
        a = inp.nextInt();
        System.out.println("Kenar uzunlugunu giriniz: ");
        b = inp.nextInt();
        System.out.println("Kenar uzunlugunu giriniz: ");
        c = inp.nextInt();
        u = (a+b+c) / 2;
        System.out.println("Ucgeninizin çevresi: " + u);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Dairenizini alanı :" + alan);
    }
}