import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
public class P175_T6 {
    public void FromBirthdayToToday(String birthday){//计算从出生到现在已经过去了多少天
        String[] splitBirthday=birthday.split("-");//将输入的字符串进行分割
        int year=Integer.parseInt(splitBirthday[0]);
        int month=Integer.parseInt(splitBirthday[1]);//提取年月日
        int day=Integer.parseInt(splitBirthday[2]);
        var birth=LocalDate.of(year,month,day);//转换为LocalDate数据类型
        var today=LocalDate.now();
        long goThrough=today.toEpochDay()-birth.toEpochDay();//这个方法可以直接计算经过的日期
        System.out.println("今天距离你的出生日有"+goThrough+"天");
    }
    public static void main(String[]args){
        P175_T6 p1=new P175_T6();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的生日：（格式为yyyy-mm-dd）");
        String birthday=scanner.nextLine();
        p1.FromBirthdayToToday(birthday);

    }
}
