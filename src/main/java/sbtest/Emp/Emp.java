package sbtest.Emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp99")

public class Emp {
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private float salary;
    private String designation;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Emp() {}

    public Emp(int id, String name, float salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
}
