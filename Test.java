public class Test{
    public static void main(String[] args){
        Pet dog1 = new Dog("Hank");
        Pet cat1 = new Cat("Forrest");
        PetOwner bill = new PetOwner(dog1, cat1);
        
        dog1.feedPet();
        cat1.feedPet();

        dog1.walkPet();
        cat1.walkPet();

        dog1.petPet();
        cat1.petPet();

        dog1.speak();
        cat1.speak();
        System.out.println(bill.areYouHappy());
    }
}
