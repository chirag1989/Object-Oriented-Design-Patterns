package solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {

    public void save(String filename,
                     Journal journal,
                     Boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}
