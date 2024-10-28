import java.util.Arrays;

public class javaUtilArraysClass {
    public static int Search(int []array,int key){//二分查找法查找对应目标数字在数组中的位置
        int low=0;
        int high=array.length-1;
        while (high>=low){
            int mid =(low+high)/2;
            if(array[mid]>key){
                high=mid-1;
            }
            if(array[mid]<key){
                low=mid+1;
            }
            if(array[mid]==key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int []num={1,4,34,6,54,34,2,8,76,56,12,34,23,23,56,7,6,55};
        int []newArray=Arrays.copyOf(num,num.length);//复制数组的方法
        for(int i=0;i<newArray.length;i++){      //遍历数组并输出
            System.out.print(newArray[i]+"  ");
        }
        System.out.println();//回车

        System.out.println(Search(num,76));//输出目标数字在数组中的位置
        java.util.Arrays.sort(num);      //对数组进行自然排序的方法
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"  ");
        }
    }
}
