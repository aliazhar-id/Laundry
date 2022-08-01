package laundrypbo.apps.controller;

import javax.swing.JOptionPane;
import laundrypbo.apps.model.LaundryModel;
import laundrypbo.apps.view.FormLoginView;
import laundrypbo.apps.view.LaundryView;
/*
 *
 * @author aliazhar
 */
public class LaundryController {
  private LaundryModel model;

  public LaundryModel getModel() {
    return model;
  }

  public void setModel(LaundryModel model) {
    this.model = model;
  }

  public void login(FormLoginView view) {
    String username = view.getTxtUser().getText();
    String password = view.getTxtPass().getText();

    if (!username.trim().equals(model.getUsername())) {
      JOptionPane.showMessageDialog(view, "Username atau Password yang anda masukkan salah!");
    } else if (!password.trim().equals(model.getPassword())) {
      JOptionPane.showMessageDialog(view, "Username atau Password yang anda masukkan salah!");
    } else {
      model.login(view);
    }
  }
}



/*
 *
 * @author aliazhar
 */
// public class FormLoginController {
//   private FormLoginModel model;

//   public FormLoginModel getModel() {
//     return model;
//   }

//   public void setModel(FormLoginModel model) {
//     this.model = model;
//   }

//   public void loginForm(FormLoginView view) {
//     String username = view.getTxtUser().getText();
//     String password = view.getTxtPass().getText();

//     if (!username.trim().equals(model.getUsername())) {
//       JOptionPane.showMessageDialog(view, "Username atau Password yang anda masukkan salah!");
//     } else if (!password.trim().equals(model.getPassword())) {
//       JOptionPane.showMessageDialog(view, "Username atau Password yang anda masukkan salah!");
//     } else {
//       model.loginForm(view);
//     }
//   }
// }
