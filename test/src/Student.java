import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    private String fullName;
    private int age;
    private int GPA;

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public static String getFirstName(String fullName) {
        fullName = fullName.trim().replaceAll("\\s+", " ");
        int indexOfLastSpace = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(indexOfLastSpace + 1, fullName.length());
        return firstName;
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyen Van A", 10, 9));
        list.add(new Student("Hoang Van A", 10, 2));
        list.add(new Student("Nguyen Van A", 11, 5));
        list.add(new Student("Trinh Van Cac", 19, 9));
        list.add(new Student("Ta Van Em", 12, 9));
        list.add(new Student("Le Van Duc", 13, 9));

        System.out.println(getFirstName("Trinh Van Cac"));

        //task1
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (!o1.getFullName().equals(o2.getFullName())) {
                    return o1.getFullName().compareTo(o2.getFullName());
                } else {
                    return o2.getAge() - o1.getAge();
                }
            }
        });
        list.forEach(System.out::println);

        System.out.println("--------------------------------");

        //task2
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() != o2.getAge()) {
                    return o1.getAge() - o2.getAge();
                } else {
                    return o2.getGPA() - o1.getGPA();
                }
            }
        });

        list.forEach(System.out::println);
        System.out.println("--------------------------");

        //task3
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String firstName1 = getFirstName(o1.fullName);
                String firstName2 = getFirstName(o2.fullName);
                return firstName1.compareTo(firstName2);
            }
        });
        list.forEach(System.out::println);
    }
}
