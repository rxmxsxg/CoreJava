import java.util.*;
import java.util.stream.Collectors;
class Student implements Comparable<Student> {
    int id;
    String Name;

    public Student(int id, String name) {
        this.id = id;
        this.Name = name;
    }
//    @Override
//    public int compareTo(Student o) {
//        return this.Name.compareTo(o.Name);
//    }
    @Override
    public int compareTo(Student o){
        return Integer.compare(this.id, o.id);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }


}
 class Employee {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    int salary;
    Employee(int id, String name, int salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeSorting {

    public static void main(String[] args){
//        ArrayList<Employee> empList = new ArrayList<>();
//        empList.add(new Employee(1, "ramesh", 10000));
//        empList.add(new Employee(3, "swetha", 8000));
//        empList.add(new Employee(6, "kamala", 4000));
//        empList.add(new Employee(4, "swathi", 5000));
//        empList.add(new Employee(8, "tanshu", 3000));
//        empList.add(new Employee(2, "tharunika", 9000));
//
//       List<Employee> e =  empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
//        System.out.println(e);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "ramesh"));
        students.add(new Student(4, "swetha"));
        students.add(new Student(2, "tanshu"));
        students.add(new Student(3, "tharunika"));
        Collections.sort(students);
        System.out.println(students);

    }
}
