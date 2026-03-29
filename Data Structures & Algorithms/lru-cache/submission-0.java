class LRUCache {
    int size;
    int items;
    LinkedHashSet<Integer> sorted;
    HashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        items = 0;
        size = capacity;
        sorted = new LinkedHashSet<>();
        cache = new HashMap<>(capacity);
    }
    
    public int get(int key) {
        if(cache.get(key) != null) {
            sorted.remove(key);
            sorted.add(key);
            return cache.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(size == 0) return;
        if(items < size && !sorted.contains(key)) {
            sorted.remove(key);
            items += 1;
        } else {
            if(sorted.contains(key)) {
                sorted.remove(key);
            } else {
                List<Integer> sortedKeys = new ArrayList<>(sorted);
                int evictKey = sortedKeys.get(0);
                sorted.remove(evictKey);
                cache.remove(evictKey);
            }
        }
        sorted.add(key);
        cache.put(key, value);
        return;
    }
}
