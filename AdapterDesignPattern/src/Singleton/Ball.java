package Singleton;
import java.util.Map;
import java.util.HashMap;
public class Ball {
    private static Ball ball;
    private String color;
    private static Map<String,Ball>ballrecord= new HashMap<>();
    private Ball(String c)
    {
        this.color=c;
    }
    public static Ball getInstance(String color)
    {
        if(!ballrecord.containsKey(color))
        {
            ballrecord.put(color,new Ball(color));
        }
        return ballrecord.get(color);
    }
}
