public class 学习java核心类库 {
    public static class people {//定义一个员工类
        private String name="harry";
        private int age=18;
        private String sex="man";
        @Override
        public String toString(){//对toString类进行重写
            return "name:"+name+"  "+"age:"+age+"   "+"sex:"+sex;
        }
    }

    public static class copyArr{//定义一个数组复制类
        private int[]testArr;//接收输入信息
        private int[]coverArr;//接收复制后的信息并作为输出介质
        public copyArr(int[]testArr){
            this.testArr=testArr;    //使用构造函数对数组进行赋值
            this.coverArr=new int[testArr.length];
        }
        public int[] printArr(){
            System.arraycopy(testArr,0,coverArr,0,testArr.length);//用System库对数组进行复制
            return coverArr;//返回输出
        }
    }


    public static void main(String[]args){
        people p1=new people();
        System.out.println(p1.toString());//调用toString类
        System.err.println("测试输出错误信息");//err类可以输出错误信息
        int []arr={1,2,3};
        copyArr c1=new copyArr(arr);
        System.out.println(java.util.Arrays.toString(c1.printArr()));//利用toString打印输出复制后的数组
    }
}
