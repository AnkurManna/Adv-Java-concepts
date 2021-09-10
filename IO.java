import java.io.File;

public class IO {
    /*
    * streams are used for i/o.it represents flow of data .
    * Two main API inputStream,OutputStream .
    *
    * System.in is a inputStream to read standard input
    * Reader Writer works with character
    * BufferedReader is used for file reading
    * path,Paths,Files
    * */
    public static void main(String[] args)
    {
        /*
        * FileReader,BufferedReader,StringReader,StringWriter
        * Scanner,
        * */

        String[] contents = new File(".").list();
        for(String file : contents)
            System.out.println(file);

        boolean myDirectory = new File("myDirectory").mkdir();
    }
}
