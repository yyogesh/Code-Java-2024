package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Raju"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));

        for (Student s : studs)
            System.out.println(s);
        System.out.println("**********************");
        // Collections.sort(studs); // it wont work
        Collections.sort(studs, com);
        for (Student s : studs)
            System.out.println(s);
    }
}
