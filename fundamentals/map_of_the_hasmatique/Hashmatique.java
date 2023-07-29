import java.util.HashMap;
// we are being asked to build a map method, and extract key and value pairs in the form of track titles and lyrics, ok/
// use hashmap with track titles as keys and sample lyrics as values.
// 4 songs to tracklist 
// Pull them out by name, equating their respective values.

public class Hashmatique {
    public static void main(String[] bananas){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Meridian", "I am the Painter, Making this mess a masterpiece");
        map.put("Up Against The Ropes", "We're all dead in the end so live life while you can");
        map.put("Mariana's Trench", "Pray for Heaven's titans");
        map.put("White Washed", "It's not about my beliefs, it's about personal choice");
        System.out.println(map.get("Meridian"));
        System.out.println(map.get("Up Against The Ropes"));
        System.out.println(map.get("Mariana's Trench"));
        System.out.println(map.get("White Washed"));

        for(String key : map.keySet()){
            System.out.println(String.format("Track Title: %s - Lyrical Catch: %s,", key, map.get(key)));
        }
    }
}