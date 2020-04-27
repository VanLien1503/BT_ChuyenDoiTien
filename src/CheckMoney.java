import java.util.Scanner;
public class CheckMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập USD Muốn chuyển");
        usd=scanner.nextDouble();
        double quyDoi=usd*vnd;
        System.out.println(quyDoi+"vnd");

    }
}
