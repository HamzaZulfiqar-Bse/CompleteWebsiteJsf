package beans.managedbeans;

import beans.backingbeans.User;
import db.DbConnection;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;

@ManagedBean
public class MyBean {
private User user;
private DbConnection dbConnection;

    public MyBean() {
        user = new User();
        dbConnection = new DbConnection();
    }
 public String registerAccount(){
     ResultSet resultSet = dbConnection.registerUser(user.getName(),user.getEmail(),user.getPassword());
     if (resultSet==null){
         return null;
     }
     HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
     session.setAttribute("uname", user.getName());
     session.setMaxInactiveInterval(19*60);
     return "dashboard.xhtml?faces-redirect=true";


 }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
