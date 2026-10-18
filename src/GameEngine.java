public class GameEngine {
    private boolean running = false;

    public void launch(String gameName) {
        if (!running) {
            running = true;
            System.out.println("Launching " + gameName);
        }
    }

    public void close(String gameName) {
        if (running) {
            running = false;
            System.out.println("Closing " + gameName);
        }
    }
}
