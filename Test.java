public class Test{
    public static void main(String[] args){
        Dog dog1 = new Dog(true, true, true);
        Cat cat1 = new Cat(true, false, false);
        PetOwner bill = new PetOwner(dog1, cat1);

        dog1.speak();
        cat1.speak();
        System.out.println(bill.areYouHappy());
    }
}