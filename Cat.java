public class Cat extends Pet{

    public Cat(String name){
        super.name = name;
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