package laundrypbo.apps.model;

import laundrypbo.apps.view.LoginView;
import laundrypbo.apps.view.AddView;
import laundrypbo.apps.view.LaundryMainView;

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

  public void login(LoginView view) {
    LaundryMainView mainWindow = new LaundryMainView();
    
    view.dispose();
    mainWindow.setVisible(true);
  }

  public void saveAdd(AddView addView) {
    System.out.println("Save Berhasil Ditekan, tapi belum ke database!");
  }
}
