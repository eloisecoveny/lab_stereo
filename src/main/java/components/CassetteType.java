package components;

public enum CassetteType {

    TAPE1("Easy Beats", "Friday on my Mind"),
    TAPE2("Radiohead", "The Bends"),
    TAPE3("90s Jam", "Best hits of the 90s"),
    TAPE4("Country Tunes", "Country zing in ya"),
    TAPE5("The Cranberries", "No Need to Argue");

    private final String artist;
    private final String album;

    CassetteType(String artist, String album){
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
