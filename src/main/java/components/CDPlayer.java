package components;

public class CDPlayer extends Component implements IPlay {

    private int cdCapacity;

    public CDPlayer(String make, String model, int cdCapacity){
        super(make, model);
        this.cdCapacity = cdCapacity;
    }

    public int getCDCapacity(){
        return this.cdCapacity;
    }

    public String play(){
        return "The sound of digital CD music";
    }
}
