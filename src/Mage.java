public class Mage extends PlayerCharacter {
    private static final double REGEN_RATE = 0.05;
    public Mage(String characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel, playerName);
    }
    @Override
    public double calculateRegenRate() {
        return getEnergyLevel() * REGEN_RATE;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Character Class: Mage (Regen Rate: 5.0%)");
        System.out.println("Regen Amount: " + calculateRegenRate());
    }
}