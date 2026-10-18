public class GameLauncherFacade {
    private GameFileChecker fileChecker = new GameFileChecker();
    private SaveManager saveManager = new SaveManager();
    private GraphicsSettings graphics = new GraphicsSettings();
    private GameEngine engine = new GameEngine();

    private String currentGame;

    public void startGame(String gameName) {
        System.out.println("\nStarting " + gameName);

        if (currentGame != null) {
            System.out.println("Close the current game first");
            return;
        }

        if (!fileChecker.checkFiles(gameName)) {
            System.out.println("Cannot start game");
            return;
        }

        saveManager.loadSave(gameName);
        graphics.applySettings("High");
        engine.launch(gameName);

        currentGame = gameName;
        System.out.println("Game started successfully");
    }

    public void stopGame() {
        if (currentGame == null) {
            System.out.println("No game is running");
            return;
        }

        engine.close(currentGame);
        currentGame = null;
    }
}
