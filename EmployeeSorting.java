import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSorting {
    static class Employee {
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
    public static void main(String[] args){
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "ramesh", 10000));
        empList.add(new Employee(3, "swetha", 8000));
        empList.add(new Employee(6, "kamala", 4000));
        empList.add(new Employee(4, "swathi", 5000));
        empList.add(new Employee(8, "tanshu", 3000));
        empList.add(new Employee(2, "tharunika", 9000));

       List<Employee> e =  empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).toList();
        System.out.println(e);

    }
}
