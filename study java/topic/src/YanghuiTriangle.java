import java.util.Scanner;
public class YanghuiTriangle {
    public static void test01(int a){
        int [][]array=new int[a][a];

        for(int i=0;i<a;i++){
            array[i][0]=1;//赋初值
        }
        for(int i=1;i<a;i++){  //i是行号
            for(int j=1;j<i;j++){  //j是列号
                array[i][j]=array[i-1][j-1]+array[i-1][j];//从上行推下行
            }
            array[i][i]=1;//为尾列赋值
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(array[i][j]+"  ");//打印输出
            }
            System.out.println();  //每输出一行就换行
        }

    }
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);//初始化输入
        System.out.println("请输入行数");
        int a= s.nextInt();//获取行数
        test01(a);
    }
}
