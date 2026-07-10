import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // ---- ArrayList ----
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("ArrayList: " + list);
        System.out.println("Get index 1: " + list.get(1));
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Max: " + Collections.max(list));

        // iterate
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();

        // ---- HashMap ----
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 3);
        map.put("cherry", 8);
        System.out.println("Map: " + map);
        System.out.println("Get apple: " + map.get("apple"));
        System.out.println("Contains key banana: " + map.containsKey("banana"));
        System.out.println("Contains value 8: " + map.containsValue(8));

        // iterate keys
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // iterate entries
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // ---- HashSet ----
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2); // duplicate, ignored
        set.add(3);
        System.out.println("Set: " + set);
        System.out.println("Contains 2: " + set.contains(2));
        System.out.println("Size: " + set.size());

        // ---- Common patterns ----
        // frequency counter
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        System.out.println("Frequencies: " + freq);

        // remove duplicates
        List<Integer> withDupes = Arrays.asList(1, 1, 2, 2, 3);
        Set<Integer> unique = new HashSet<>(withDupes);
        System.out.println("Unique: " + unique);
    }
}

/*
--- EXERCISES ---
1. Write a method that returns the most frequent element in an array using HashMap
2. Given two arrays, find their intersection using HashSet
3. Write a method that checks if two strings are anagrams using a HashMap counter
*/
