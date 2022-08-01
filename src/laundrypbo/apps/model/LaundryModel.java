package laundrypbo.apps.model;

import javax.swing.JOptionPane;
import laundrypbo.apps.view.FormLoginView;
import laundrypbo.apps.view.LaundryView;

/*
 *
 * @author aliazhar
 */
public class LaundryModel {
 private String username, password;
  
  public LaundryModel() {
      this.setUsername("admin");
      this.setPassword("admin123");
  }

  // private FormLoginListener formLoginListener;

  // public FormLoginListener getFormLoginListener() {
  //   return formLoginListener;
  // }

  // public void setFormLoginListener(FormLoginListener formLoginListener) {
  //   this.formLoginListener = formLoginListener;
  // }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void login(FormLoginView view) {
    JOptionPane.showMessageDialog(null, "Login Berhasil!");
//    DashboardView dashboard = new DashboardView();
    
//    view.dispose();
//    dashboard.setVisible(true);
  }

  // protected void fireOnChange() {
  //   if (formLoginListener != null) {
  //     formLoginListener.onChange(this);
  //   }
  // }
}
