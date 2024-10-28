public class studyStaticVarible {
    public static class test01{
        static int a=100;
        int b=200;
        int c=300;

    }
    public static void main(String[]args){
        test01 t1=new test01();
        test01 t2=new test01();
        t1.a=200;
        t2.a=300;//Because "a" is static variable
        t1.b=300;//So t1.a=t2.a=300
        t2.b=400;
        System.out.println("t1.a="+t1.a+"  t2.a="+t2.a+"  t1.b="+t1.b+"  t2.b="+t2.b);

    }
}
