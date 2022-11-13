import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Tea extends CaffeineBeverage{
    public Tea(){
    }
    public void brew(){
        System.out.println("Steeping the tea");
    }
    public void addCondiments(){
        System.out.println("Adding lemon");
    }
    public boolean customerWantCondiments(){
        String answer=getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else{
            return false;
        }
    }
    private String getUserInput(){
        System.out.println("Do you want condiments? (y/n)");
        Scanner sc= new Scanner(System.in);
        String answer= sc.next();
        return answer;
    }
}
