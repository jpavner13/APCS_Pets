public class Test{
    public static void main(String[] args){
        Pet dog1 = new Dog("Hank");
        Pet cat1 = new Cat("Forrest");
        Pet yourkie = new Yourkie("Yourkie");
        Pet[] pets = new Pet[]{dog1, cat1, yourkie};
        PetOwner bill = new PetOwner(pets);

        dog1.feedPet();
        cat1.feedPet();
        yourkie.feedPet();

        dog1.walkPet();
        //cat1.walkPet();
        yourkie.walkPet();

        dog1.petPet(); 
        //cat1.petPet();
        for(int i = 1; i < 11; i++){
            yourkie.petPet();
        } 

        dog1.speak();
        cat1.speak();
        yourkie.speak();


        System.out.println(bill.areYouHappy());
    }
}