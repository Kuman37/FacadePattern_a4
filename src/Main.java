public class Main {
    public static void main(String[] args) {
        GameLauncherFacade launcher = new GameLauncherFacade();

        launcher.startGame("Minecraft");
        launcher.startGame("Terraria");
        launcher.stopGame();

        launcher.startGame("GTA V");
        launcher.startGame("Stardew Valley");
        launcher.stopGame();
    }
}
