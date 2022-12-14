package main;

public enum Genre {
    M("MASCULIN"), F("FEMININ");
    private String genre;
    private Genre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
}
