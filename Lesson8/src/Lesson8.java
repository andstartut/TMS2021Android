import archives.Archive;
import editors.DirEditor;
import editors.FileEditor;
import editors.TextFormatter;
import input.ConsoleInput;
import input.FileInput;
import output.FileOutput;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Lesson8 {
    private static final String OUTPUT_FILE_DIRECTORY = "Lesson8/resources/";
    private static final String TASK_ONE_OUTPUT_FILE_PATH = OUTPUT_FILE_DIRECTORY + "MirrorText.txt";
    private static final String TASK_TWO_INPUT_FILE_PATH = OUTPUT_FILE_DIRECTORY + "Task2Read.txt";
    private static final String TASK_TWO_OUTPUT_FILE_PATH = OUTPUT_FILE_DIRECTORY + "Task2Write.txt";
    private static final String TASK_THREE_DIR_PATH = OUTPUT_FILE_DIRECTORY + "New";
    private static final String TASK_THREE_ZIP_PATH = TASK_THREE_DIR_PATH + "/Archive.zip";
    private static final String TASK_THREE_NEW_DIR_PATH = OUTPUT_FILE_DIRECTORY + "Old";
    private static File dir;

    public static void main(String[] args) throws IOException {
/**
 *  Task 1. Reading text from the console, mirroring it and writing to a file.
 */
        new FileOutput(TASK_ONE_OUTPUT_FILE_PATH)
                .write(editors.TextFormatter.textMirroring(ConsoleInput.getLine()));

/**
 *  Task 2. Reading text from the file, getting sentences with 3 to 5 words and writing to the new file.
 */
        new FileOutput(TASK_TWO_OUTPUT_FILE_PATH).write(
                TextFormatter.getSentenceWithThreeToFiveWords(
                        new String(new FileInput(TASK_TWO_INPUT_FILE_PATH).read())));

/**
 * Task 3. Working with directory, files and archive.
 */
        dir = DirEditor.createDir(TASK_THREE_DIR_PATH);
        List<File> listOfFiles = new FileEditor().createFiles(TASK_THREE_DIR_PATH, 3);
        FileEditor.fillFilesRandomNumbers(listOfFiles);
        new Archive().createZip(TASK_THREE_ZIP_PATH, listOfFiles);
        dir = DirEditor.renameDir(dir, TASK_THREE_NEW_DIR_PATH);
        System.out.println(Arrays.toString(dir.list()));
        DirEditor.deleteDir(dir);
    }
}
