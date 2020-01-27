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

    public String speak(){
        if(getFed() && !getWalked() && !getPetted()){
            return "Meow";
        } else {
            return "FRIKKEN DIE HUMAN!!!!!";
        }
    }
}