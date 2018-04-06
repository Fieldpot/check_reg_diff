import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;


class CheckRegDiff{
  public static void main(String args[]){
    char c;
		String regString = null;
    String inputText = null;

    try(BufferedReader reader = new BufferedReader (new InputStreamReader(System.in))){
    
      System.out.println("input regex string first : ");
      regString = reader.readLine();

    } catch (IOException e) {
      e.printStackTrace();
    } 

		Pattern pattern = Pattern.compile(regString); 
		for (char i = 0; i < 127; i++){
      inputText = "" + i;
      Matcher matcher = pattern.matcher(inputText);
      if (matcher.matches()){
        System.out.println(inputText);
      }
    }
    System.out.println("Finished");
  }
}
