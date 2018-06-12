package Microblog;

public class User {
    private String avatarUrl;
    private String userName;
    private String realname;
    private String email;


    public User( String userName,
                 String avatarUrl,
                 String realname,
                 String email ) {
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this .realname = realname;
        this.email = email;

    }

    public String getUserName()

    {
        return this.userName;
    }



}
