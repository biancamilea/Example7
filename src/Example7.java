import java.util.Scanner;
class Example7 {
    public static void main(String[] argv) {

        double metros;
        double millas;
        Scanner scanner = new Scanner(System.in);
        millas = scanner.nextDouble();
        metros = millas * 1852;

        System.out.println(metros);
    }
}