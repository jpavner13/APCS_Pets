import java.util.*;

public class TalkingCat extends Cat{

    public TalkingCat(String name){
        super(name);
<<<<<<< HEAD

=======
>>>>>>> 20f4734af7c2ce8cb9b8e858e0fbf22d9ea8c100
    }


    String[] comp = new String[]{"You look like a snack today!", "I'd hit that"};
    String[] insult = new String[]{"Beat it nubnuts", "No wonder your wife left you", "Shut it Karen"};

    public String speak(){
        Random rand = new Random();
<<<<<<< HEAD
=======

>>>>>>> 20f4734af7c2ce8cb9b8e858e0fbf22d9ea8c100
        if (happy()){
            return comp[rand.nextInt(2)];
        } else {
            return insult[rand.nextInt(3)];
        }
    }
}