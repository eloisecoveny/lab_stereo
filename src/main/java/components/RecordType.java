package components;

public enum RecordType {

    RECORD1("Nina Simone", "I put a spell on you"),
    RECORD2("Frank Sinatra", "The Best of Times"),
    RECORD3("Elvis Presley", "Pot Luck"),
    RECORD4("Moody Blues", "Nights in White Satin"),
    RECORD5("Ella Fitzgerald", "Songs in a Mellow Mood");

    private final String artist;
    private final String album;

    RecordType(String artist, String album){
        this.artist = artist;
        this.album = album;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getAlbum(){
        return this.album;
    }
}
