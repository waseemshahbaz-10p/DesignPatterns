package Patterns.Singleton;

public class main {
    public static void main(String[] args) {
        DirectoryManager directoryManager1 = DirectoryManager.getInstance();
        DirectoryManager directoryManager2 = DirectoryManager.getInstance();

        // Object 1: Change directory
        directoryManager1.changeDirectory("/path/to/directory1");
        System.out.println("Object 1 - Current directory: " + directoryManager1.getCurrentDirectory());

        // Object 2: Change directory
        directoryManager2.changeDirectory("/path/to/directory2");
        System.out.println("Object 2 - Current directory: " + directoryManager2.getCurrentDirectory());

        // Object 1: Reset directory
        directoryManager1.resetDirectory();
        System.out.println("Object 1 - Current directory after reset: " + directoryManager1.getCurrentDirectory());

        // Object 2: Reset directory
        directoryManager2.resetDirectory();
        System.out.println("Object 2 - Current directory after reset: " + directoryManager2.getCurrentDirectory());
    }
}
