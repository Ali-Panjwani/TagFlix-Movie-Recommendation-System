import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.File;

public class MovieParser {

    public MovieParser() {

    }

    public File[] filereader(String folderpath) {
        try {
            File folder = new File(folderpath);
            File[] files = folder.listFiles();

            return files;
        } catch(SecurityException e) {
            System.out.println("Security exception occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Folder does not exist or is not a directory.");
        }
        return null;
    }

}
