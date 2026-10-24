public class DRIVEEE {
    public static void main(String[] args) {
        System.out.println("========== VIDEO GAME CHARACTER ENERGY MANAGEMENT SYSTEM ==========\n");
        System.out.println("=== Displaying Character Info & Demonstration of Runtime Polymorphism ===");
        Character[] party = new Character[2];
        party[0] = new Mage("C101", 100.0, "Gandalf");
        party[1] = new Warrior("C102", 150.0, "Conan");

        for (Character member : party) {
            System.out.println("--------------------------------------------------");
            member.displayInfo();
        }
        System.out.println("\n================================------------------");
        System.out.println("=== Compile-Time Polymorphism (Method Overloading) ===");
        PlayerCharacter player = new PlayerCharacter("C103", 50.0, "BasicPlayer");
        player.displayInfo();

        player.restoreEnergy(20);
        System.out.println("New Energy Level: " + player.getEnergyLevel());

        player.restoreEnergy(15.5);
        System.out.println("New Energy Level: " + player.getEnergyLevel());
        System.out.println("\n================================------------------");
        System.out.println("=== Exception Handling (try-catch-finally) ===");
        try {
            System.out.println("Attempting to use 100.0 energy...");
            player.useEnergy(100.0);
        } catch (InsufficientEnergyException e) {
            System.out.println("ERROR: InsufficientEnergyException - " + e.getMessage());
        } finally {
            System.out.println("[FINALLY BLOCK] Current energy level is: " + player.getEnergyLevel());
        }

        // --- 4. Multi-Catch Demonstration ---
        System.out.println("\n================================------------------");
        System.out.println("=== Multi-Catch Demonstration ===");
        try {
            player.useEnergy(200.0); // Throws InsufficientEnergyException
            int result = 10 / 0;      // Would throw ArithmeticException
        } catch (InsufficientEnergyException | ArithmeticException e) {
            System.out.println("MULTI-CATCH CAUGHT: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        System.out.println("\nPROGRAM COMPLETED SUCCESSFULLY.");
    }
}