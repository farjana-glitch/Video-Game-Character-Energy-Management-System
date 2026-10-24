public class Warrior extends PlayerCharacter {
    private static final double REGEN_RATE = 0.02;
    public Warrior(String characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }
    @Override
    public double calculateRegenRate() {
        return getEnergyLevel() * REGEN_RATE;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Character Class: Warrior (Regen Rate: 2.0%)");
        System.out.println("Regen Amount: " + calculateRegenRate());
    }
}