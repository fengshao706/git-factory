public class T5_2 {
    public abstract class Animal{
        protected double weight;
        protected void eat(){
            System.out.println("动物吃什么");
        }
        protected abstract void Action();
    }

    public class Bird extends Animal {
        public int numberOfWings;
        public void fly(){
            System.out.println("鸟在飞行");
        }
        @Override
        public void Action(){
            System.out.println("实现鸟类飞行的抽象方法");
        }
    }

    public class Fish extends Animal {
        public int numberOfFins;
        public void swim(){
            System.out.println("鱼在游泳");
        }
        @Override
        public void Action(){
            System.out.println("实现鱼类游泳的抽象方法");
        }
    }

    public class Dog extends Animal {
        public int numberOfLegs;
        public void walk(){
            System.out.println("狗在行走");
        }
        @Override
        public void Action(){
            System.out.println("实现狗在行走的抽象方法");
        }
    }

    public static void main(String[]args){

    }
}
