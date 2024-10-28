public class P88_T4 {
    public static class Triangle{
        private double a=0.0;
        private double b=0.0;
        private double c=0.0;
        private void Triangle(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        public void area(){
            double s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
    }

    public static void main(String[]args){
        Triangle t1=new Triangle();
        t1.Triangle(3,4,5);
        t1.area();
    }
}
