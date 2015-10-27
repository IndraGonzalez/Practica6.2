package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "/Users/Indra/Desktop/email.txt";
        String to = "/Users/Indra/Desktop/email(1).txt";
        InputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        long start = System.currentTimeMillis();
        while(true){
           int read = input.read();
           if (read < 0) break;
           output.write(read);
        }      
        input.close();
        output.flush();
        output.close();
        System.out.println(System.currentTimeMillis() - start);
    }
}
