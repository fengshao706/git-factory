public class CastDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        double pi=Math.PI;
        pi=pi*10000+0.5;
        pi=(int)pi;
        pi=pi/10000;
        System.out.println(pi);
    }
}
