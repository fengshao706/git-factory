public class T5_1 {
    public class Animal{
        protected double weight;
        protected void eat(){
            System.out.println("动物吃什么");
        }
    }

    public class Bird extends Animal{
        public int numberOfWings;
        public void fly(){
            System.out.println("鸟在飞行");
        }
    }

    public class Fish extends Animal{
        public int numberOfFins;
        public void swim(){
            System.out.println("鱼在游泳");
        }
    }

    public class Dog extends Animal{
        public int numberOfLegs;
        public void walk(){
            System.out.println("狗在行走");
        }
    }


    public static void main(String[]args){

    }
}
