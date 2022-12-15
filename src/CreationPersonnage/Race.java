package CreationPersonnage;

public enum Race {
    A("cyborg"), B("majin"), C("namek"),D("saiyan"), E("terrien");
    private String race;
    private Race(String race) {
        this.race = race;
    }

    public String getRace(){
        return this.race;
    }


}
