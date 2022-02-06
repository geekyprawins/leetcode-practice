class MyHashMap {
 private:
        map<int,int>a;
 public:
        MyHashMap() {

        }

        void put(int key, int value) {
            a[key]=value;
        }

        int get(int key) {
            return a.count(key)>=1?a[key]:-1;
        }

        void remove(int key) {
            a.erase(key);
        }
};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */