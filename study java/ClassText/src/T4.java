import java.util.Scanner;
public class T4 {
    public static void encryption(StringBuilder origin){

        for(int i=0;i<origin.length();i++){
            if(origin.charAt(i)!='z'&origin.charAt(i)!='Z') {
                origin.setCharAt(i, (char) (origin.charAt(i) + 1));
                continue;
            }
            if(origin.charAt(i)=='z'){
                origin.setCharAt(i,'a');
            }
            if(origin.charAt(i)=='Z'){
                origin.setCharAt(i,'A');
            }
        }
        System.out.print("加密后：");
        for(int i=0;i<origin.length();i++){
            System.out.print(origin.charAt(i));
        }
        System.out.println();
    }

    public static void decode(StringBuilder code){
        for(int i=0;i<code.length();i++){
            if(code.charAt(i)!='a'&code.charAt(i)!='A'){
                code.setCharAt(i,(char)(code.charAt(i)-1));
                continue;
            }
            if(code.charAt(i)=='a'){
                code.setCharAt(i,'z');
            }
            if(code.charAt(i)=='A'){
                code.setCharAt(i,'Z');
            }
        }
        System.out.print("解密后：");
        for(int i=0;i<code.length();i++){
            System.out.print(code.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要加密的字符串");
        String temp=scanner.nextLine();
        StringBuilder origin=new StringBuilder(temp);
        encryption(origin);
        System.out.println("请输入需要解密的字符串");
        String temp1=scanner.nextLine();
        StringBuilder code=new StringBuilder(temp1);
        decode(code);
    }
}
