
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
      System.out.println("bark");
    }
}
/**
 * inheritance
 */
 class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }

    
}


