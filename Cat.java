public class Cat extends Pet{

    public Cat(String name){
        super(name);
    }

    public boolean happy(){
        if(getFed() && !getWalked() && !getPetted()){
            return true;
        }
        return false;
    }

    public void speak(){
        if(getFed() && !getWalked() && !getPetted()){
            System.out.println("Meow");
        } else {
            System.out.println("FRIKKEN DIE HUMAN!!!!!");
        }
    }
}