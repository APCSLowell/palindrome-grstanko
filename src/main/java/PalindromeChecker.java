import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  word = strip(word);
  System.out.println(word);
  int i = 0;
  int d = word.length()-1;
  while(i <= d) {
      if (word.charAt(i) != word.charAt(d)) return false;
      i++;
      d--;
  }
  return true;
}
public String reverse(String str)
{
    String sNew = new String();
    //your code here
    return sNew;
}
  private String strip(String s) {
    String buf = "";
    for (int i = 0; i < s.length(); i++) {
      if (Character.isAlphabetic((int) s.charAt(i))) buf = buf + Character.toLowerCase(s.charAt(i));
    }
    return buf;
  }
}
