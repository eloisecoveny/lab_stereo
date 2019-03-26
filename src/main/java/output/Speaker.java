package output;

import stereo.Stereo;

public class Speaker implements IConnect {

    private String make;
    private String model;
    private SpeakerType type;

    public Speaker(String make, String model, SpeakerType type){
        this.make = make;
        this.model = model;
        this.type = type;
    }

    public String connect(Stereo stereo){
        return this.type + " speaker is now connected to " + stereo.getName();
    }
}
