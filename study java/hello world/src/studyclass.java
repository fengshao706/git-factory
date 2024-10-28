public class studyclass {
    public static class overloading{

        void printperson(int age,String name,String sex){
            System.out.println(""+name+age+sex);
        }
    }
    public static void main(String[] args) {
        overloading o1=new overloading();
        o1.printperson(18,"siyuan","man");
    }
}
