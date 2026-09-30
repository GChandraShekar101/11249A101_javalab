import java.io.*;
public class FileOperations {
    public static void main(String[] args) {
        try { 
            File file=new File("sample.txt");
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("File already exixts.");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello,I am chandu.\n");
            writer.write("This is java file operations program.");
            writer.close();
            System.out.println("Data written successfully.");
            FileReader reader = new FileReader(file);
            int character;
            System.out.println("\nFile contents:");
            while ((character = reader.read()) !=-1){
                System.out.print((char) character);
            }
            reader.close();
            FileWriter appendWriter = new FileWriter(file,true);
            appendWriter.write("\nThis line is appended to the file.");
            appendWriter.close();
            System.out.println("\n\nData appended successfully.");
        }catch (IOException e){
            System.out.println("An error occured:"+ e.getMessage());
        }
    }
}