package components;

public class CassetteDeck extends Component implements IPlay {

    private CassetteType tape;

    public CassetteDeck(String make, String model){
        super(make, model);
        this.tape = null;
    }

    public String play(){
        if(this.tape == null){
            return "The sound of analogue tape music";
        } else {
            return this.tape.getArtist() + " fills the room";
        }
    }

    public void selectTape(CassetteType tape){
        this.tape = tape;
    }
}
