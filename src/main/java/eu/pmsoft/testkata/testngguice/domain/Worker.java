package eu.pmsoft.testkata.testngguice.domain;

public class Worker {

    private final Integer workerID;
    private String name;
    private Department department;

    public Worker(Integer workerID) {
        this.workerID = workerID;
    }

    public Integer getWorkerID() {
        return workerID;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
