package Model;

public abstract class User {
    protected String userId;
    protected String username;

    public User(String userId, String username){
        this.userId = userId;
        this.username = username;
    }

}
