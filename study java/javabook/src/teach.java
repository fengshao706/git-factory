public class teach {
    public static void main(String[] args) {
        int temp=0;                 //先创建一个临时变量
        for(int i=100;i<=1000;i++){  //遍历100到1000的整数
            if(i % 5==0 && i % 6==0){ //赋予筛选条件
                System.out.print(i+"  ");//打印符合条件的整数
                temp++;               //记录打印次数
                if(temp%10==0){      //每十次回车一次
                    System.out.println();
                }
            }
        }
    }
}

