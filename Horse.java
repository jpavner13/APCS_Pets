public class Horse extends Pet{

    private boolean brushed;
    private boolean ridden;

    public Horse(String name){
        super(name);
    }

    public void brushHorse(){
        this.brushed = true;
    }

    public void rideHorse(){
        this.ridden = true;
    }

    private boolean getBrushed(){
        return this.brushed;
    }

    private boolean getRidden(){
        return this.ridden;
    }

    public boolean happy(){
        if(getFed() && getWalked() && getPetted() && getBrushed() && getRidden()){
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