package eu.pmsoft.testkata.testngguice.domain;

public class User {

    private final String userID;
    private final Worker worker;
    private final Role role;

    public User(String userID, Worker worker, Role role) {
        this.userID = userID;
        this.worker = worker;
        this.role = role;
    }

    public Worker getWorker() {
        return worker;
    }

    public Role getRole() {
        return role;
    }

    public String getUserID() {
        return userID;
    }
}
