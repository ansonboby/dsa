import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        // ---- Sorting primitives ----
        int[] nums = {5, 2, 8, 1, 9};
        Arrays.sort(nums);
        System.out.println("Sorted int[]: " + Arrays.toString(nums));

        // ---- Sorting String list ----
        List<String> names = Arrays.asList("Bob", "Alice", "Charlie");
        Collections.sort(names);
        System.out.println("Sorted names: " + names);

        // ---- Custom object Comparable ----
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 85));
        students.add(new Student("Alice", 92));
        students.add(new Student("Charlie", 78));

        Collections.sort(students);
        System.out.println("Students sorted by mark: " + students);

        // ---- Custom Comparator ----
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });
        System.out.println("Students sorted by name: " + students);

        // ---- Lambda syntax (shorter) ----
        students.sort((a, b) -> Integer.compare(b.mark, a.mark));
        System.out.println("Students sorted by mark desc: " + students);
    }
}

class Student implements Comparable<Student> {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.mark, other.mark);
    }

    @Override
    public String toString() {
        return name + ":" + mark;
    }
}

/*
--- EXERCISES ---
1. Create a class `Product` with `name` and `price`, implement Comparable to sort by price
2. Write a Comparator that sorts strings by length first, then alphabetically
3. Given an array of integers, sort them in descending order using a Comparator
*/
