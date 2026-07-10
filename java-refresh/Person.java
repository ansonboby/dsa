import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old");
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anson", 18);
        Person p2 = new Person("Bob", 20);

        p1.introduce();
        p2.introduce();

        System.out.println(p1);
        System.out.println(p1.equals(p1)); // true
        System.out.println(p1.equals(p2)); // false
    }
}

/*
--- EXERCISES ---
1. Add a `graduationYear` field and a method that prints "class of XXXX"
2. Create a `Student` class that extends `Person` with an extra `rollNo` field
3. Override toString in the Student class
*/
