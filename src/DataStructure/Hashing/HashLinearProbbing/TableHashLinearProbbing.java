package DataStructure.Hashing.HashLinearProbbing;

public class TableHashLinearProbbing {
    private final int maxSize;
    private int currentSize;
    private String[] keys;
    private String[] values;

    public TableHashLinearProbbing(int size) {
        this.maxSize = size;
        currentSize = 0;
        values = new String[size];
        keys = new String[size];
    }


    public void clear() {
        currentSize = 0;
        keys = new String[maxSize];
        values = new String[maxSize];
    }


    public int getSize() {
        return currentSize;
    }


    public boolean isFull() {
        return currentSize == maxSize;
    }


    public boolean isEmpty() {
        return currentSize == 0;
    }

    private int hash(String key) {
        return key.hashCode() % maxSize;
    }


    public void insert(String key, String value) {
        if (!isFull()) {
            int initialIndex = hash(key);
            int counter = initialIndex;
            do {
                // 1. The Index is Null
                if (keys[counter] == null || keys[counter].equals("-1")) {
                    keys[counter] = key;
                    values[counter] = value;
                    currentSize++;
                    return;
                }

                // 2. The counter is not Null but have the Same Key ; UPDATE
                if (keys[counter].equals(key)) {
                    values[counter] = value;
                    return;
                }

                // To make it Circular
                counter = (counter + 1) % maxSize;
            } while (counter != initialIndex);
        }
    }


    public String get(String key) {
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                return values[i];
            }
            i = (i + 1) % maxSize;
        }
        return "Not Found";
    }

    public boolean contains(String key) {
        return !get(key).equals("Not Found");
    }

    public void remove(String key) {
        if (!contains(key))
            return;
        int i = hash(key);
        while (!keys[i].equals(key)) {
            i = (i + 1) % maxSize;
        }
        keys[i] = values[i] = "-1";
        currentSize--;
    }


    public void print() {
        int items = 0;
        for (int i = 0; i < maxSize; i++) {
            if (keys[i] == null || keys[i].equals("-1")) {
                continue;
            }
            System.out.println(keys[i] + " " + values[i]);
            System.out.println();
            items++;
        }
        System.out.println("The Number Of Items in HashTable : "+items);
    }

}
