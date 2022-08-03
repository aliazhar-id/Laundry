package laundrypbo.apps.model;

import laundrypbo.apps.view.FormLoginView;
import laundrypbo.apps.view.LaundryCreateView;
import laundrypbo.apps.view.LaundryDeleteView;
import laundrypbo.apps.view.LaundryEditView;
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
    LaundryView mainWindow = new LaundryView();
    
    view.dispose();
    mainWindow.setVisible(true);
  }

  // Go To List Window
  public void gotoListWindow(LaundryView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  public void gotoListWindow(LaundryEditView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  public void gotoListWindow(LaundryDeleteView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  // Go To Add Window
  public void gotoAddWindow(LaundryView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  public void gotoAddWindow(LaundryEditView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  public void gotoAddWindow(LaundryDeleteView view) {
    view.dispose();
    LaundryCreateView window = new LaundryCreateView();
    window.setVisible(true);
  }

  // Go To Edit Window
  public void gotoEditWindow(LaundryView view) {
    view.dispose();
    LaundryEditView window = new LaundryEditView();
    window.setVisible(true);
  }

  public void gotoEditWindow(LaundryCreateView view) {
    view.dispose();
    LaundryEditView window = new LaundryEditView();
    window.setVisible(true);
  }

  public void gotoEditWindow(LaundryDeleteView view) {
    view.dispose();
    LaundryEditView window = new LaundryEditView();
    window.setVisible(true);
  }

  // Go To Delete Window
  public void gotoDeleteWindow(LaundryView view) {
    view.dispose();
    LaundryDeleteView window = new LaundryDeleteView();
    window.setVisible(true);
  }

  public void gotoDeleteWindow(LaundryCreateView view) {
    view.dispose();
    LaundryDeleteView window = new LaundryDeleteView();
    window.setVisible(true);
  }

  public void gotoDeleteWindow(LaundryEditView view) {
    view.dispose();
    LaundryDeleteView window = new LaundryDeleteView();
    window.setVisible(true);
  }





  // protected void fireOnChange() {
  //   if (formLoginListener != null) {
  //     formLoginListener.onChange(this);
  //   }
  // }
}
