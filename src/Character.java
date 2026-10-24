public abstract class Character {
    private String characterID;
    private double energyLevel;
    protected Character(String characterID, double energyLevel) {
        this.characterID = characterID;
        this.energyLevel = Math.max(0, energyLevel);
    }
    public abstract double calculateRegenRate();
    public void displayInfo() {
        System.out.println("Character ID: " + characterID);
        System.out.println("Energy Level: " + energyLevel);
    }
    protected String getCharacterID() {
        return characterID;
    }
    protected double getEnergyLevel() {
        return energyLevel;
    }
    protected void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }
}