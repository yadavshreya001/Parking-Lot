package models;

public class Operator extends BaseModel {
    private String name;    // Name of the operator managing the gate
    private int empId;      // Unique employee ID for the operator

    // Getter method for 'name'
    public String getName() {
        return name;
    }
    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }
    // Getter method for 'empId'
    public int getEmpId() {
        return empId;
    }
    // Setter method for 'empId'
    public void setEmpId(int empId) {
        this.empId = empId;
    }
}