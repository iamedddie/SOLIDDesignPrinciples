package fileHandlerSolution;

public class FileHandlerApp {

    public static void main(String[] args) {
        try {
            TextFileReader reader = new TextFileReader("src/Main/resources/sample.txt");
            AutoCloseFileWriter writer = new AutoCloseFileWriter("src/Main/resources/sample.txt");
            ContentFormatter formatter = new ContentFormatter();

            String content = reader.read();
            System.out.println(content);

            String jsonContent = "{\"name\": \"John\", \"age\": 30}";
            String xmlContent = formatter.jsonToXml(jsonContent);

            writer.write(xmlContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
