package JavaHTPE11.ch_15_files_input_output_streams.ex7_readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.err.println("no such file");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("please supply file name");
            System.exit(1);
        }

        try {
            String st = in.readLine();
            while (st != null) {
                System.out.println(st);
                st = in.readLine();
            }
            System.out.println("end of file");
            in.close();
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
}
