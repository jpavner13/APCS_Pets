public class PetOwner{
    private boolean happy = true;

    public PetOwner(Pet pets[]){

        for(Pet pet : pets){
            if (!pet.happy()){
                this.happy = false;
            }
        }

    }

    public String areYouHappy(){
        if(this.happy){
            return ("I am happy!");
        } else {
            return("I am not happy");
        }
    }
}