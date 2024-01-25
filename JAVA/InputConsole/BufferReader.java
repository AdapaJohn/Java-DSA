package InputConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = re.readLine();
            System.out.println("Your Input="+input);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
