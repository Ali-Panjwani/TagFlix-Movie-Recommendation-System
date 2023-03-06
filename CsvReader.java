import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public interface CsvReader {
    ArrayList<MovieEntry> list = new ArrayList<MovieEntry>();

    void CsvReader(String filepath);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

}

class MoviesReader implements CsvReader{

    @Override
    public void CsvReader(String filepath) {
        try {

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(filepath));
            NodeList nodeList = document.getDocumentElement().getChildNodes();

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}

class LinksReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}

class RatingsReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}

class TagsReader implements CsvReader{
    @Override
    public void CsvReader(String filepath) {

    }
}