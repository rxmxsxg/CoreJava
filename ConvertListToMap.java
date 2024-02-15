import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
    int id;
    String name;
    int salary;

    public User(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
public class ConvertListToMap {
    public static void main(String[] args){
        List<User> userList = List.of(
                new User(1,"ram",300),
                new User(4,"pam",300),
                new User(2,"cam",300),
                new User(3,"tam",300)
        );
        Map<Integer,String> res = userList.stream().collect(Collectors.toMap(e->e.id, e->e.name));
        System.out.println(res);


    }

}
