import java.util.*;

public class TalkingCat extends Cat{

    public TalkingCat(String name){
        super(name);
        private Random rand = new Random();

    }


    String[] comp = new String[]{"You look like a snack today!", "I'd hit that"};
    String[] insult = new String[]{"Beat it nubnuts", "No wonder your wife left you", "Shut it Karen"};

    public String speak(){
        if (happy()){
            int rand = rand.nextInt(2);
            return comp[rand];
        } else {
            int rand = rand.nextInt(3);
            return insult[rand];
        }
    }
}