import java.util.Scanner;
public class P126_T3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入国际标准书号");
        String bookNumber=scanner.nextLine();//获取书号
        if(bookNumber.length()!=17){
            System.out.println("该书号不合法");//判断书号长度，不对的直接判定不合法
        }
        else{
            String[]test=bookNumber.split("-");//定义字符串数组并将原数组分割后传入字符串数组
            if(test.length!=5){
                System.out.println("该书号不合法");//假设分离后并不是五个部分就判定不合法
            }
            else {
                if(test[0].length()!=3|test[1].length()!=1|test[2].length()!=3|test[3].length()!=5|test[4].length()!=1){
                    System.out.println("该书号不合法");//如果某一个部分的长度不正确就判定不合法
                }
                else{
                    System.out.println("该书号合法");//上述情况都不符合就判定合法
                }
            }
        }

    }
}
