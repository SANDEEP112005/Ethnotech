import java.util.HashMap;

 public class Hashexample{
    public static void main(String[] args){
        HashMap<String,String> h=new HashMap<>();
        h.put("Tree","NeemTree");
        h.put("Bird","Parrot");
        h.put("Animal","Lion");
        h.put("place","ooty");
        System.out.println(h);
        System.out.println(h.get("place"));
        System.out.println(h.remove("Tree"));
    }
}