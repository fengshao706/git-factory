import java.util.Scanner;
public class P126_T2 {
    public static void ST(){
        int fatherLocation;
        int sonLocation;
        String temp = "";  //创建临时字符串以接受后面裁切过后的字符串
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String father=scanner.nextLine();
        System.out.println("请输入第二个字符串");//为字符串赋值
        String son=scanner.nextLine();
        if(son.isEmpty()|father.isEmpty()){
            System.out.println("输入错误，程序已退出");
            return;//判断输入是否为空的字符串
        }
        if(son.length()>father.length()){
            System.out.println("输入错误，程序已退出");//判断子字符串是否比父字符串长
            return;
        }
        else{
            for(int i=0;i<father.length();i++){  //i是父字符串的位置
                if(father.charAt(i)==son.charAt(0)){//遍历父字符串找到与子字符串具有相同字符的位置
                    temp=father.substring(i,i+son.length());
                    if(temp.equals(son)){
                        System.out.println("是子字符串");//判断是否为子字符串
                        return;//如果是子字符串就直接退出函数体
                    }
                }
            }
            System.out.println("不是子字符串");//如果遍历完了还没找到子字符串，就说明不是子字符串
        }
    }
    public static void main(String[]args){
         ST();

    }
}
