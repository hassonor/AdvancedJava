package JavaHTPE11.ch_15_files_input_output_streams.ex1_fileAndDriectoryInfo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter file or directory name:");
            
            // create Path object based on user input
            Path path = Paths.get(input.nextLine());

            if (Files.exists(path)) {
                // display file (or directory) information
                System.out.println(path.getFileName() + " exists");
                System.out.println((Files.isDirectory(path) ? "Is" : "Is not") + " a directory");
                System.out.println((path.isAbsolute() ? "Is" : "Is not") + " an absolute path");
                System.out.println("Last modified: " + Files.getLastModifiedTime(path));
                System.out.println("Size: " + Files.size(path));
                System.out.println("Path: " + path);
                System.out.println("Absolute path: " + path.toAbsolutePath());

                if (Files.isDirectory(path)) {
                    System.out.println();
                    System.out.println("Directory contents: ");

                    // object for iterating through a directory's contents
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                    for (Path p : directoryStream) {
                        System.out.println(p);
                    }
                } else {
                    System.out.println(path + " does not exist.");
                }
            }
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }
    }
}
