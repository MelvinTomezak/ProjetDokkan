package CreationPersonnage;

public enum Type {
    Agi("Agilité"), Pui("Puissance"), Tech("Technique"), Int("Intelligence"), End("Endurance");
    private String type;

    private Type (String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
