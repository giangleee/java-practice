import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("message.txt");

        if (file.exists()) {
            System.out.println("File is exists");
            System.out.println(file.getPath()); //message.txt
            System.out.println(file.getAbsolutePath()); // C:\Users\giang\OneDrive\Máy tính\java\java-practice\file class\message.txt
            System.out.println(file.isFile()); //true
            file.delete(); //delete file
            
        } else {
            System.out.println("That file is not exists");
        }
    }
}