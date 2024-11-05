import java.util.Scanner;
public class P126_T3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入国际标准书号");
        String bookNumber=scanner.nextLine();
        if(bookNumber.length()!=17){
            System.out.println("该书号不合法");
        }
        else{
            String[]test=bookNumber.split("-");
            if(test.length!=5){
                System.out.println("该书号不合法");
            }
            else {
                if(test[0].length()!=3|test[1].length()!=1|test[2].length()!=3|test[3].length()!=5|test[4].length()!=1){
                    System.out.println("该书号不合法");
                }
                else{
                    System.out.println("该书号合法");
                }
            }
        }

    }
}
