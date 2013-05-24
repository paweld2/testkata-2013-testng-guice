package eu.pmsoft.testkata.testngguice.domain;

import java.util.List;

public class Department {

    private final Integer departmentID;

    private String name;
    private final List<Worker> workers;

    public Department(Integer departmentID,  List<Worker> workers) {
        this.departmentID = departmentID;
        this.workers = workers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
