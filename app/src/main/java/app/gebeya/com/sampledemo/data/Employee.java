package app.gebeya.com.sampledemo.data;

/**
 * Created by gebeya-admin on 4/8/17.
 */

public class Employee {

    long id;
    String emp_name;
    int age;

    public Employee(long id, String emp_name, int age) {
        this.id = id;
        this.emp_name = emp_name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
