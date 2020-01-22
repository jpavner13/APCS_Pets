public class PetOwner{
    private boolean happy = false;

    public PetOwner(Dog dog, Cat cat){
        if (dog.happy() && cat.happy()){
            this.happy = true;
        }
    }

    public void AreYouHappy(){
        if(happy){
            System.out.println("I am happy!");
        } else {
            System.out.println("I am not happy");
        }
    }
}