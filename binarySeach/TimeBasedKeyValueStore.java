import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
Design a time-based key-value data structure that can store multiple values for 
the same key at different time stamps and retrieve the key's value at a certain timestamp.

Implement the TimeMap class:

TimeMap() Initializes the object of the data structure.
void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
String get(String key, int timestamp) Returns a value such that set was called previously, 
with timestamp_prev <= timestamp. If there are multiple such values, it returns the value 
associated with the largest timestamp_prev. If there are no values, it returns "".

Example 1:
Input:
["TimeMap", "set", ["alice", "happy", 1], "get", ["alice", 1], "get", ["alice", 2], "set", ["alice", "sad", 3], "get", ["alice", 3]]

Output:
[null, null, "happy", "happy", null, "sad"]

Explanation:
TimeMap timeMap = new TimeMap();
timeMap.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
timeMap.get("alice", 1);           // return "happy"
timeMap.get("alice", 2);           // return "happy", there is no value stored for timestamp 2, thus return the value at timestamp 1.
timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
timeMap.get("alice", 3);           // return "sad"
 */
class TimeBasedKeyValueStore {
    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) {
            return "";
        }

        List<Pair> list = map.get(key);
        String res = "";

        int l = 0;
        int r = list.size() - 1;

        while(l <= r) {
            int m = (l + r) / 2;

            if(list.get(m).timestamp <= timestamp) {
                res = list.get(m).value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    private static class Pair {
        int timestamp;
        String value;

        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value; 
        }
    } 
}    
