package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 implements Comparable<Student1>{
    int age;
    Integer x;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student1 [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student1 o) {
        if(this.age >o.age)
            return 1;
        else
            return -1;
    }
}

public class Demo3 {
    public static void main(String[] args) {
//        Comparator<Student1> com = new Comparator<Student1>() {
//            public int compare(Student1 i, Student1 j) {
//                if (i.age > j.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
      //  Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(21, "Raju"));
        studs.add(new Student1(12, "John"));
        studs.add(new Student1(18, "Parul"));
        studs.add(new Student1(20, "Kiran"));

        for (Student1 s : studs)
            System.out.println(s);
        System.out.println("**********************");
        // Collections.sort(studs); // it wont work
        Collections.sort(studs);
        for (Student1 s : studs)
            System.out.println(s);
    }
}
