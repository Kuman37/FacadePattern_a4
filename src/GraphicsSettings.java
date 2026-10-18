public class GraphicsSettings {
    public void applySettings(String quality) {
        if (quality.equalsIgnoreCase("High")) {
            System.out.println("Graphics: 1920x1080, High quality, 60 FPS");
        } else {
            System.out.println("Graphics: 1280x720, Low quality, 30 FPS");
        }
    }
}
