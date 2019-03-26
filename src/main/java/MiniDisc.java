public class MiniDisc implements IConnect {

    private String make;
    private String model;

    public MiniDisc(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String connect(Stereo stereo){
        return "You are connected to " + stereo.getName();
    }


}
