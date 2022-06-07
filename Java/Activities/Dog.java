public class Dog extends Animal{
    @Override
    public void makesound() {
        System.out.println("woof woof");

    }
    public static void main (String [] args){
        Dog tom=new Dog();
        tom.makesound();
    }
}
