package writefile;


import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter MyWriter = new FileWriter("FileName.txt");
            MyWriter.write("File in java might be tricky, but it is fun enough!" +
                    "\n There are many available classes in the Java API that can be " +
                    "\nused to read and write files in Java: FileReader, BufferedReader," +
                    " \n Files, Scanner, FileInputStream, FileWriter, BufferedWriter," +
                    " \nFileOutputStream, etc. Which one to use depends on the Java version" +
                    " \nyou're working with and whether you need to read bytes or characters," +
                    "\n and the size of the file/lines etc.");
            MyWriter.close();
            System.out.println("Successfully wrote to the file. ");
        }catch (IOException e){
            System.out.println("  An error occurred. ");
            e.printStackTrace();
        }


    }

}
