package Patterns.Singleton;

public class DirectoryManager {
    private static volatile DirectoryManager instance;
    private String currentDirectory;

    private DirectoryManager() {
        currentDirectory = "Home";
    }

    public static DirectoryManager getInstance() {
        if (instance == null) {
            synchronized (DirectoryManager.class) {
                if (instance == null) {
                    instance = new DirectoryManager();
                }
            }
        }
        return instance;
    }

    public synchronized void changeDirectory(String newDirectory) {
        // Perform any validation or other checks before changing the directory
        currentDirectory = newDirectory;
    }

    public synchronized void resetDirectory() {
        currentDirectory = "Home";
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }
}
