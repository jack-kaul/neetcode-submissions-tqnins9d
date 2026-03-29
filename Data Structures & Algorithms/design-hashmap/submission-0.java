class MyHashMap {

    List<Integer> keys;
    List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(get(key) == -1) {
            keys.add(key);
            values.add(value);
        } else {
            for(int i = 0; i < keys.size(); i++) {
                if(keys.get(i) ==  key) {
                    values.set(i,value);
                    break;
                }
            }
        }
    }
    
    public int get(int key) {
        for(int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key) {
                return values.get(i);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        if(get(key) != -1) {
            for(int i = 0; i < keys.size(); i++) {
                if(keys.get(i) == key) {
                    keys.remove(i);
                    values.remove(i);
                    break;
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */