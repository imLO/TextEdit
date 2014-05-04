package textedit;

/**
 *
 * @author LO
 */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class TextEdit {

    public static void main(String[] args){

        String file_path1 = path1;
        String file_path2 = path2;
        try{
            //File inputFile = new File(file_path1);
            File tempFile = new File(file_path2);
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file_path1),"UTF-8"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String currentLine;
            while((currentLine = reader.readLine())!=null){
                String RcurrentLine = currentLine.replace(",","','");
                String newString = "localStorage.setItem('";
                String newCurrentLine = newString + RcurrentLine + "');";
                writer.write(newCurrentLine);
                writer.newLine();
            }
            writer.close();
            reader.close();
            System.out.println("Done");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
