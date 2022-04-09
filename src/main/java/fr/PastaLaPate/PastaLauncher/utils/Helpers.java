package fr.PastaLaPate.PastaLauncher.utils;

import java.io.File;

public class Helpers {
    public static File generateGamePath(String folderName) {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win"))
            return new File(System.getProperty("user.home") + "\\AppData\\Roaming\\." + Constants.LAUNCHER_NAME.replace("-", ""));
        else if (os.contains("mac"))
            return new File(System.getProperty("user.home") + "/Library/Application Support/" + Constants.LAUNCHER_NAME.replace("-", ""));
        else
            return new File(System.getProperty("user.home") + "/." + Constants.LAUNCHER_NAME.replace("-", ""));
    }
}
