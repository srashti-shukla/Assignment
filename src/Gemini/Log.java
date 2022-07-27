package Gemini;
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler fh;

    public Log(String file1) throws IOException {
        File f=new File(file1);
        if(!f.exists())
        {
            f.createNewFile();
        }

        fh=new FileHandler(file1,true);
        logger=logger.getLogger("test");
        logger.addHandler(fh);
        SimpleFormatter formatter =new SimpleFormatter();
        fh.setFormatter(formatter);
    }

}
