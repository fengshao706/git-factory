import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入n的值");
        int n = s.nextInt();
        for (int i = 1; i <= (2 * n - 1); i += 4) {

            a += 1.0 / i;
        }
        for (int i = 3; i <= (2 * n + 1); i += 4) {

            b += 1.0 / i;
        }
        float c = (a - b) * 4;
        System.out.println("pi的值是" + c);


    }
}