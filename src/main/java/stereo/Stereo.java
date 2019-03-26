package stereo;

import components.CDPlayer;
import components.CassetteDeck;
import components.Radio;
import components.RecordDeck;

public class Stereo {

    private String name;
    private RecordDeck turner;
    private CDPlayer cdPlayer;
    private Radio radio;
    private CassetteDeck cassetteDeck;
    private int volume;

    public Stereo(String name, RecordDeck turner, CDPlayer cdPlayer, Radio radio, CassetteDeck cassetteDeck){
        this.name = name;
        this.turner = turner;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.cassetteDeck = cassetteDeck;
        this.volume = 20;
    }

    public String getName(){
        return this.name;
    }

    public RecordDeck getTurner(){
        return this.turner;
    }

    public CDPlayer getCDPlayer(){
        return this.cdPlayer;
    }

    public Radio getRadio(){
        return this.radio;
    }

    public CassetteDeck getCassettePlayer(){
        return this.cassetteDeck;
    }

    public int getVolume(){
        return this.volume;
    }

    public void increaseVolume(int db){
        this.volume += db;
    }

    public void decreaseVolume(int db){
        this.volume -= db;
    }
}
