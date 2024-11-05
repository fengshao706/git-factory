public class 学习java核心类库 {
    public static class people {
        private String name="harry";
        private int age=18;
        private String sex="man";
        @Override
        public String toString(){//对toString类进行重写
            return "name:"+name+"  "+"age:"+age+"   "+"sex:"+sex;
        }
    }


    public static void main(String[]args){
        people p1=new people();
        System.out.println(p1.toString());
    }
}
