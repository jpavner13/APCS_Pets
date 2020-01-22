public class Pet{

    private String name;
    private boolean fed;
    private boolean walked;
    private boolean petted;

    public Pet(String name){
        this.name = name;
    }

    public void feedPet(){
        this.fed = true;
    }

    public void walkPet(){
        this.walked = true;
    }

    public void petPet(){
        this.petted = true;
    }

    public boolean happy(){
        if(this.fed && this.walked && this.petted){
            return true;
        }
        return false;
    }

    public void speak(){
        if(this.fed && this.walked && this.petted){
            System.out.println("WOOF!");
        } else {
            System.out.println("woof");
        }
    }
}