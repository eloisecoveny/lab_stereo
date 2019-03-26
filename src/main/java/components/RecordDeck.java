package components;

public class RecordDeck extends Component implements IPlay {

    private RecordSpeed speed;
    private RecordType record;

    public RecordDeck(String make, String model){
        super(make, model);
        this.speed = RecordSpeed.THIRTY_THREE;
        this.record = null;
    }

    public void selectSpeed(RecordSpeed speed){
        this.speed = speed;
    }

    public RecordSpeed getSpeed(){
        return this.speed;
    }

    public String play(){
        if(this.record == null){
            return "The sound analogue hollow echoing record music";
        } else {
            return this.record.getArtist() + " fills the room";
        }
    }

    public void selectRecord(RecordType record){
        this.record = record;
    }
}
