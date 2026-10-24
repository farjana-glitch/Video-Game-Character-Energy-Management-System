public class PlayerCharacter extends Character {
    private String playerName;
    public PlayerCharacter(String characterID, double energyLevel, String playerName) {
        super(characterID, energyLevel);
        if (energyLevel < 0) {
            System.out.println("Warning: Initial energy level cannot be negative. Setting to 0.0.");
        }
        this.playerName = playerName;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    @Override
    public double calculateRegenRate() {
        return 0.0;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Player Name: " + playerName);
    }
    public void restoreEnergy(int amount) {
        if (amount > 0) {
            setEnergyLevel(getEnergyLevel() + amount);
            System.out.println("Restored energy (int): " + amount);
        }
    }
    public void restoreEnergy(double amount) {
        if (amount > 0) {
            setEnergyLevel(getEnergyLevel() + amount);
            System.out.println("Restored energy (double): " + amount);
        }
    }
    public void useEnergy(double amount) throws InsufficientEnergyException {
        if (amount > getEnergyLevel()) {
            throw new InsufficientEnergyException(
                    "Not enough energy to perform action! Requested: " + amount + ", Available: " + getEnergyLevel()
            );
        }
        setEnergyLevel(getEnergyLevel() - amount);
        System.out.println("Energy used successfully. Remaining Energy: " + getEnergyLevel());
    }
}