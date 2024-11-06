public class P126_T4 {
    public static int countLetters(String s){
        int wordNumber=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&s.charAt(i)<='z'){//运用Ascll码表，在a到z区间进行判定
                wordNumber+=1;
            }
            if(s.charAt(i)>='A'&s.charAt(i)<='Z'){//运用Ascll码表，在大写字母A到Z区间判定
                wordNumber+=1;
            }
        }
        return wordNumber;
    }

    public static void main(String[]args){
        System.out.println(countLetters("Beijing 2022"));

    }
}
