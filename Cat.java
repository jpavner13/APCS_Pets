public class Cat{
    private boolean fed = false;
    private boolean walked = false;
    private boolean petted = false;

    public Cat(boolean fed, boolean walked, boolean petted){
        this.fed = fed;
        this.walked = walked;
        this.petted = petted;
    }

    public boolean happy(){
        if(this.fed && !this.walked && !this.petted){
            return true;
        }
        return false;
    }

    public void speak(){
        if(this.fed && !this.walked && !this.petted){
            System.out.println("Meow");
        } else {
            System.out.println("FRIKKEN DIE HUMAN!!!!!");
        }
    }
}