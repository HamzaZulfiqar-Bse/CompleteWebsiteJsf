package beans.managedbeans;

import beans.backingbeans.User;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyBean {
private User user;

    public MyBean() {
        user= new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
