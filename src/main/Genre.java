package main;

public enum Genre {
    MAL("MASCULIN"), FEMME("FEMININ");
    private String genre;
    private Genre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
}
