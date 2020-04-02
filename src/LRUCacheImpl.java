import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheEntry {
    int key;
    String value;

    public CacheEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCacheImpl {

    Deque<CacheEntry> queue = new LinkedList<>();
    Map<Integer, CacheEntry> map = new HashMap<>();
    int CACHE_SIZE = 3;
    Map<Integer, String> db = new HashMap<>();
    public LRUCacheImpl() {
        db.put(1, "Fziz Ahemad Faiz");
        db.put(2, "John Elia");
        db.put(3, "Galib");
        db.put(4, "Ahemad Faraz");
        db.put(5, "Dushyant Kumar");
    }

    private String getDataFromDb(int key){
       return db.get(key);
    }

    private String getDataFromCache(int key){
        if(map.containsKey(key)){
            queue.remove(map.get(key));
            queue.addFirst(map.get(key));
            return map.get(key).value;
        }
        putDataInCache(key, getDataFromDb(key));
        return getDataFromCache(key);
    }

    private void putDataInCache(int key, String value){
        if(map.containsKey(key)){
            queue.remove(map.get(key));
            map.remove(key);
        } else if(queue.size() == CACHE_SIZE){
            queue.removeLast();
        }

        CacheEntry newCacheEntry = new CacheEntry(key, value);
        queue.addFirst(newCacheEntry);
        map.put(key, newCacheEntry);
    }

    public static void main(String[] args) {

        LRUCacheImpl lru = new LRUCacheImpl();
        lru.putDataInCache(1, "Fziz Ahemad Faiz");
        lru.putDataInCache(2, "John Elia");
        lru.putDataInCache(3, "Galib");
        System.out.println(lru.getDataFromCache(1));
        System.out.println(lru.getDataFromCache(2));
        System.out.println(lru.getDataFromCache(5));
    }

}
