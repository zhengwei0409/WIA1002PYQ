package PYQ2019U;

public class MyHashMap {
    Entry head;

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put("BruceW", "011-8998990");
        myHashMap.put("DeanW", "017-2274000");
        myHashMap.put("TonyS", "019-4550800");
        myHashMap.put("LaraC", "014-6402009");

        Entry e1 = myHashMap.get("DeanW");
        System.out.println("Value: " + e1.getValue());
        Entry e2 = myHashMap.get("TonyS"); 
        System.out.println("Value: " + e2.getValue());

        myHashMap.put("BruceW", "011-5677900");
        Entry e3 = myHashMap.get("BruceW");
        System.out.println("Value: " + e3.getValue());

        myHashMap.put("JeanG", "019-9001123");
        Entry e4 = myHashMap.get("JeanG");
        System.out.println("Value: " + e4.getValue());
    }

    public MyHashMap() {}

    public Entry get(String key) {
        if(head == null) return null;
        else {
            Entry currentEntry = head;
            while (currentEntry != null && !currentEntry.key.equals(key)) {
                currentEntry = currentEntry.next;
            }
            if(currentEntry != null) {
                return currentEntry;
            } else {
                return null;
            }
        }
    }

    public void put(String key, String value) {
        if(head == null) {
            head = new Entry(key, value);
        } else {
            Entry currentEntry = head;
            while (currentEntry.next != null && !currentEntry.key.equals(key)) {
                currentEntry = currentEntry.next;
            }
            if(!currentEntry.key.equals(key)) {
                currentEntry.next = new Entry(key, value);
            } else {
                currentEntry.value = value;
            }
            
        }
    }
}

class Entry {
    String key;
    String value;
    Entry next;

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
