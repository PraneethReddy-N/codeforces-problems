import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TUrl {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String url = in.nextLine().trim();
        String[] urlparts = url.split("\\?");
        if(urlparts.length == 2){
            String[] parameters = urlparts[1].split("&");
            Map<String,String> pm = new HashMap<>();
            for(String parameter:parameters){
                String[] KeyValue = parameter.split("=");
                if(KeyValue.length == 2){
                    pm.put(KeyValue[0], KeyValue[1]);
                }
            }
            System.out.println("username: " + pm.get("username"));
            System.out.println("pwd: " + pm.get("pwd"));
            System.out.println("profile: " + pm.get("profile"));
            System.out.println("role: " + pm.get("role"));
            System.out.println("key: " + pm.get("key"));
        }
    }
}
