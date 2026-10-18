public class GameFileChecker {
    private String[] installedGames = {"Minecraft", "Terraria", "Stardew Valley"};

    public boolean checkFiles(String gameName) {
        for (String game : installedGames) {
            if (game.equalsIgnoreCase(gameName)) {
                System.out.println("Game files verified: " + gameName);
                return true;
            }
        }

        System.out.println("Game not installed: " + gameName);
        return false;
    }
}
