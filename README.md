# CoreJava
1.**How to create immutable class?**
Creating an **immutable class** in Java means designing a class whose objects cannot be modified after creation. Here are the steps to create an immutable class:

---

### **Steps to Create an Immutable Class:**

1. **Declare the class as `final`**  
   - This prevents subclasses from modifying the class behavior.

2. **Declare all fields as `private` and `final`**  
   - Fields should not be accessible or modifiable directly from outside the class.

3. **Do not provide "setter" methods**  
   - No methods should be provided that modify the fields after the object is created.

4. **Initialize fields through a constructor**  
   - The only way to set field values should be through a constructor.

5. **Return deep copies for mutable fields**  
   - If the class has mutable fields (e.g., arrays or collections), return copies to ensure internal data integrity.

---

### **Example: Immutable Class in Java**

```java
public final class Employee {

    private final String name;
    private final int age;
    private final List<String> roles; // A mutable field

    // Constructor to initialize fields
    public Employee(String name, int age, List<String> roles) {
        this.name = name;
        this.age = age;
        // Create a defensive copy to prevent modifications to the original list
        this.roles = new ArrayList<>(roles);
    }

    // Getter methods (No setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getRoles() {
        // Return a defensive copy to protect internal state
        return new ArrayList<>(roles);
    }

    // Optionally, override `toString` for better display
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", roles=" + roles + "}";
    }
}
```

---

### **Key Points in the Example:**

1. **`final` Class and Fields:**  
   The `final` keyword ensures that the class cannot be extended and the fields cannot be reassigned.  

2. **No Setters:**  
   There are no setter methods to modify the values after object creation.  

3. **Defensive Copying:**  
   A new list is created in the constructor and in the `getRoles` method to prevent external modifications to the `roles` list.  

---

### **Usage Example:**
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> roles = Arrays.asList("Developer", "Manager");
        Employee emp = new Employee("John Doe", 30, roles);

        System.out.println(emp);

        // Attempting to modify the original roles list has no effect on the object
        roles.add("Admin");
        System.out.println(emp.getRoles()); // Still ["Developer", "Manager"]
    }
}
```

This guarantees the `Employee` object remains immutable.

**2.What is the difference between save and persistent?**
In **Hibernate** (or similar ORM frameworks), `save` and `persist` are methods used to store an object in the database. Though they may seem similar, they have key differences in terms of their behavior and how they manage persistence in the **Hibernate session** and **transaction context**:

---

### **1. `save` (Hibernate-Specific Method)**  
- **Method Type:** Hibernate-specific (not part of the JPA specification).  
- **Behavior:**  
  - Immediately generates an **identifier** and inserts the object into the database.  
  - The object becomes **persistent** (managed by the Hibernate session).  
  - Returns the generated **identifier** for the saved object.  
- **Cascading:** Cascading rules are applied according to the entity configuration.  
- **Transaction Dependency:** Can execute even if outside a transaction, but behavior may vary depending on the session configuration.  

#### **Example:**
```java
Session session = sessionFactory.openSession();
session.beginTransaction();
Long id = (Long) session.save(employee);  // Returns the identifier
session.getTransaction().commit();
```

---

### **2. `persist` (JPA-Standard Method)**  
- **Method Type:** Part of the **JPA (Java Persistence API)** specification.  
- **Behavior:**  
  - Does not return the identifier (always returns `void`).  
  - The entity is managed by the persistence context but may not be immediately inserted into the database.  
  - The database insert occurs only when the **transaction is committed** or the persistence context is flushed.  
- **Cascading:** Respects the `CascadeType.PERSIST` configuration.  
- **Transaction Dependency:** Requires an **active transaction**. If called outside a transaction, it throws a `TransactionRequiredException`.

#### **Example:**
```java
EntityManager entityManager = entityManagerFactory.createEntityManager();
entityManager.getTransaction().begin();
entityManager.persist(employee);  // No return value
entityManager.getTransaction().commit();
```

---

### **Key Differences:**

| Feature                   | `save` (Hibernate)                 | `persist` (JPA Standard)              |
|---------------------------|-------------------------------------|---------------------------------------|
| **API Type**               | Hibernate-specific                  | JPA-compliant                         |
| **Return Type**            | Returns the generated identifier    | Returns `void`                        |
| **Insert Timing**          | Immediate (inserts when called)     | Deferred until flush or commit        |
| **Transaction Requirement**| Can work without a transaction      | Requires an active transaction        |
| **Cascading Rules**        | Follows Hibernate cascade rules     | Follows JPA `CascadeType.PERSIST`     |
| **Exception Handling**     | Fewer restrictions                  | More strict (e.g., `TransactionRequiredException`) |

---

### **When to Use:**  
- **`save`:** Suitable for cases where you need the generated ID immediately or want the entity inserted into the database right away.  
- **`persist`:** Use when following the JPA standard, ensuring strict adherence to transactions and persistence behavior.  


