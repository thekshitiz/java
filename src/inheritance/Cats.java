package inheritance;

class Cats{
    void eat(){System.out.println("eating...");}
}
class Dog extends Cats{
    void bark(){System.out.println("barking...");}
}
class Cat extends Dog{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
//        c.meow();
//        c.eat();
                        c.bark();//C.T.Error
    }}