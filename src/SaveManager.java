public class SaveManager {
    private String[] savedGames = {"Minecraft", "Terraria"};

    public void loadSave(String gameName) {
        for (String game : savedGames) {
            if (game.equalsIgnoreCase(gameName)) {
                System.out.println("Save loaded for " + gameName);
                return;
            }
        }

        System.out.println("No save found. Starting new game.");
    }
}
