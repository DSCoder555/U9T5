import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer performer){
        if(performers.indexOf(performer) > -1){
            return false;
        }
        else{
            performers.add(performer);
            return true;
        }
    }

    public boolean removePerformer(Performer performer){
        if(performers.indexOf(performer) > -1){
            performers.remove(performers.indexOf(performer));
            return true;
        }
        else{
            return  false;
        }
    }

    public double averagePerformerAge(){
        double total = 0;
        for(Performer performer : performers){
            total += performer.getAge();
        }
        return total/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age){
        ArrayList<Performer> overAged = new ArrayList<>();
        for(Performer performer : performers){
            if(performer.getAge() >= age){
                overAged.add(performer);
            }
        }
        return overAged;
    }
}
