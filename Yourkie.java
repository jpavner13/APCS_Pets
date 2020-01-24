public class Yourkie extends Dog{

    int timesPetted = 0;

    public Yourkie(String name){
        super(name);
    }

    public boolean happy(){
        if(getFed() && getWalked() && this.timesPetted >= 10){
            return true;
        }
        return false;
    }

    public void petPet(){
        this.timesPetted++;
    }
}