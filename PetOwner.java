public class PetOwner{
    private boolean happy = false;

    public PetOwner(Pet dog, Pet cat){
        if (dog.happy() && cat.happy()){
            this.happy = true;
        }
    }

    public String areYouHappy(){
        if(happy){
            return ("I am happy!");
        } else {
            return("I am not happy");
        }
    }
}