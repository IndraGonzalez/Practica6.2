package kata4;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File ("/Users/Indra/Desktop/Prueba");
        String [] names = file.list();
        for(String name : names){
            System.out.println(name);
        }
    }ﬁﬁ
}
