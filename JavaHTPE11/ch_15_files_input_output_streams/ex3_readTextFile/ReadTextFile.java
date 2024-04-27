package JavaHTPE11.ch_15_files_input_output_streams.ex3_readTextFile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        // open clients.txt, read its contents and close the file
        try (Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

            // read record from file
            while (input.hasNext()) {
                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
        } catch (IOException | NoSuchElementException | IllegalFormatException e) {
            e.printStackTrace();
        }
    }
}
