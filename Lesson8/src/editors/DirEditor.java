package editors;

import java.io.File;

public class DirEditor {

    public static File createDir(String path) {
        File dir = new File(path);
        dir.mkdir();
        return dir;
    }

    public static File renameDir(File dir, String newDirPath) {
        File newDir = new File(newDirPath);
        dir.renameTo(newDir);
        return newDir;
    }

    public static void deleteDir(File dir) {
        String[] entries = dir.list();
        for (String s : entries) {
            File currentFile = new File(dir.getPath(), s);
            currentFile.delete();
        }
        dir.delete();
    }
}
