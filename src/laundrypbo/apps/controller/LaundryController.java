package laundrypbo.apps.controller;

import javax.swing.JOptionPane;
import laundrypbo.apps.model.LaundryModel;
import laundrypbo.apps.view.AddView;
import laundrypbo.apps.view.DeleteView;
import laundrypbo.apps.view.EditView;
import laundrypbo.apps.view.LoginView;
import laundrypbo.apps.view.LaundryMainView;

/*
 *
 * @author aliazhar
 */
public class LaundryController {
  private LaundryModel model;
  private AddView addView;
  private EditView editView;
  private DeleteView deleteView;

  public LaundryController() {
    addView = new AddView();
    editView = new EditView();
    deleteView = new DeleteView();
  }

  public LaundryModel getModel() {
    return model;
  }

  public void setModel(LaundryModel model) {
    this.model = model;
  }

  public void login(LoginView view) {
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

  public void menuList(LaundryMainView main) {
    main.getMainPanel().removeAll();
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();

    main.getMainPanel().add(main.getListPanel());
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();
  }

  public void menuAdd(LaundryMainView main) {
    main.getMainPanel().removeAll();
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();

    main.getMainPanel().add(addView.getAddPanel());
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();
  }

  public void menuEdit(LaundryMainView main) {
    main.getMainPanel().removeAll();
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();

     main.getMainPanel().add(editView.getEditPanel());
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();
  }

  public void menuDelete(LaundryMainView main) {
    main.getMainPanel().removeAll();
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();

     main.getMainPanel().add(deleteView.getDeletePanel());
    main.getMainPanel().repaint();
    main.getMainPanel().revalidate();
  }
}
