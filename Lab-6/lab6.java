
import java.util.*;
import java.io.FileReader;
import java.io.IOException;


public class lab6{

    public static void main(String[] args){
        try{
            String fileName= "text.txt";
            String fileContent= readFileContent(fileName);

            System.out.println("Vowels and their count: "+ countVowels(fileContent));
            System.out.println("Digits and their count"+ countDigits(fileContent));
            System.out.println("Top Five repeated words and their counts: "+ topNRepeadtedWords(fileContent))
            System.out.println("Least Five repeated words and their counts: "+ leastNRepeatedWords(fileContent));
            System.out.println("Top Five repeated characters and their counts: "+ topN);
            System.out.println("Least Five repeated characters and theit counts: "+);

        }
        catch(IOException e){
            System.out.println("Error reading the file"+ e.getMessage());
        }


    }
    static String readFileContent(String fileName) throws IOException{ 
        .
            try{
                
            }
            catch(IOException e){

            }

    }   
}