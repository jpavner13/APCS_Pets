public class Test{
    public static void main(String[] args){

        Pet dog1 = new Dog("Hank");
        Pet cat1 = new Cat("Forrest");
        Pet yourkie = new Yourkie("Yourkie");
        Pet talkingCat = new TalkingCat("Talking Cat");
        Pet Horse = new Horse("Horse");

        Pet[] pets = new Pet[]{dog1, cat1, yourkie, talkingCat, Horse};
        PetOwner bill = new PetOwner(pets);

        dog1.feedPet();
        cat1.feedPet();
        yourkie.feedPet();
        talkingCat.feedPet();
        Horse.feedPet();

        dog1.walkPet();
        yourkie.walkPet();
        Horse.walkPet();

        dog1.petPet(); 
        for(int i = 1; i < 11; i++){
            yourkie.petPet();
        } 
        Horse.petPet();
        Horse.brushHorse();
        Horse.rideHorse();

        System.out.println("Dog 1: " + dog1.speak());
        System.out.println("Cat 1: " + cat1.speak());
        System.out.println("Yourkie: " + yourkie.speak());
        System.out.println("Talking Cat: " + talkingCat.speak());
        System.out.println("Horse: " + Horse.speak());

        System.out.println(bill.areYouHappy());
    }
}