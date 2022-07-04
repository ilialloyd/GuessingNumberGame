package bean;

public class Config {
    private static Config config = null;
    private static boolean loggedIn;
    public static Competitors[] competitors = null;

    public Config() {
    }

    public Competitors[] getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitors[] competitors) {
        Config.competitors = competitors;
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }

        return config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
}
