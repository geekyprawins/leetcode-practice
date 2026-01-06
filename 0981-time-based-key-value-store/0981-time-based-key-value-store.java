class Data{
    String val;
    int ts;
    Data(String val, int ts){
        this.val = val;
        this.ts = ts;
    }
}

class TimeMap {
    Map<String,List<Data>> map;
    public TimeMap() {
        map = new HashMap<String,List<Data>>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<Data>()).add(new Data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        return binSearch(map.get(key),timestamp);
    }

    private String binSearch(List<Data> list, int ts){
        int left = 0, right = list.size()-1;
        while(left<right){
            int mid = (left+right+1) >>>1;
            if(ts < list.get(mid).ts) right = mid-1;
            else left = mid;
        }
        return list.get(left).ts <= ts ? list.get(left).val : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */