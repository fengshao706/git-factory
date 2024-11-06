import java.util.Scanner;
import java.time.LocalDate;//引入LocalDate库


public class P175_T7 {
    public void Calendar(int year,int month){
        System.out.println(year+"年"+"               "+month+"月");//打印输出前面的文字部分
        System.out.println("-----------------------------------------------");
        System.out.printf("%6s%5s%5s%5s%5s%5s%5s%n","一","二","三","四","五","六","日");
        int dayLong=LocalDate.of(year,month,1).lengthOfMonth();//计算这个月有多少天
        int dayOfWeek=LocalDate.of(year,month,1).getDayOfWeek().getValue();//计算这个月的一号是星期几
        for(int i=1;i<dayOfWeek;i++){   //打印前面的空格
            System.out.printf("%6s","");
        }
        for(int i=1;i<=dayLong;i++){   //打印输出日期

                System.out.printf("%6s",i);


            if(LocalDate.of(year,month,i).getDayOfWeek().getValue()==7){  //当日期是星期日的时候就换行
                System.out.println();
            }
        }
    }

    public static void main(String[]args){
        P175_T7 p175_t7=new P175_T7();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想查询的年份");
        int year=scanner.nextInt();
        System.out.println("请输入你想查询的月份");//获取查询的年份和月份
        int month=scanner.nextInt();
        p175_t7.Calendar(year,month);
    }
}
