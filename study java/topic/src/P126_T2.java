import java.util.Scanner;
public class P126_T2 {
    public static void ST(){
        int fatherLocation;
        int sonLocation;
        String temp = "";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String father=scanner.nextLine();
        System.out.println("请输入第二个字符串");
        String son=scanner.nextLine();
        if(son.length()>father.length()){
            System.out.println("输入错误，程序已退出");
            return;
        }
        else{
            for(int i=0;i<father.length();i++){  //父类的位置
                if(father.charAt(i)==son.charAt(0)){
                    temp=father.substring(i,i+son.length());
                    break;
                }
            }
            if(temp.equals(son)){
                System.out.println("是子字符串");
            }
            else{
                System.out.println("不是子字符串");
            }
        }
    }
    public static void main(String[]args){
         ST();

    }
}
