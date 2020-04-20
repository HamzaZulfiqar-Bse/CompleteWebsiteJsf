package beans.managedbeans;

import beans.backingbeans.User;
import db.DbConnection;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyBean {
private User user;
private DbConnection dbConnection;

    public MyBean() {
        user = new User();
        dbConnection = new DbConnection();
    }
 public String registerAccount(){
     dbConnection.registerUser(user.getName(),user.getEmail(),user.getPassword());
        return null;
 }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
