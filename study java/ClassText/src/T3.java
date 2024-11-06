import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入数组的行数");
        int a = s1.nextInt();
        System.out.println("请输入数组的列数");
        int b = s1.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            System.out.println("请输入第" + (i + 1) + "行的数据");
            for (int j = 0; j < b; j++) {
                arr[i][j] = s1.nextInt();
            }
        }
        int max_x = 0;
        int max_y = 0;
        int max = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_x = i;
                    max_y = j;
                }
            }
        }
    }
}