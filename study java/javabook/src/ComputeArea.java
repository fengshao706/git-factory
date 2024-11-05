import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area,perimeter;
        Scanner input=new Scanner(System.in);
        System.out.print("please input radius:");
        radius=input.nextDouble();
        area=Math.PI*radius*radius;
        perimeter=Math.PI*2*radius;
        System.out.println("The area of the circle is:"+area);
        System.out.println("The perimeter of the circle is:"+perimeter);
        }
}
