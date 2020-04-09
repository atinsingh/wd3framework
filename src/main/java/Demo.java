import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("src","main","resources","story.txt");
//            InputStream inputStream = new FileInputStream(path.toFile());
//            byte [] buff = new byte[100];
//            while( inputStream.read(buff)!=-1){
//                System.out.println(new String(buff));
//            }

//            Scanner scanner = new Scanner(path.toFile());
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }

            List<String> strings = Files.readAllLines(path);
            System.out.println(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){

        }

    }
}
