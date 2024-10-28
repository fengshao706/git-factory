import java.util.Scanner;
public class P111_T14 {
    public static void test01(int a,int b){
        Scanner s=new Scanner(System.in);
        int max=0;
        int linex=0;
        int liney=0;
        int[][] array =new int[a][b];
        System.out.println("请输入每行元素的值，换行请用回车");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                array[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    linex=i;
                    liney=j;
                }
            }
        }
        System.out.println("最大元素的位置是("+linex+","+liney+")");
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("请输入行数和列数");
        int a=s.nextInt();
        int b=s.nextInt();
        test01(a,b);
    }
}
