class MyHashSet {

    List<Integer> mySet;

    public MyHashSet() {
        mySet = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key)) {
            mySet.add(key);
        }
    }
    
    public void remove(int key) {
        for(int i =0; i < mySet.size(); i++) {
            if(mySet.get(i) == key) { 
                mySet.remove(i);
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i =0; i < mySet.size(); i++) {
            if(mySet.get(i) == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */