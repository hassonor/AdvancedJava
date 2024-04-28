package JavaHTPE11.ch_15_files_input_output_streams.ex6_countFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CountFile {
    public static void main(String[] args)
            throws IOException, FileNotFoundException {
        int count = 0;
        InputStream in;
        String filename;
        if (args.length >= 1) {
            in = new FileInputStream(args[0]);
            filename = args[0];
        } else {
            in = System.in;
            filename = "Input";
        }
        while (in.read() != -1) {
            count++;
        }
        System.out.println(filename + " has " + count + " chars.");
    }
}
