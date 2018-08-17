package Model;

public class Manager extends User {
    private String managerId;
    public Manager(String userId, String username, String managerId) {
        super(userId, username);
        this.managerId = managerId;
    }
}
