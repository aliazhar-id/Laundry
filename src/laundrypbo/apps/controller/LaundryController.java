package laundrypbo.apps.controller;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import laundrypbo.apps.model.LaundryModel;
import laundrypbo.apps.view.AboutView;
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
    // private AddView addView;
    private EditView editView;
    private DeleteView deleteView;
    private AboutView aboutView;

    public LaundryController() {
        // addView = new AddView();
        editView = new EditView();
        deleteView = new DeleteView();
        aboutView = new AboutView();
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

    private void setActiveBtn(JPanel btnActive, LaundryMainView main) {
        main.getBtnListPanel().setBackground(Color.decode("#D64541"));
        main.getBtnAddPanel().setBackground(Color.decode("#D64541"));
        main.getBtnEditPanel().setBackground(Color.decode("#D64541"));
        main.getBtnDeletePanel().setBackground(Color.decode("#D64541"));
        main.getBtnAboutPanel().setBackground(Color.decode("#D64541"));

        btnActive.setBackground(Color.decode("#B05246"));
//         btnActive.setBackground(Color.decode("#FE7968"));
    }

    public void menuList(LaundryMainView main) {
        setActiveBtn(main.getBtnListPanel(), main);

        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
        main.showData();
        main.getMainPanel().add(main.getListPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }

    public void menuAdd(LaundryMainView main) {
        setActiveBtn(main.getBtnAddPanel(), main);

        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();

        AddView addView = new AddView(main);

        main.getMainPanel().add(addView.getAddPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }

    public void menuEdit(LaundryMainView main) {
        setActiveBtn(main.getBtnEditPanel(), main);

        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();

        main.getMainPanel().add(editView.getEditPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }

    public void menuDelete(LaundryMainView main) {
        setActiveBtn(main.getBtnDeletePanel(), main);

        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();

        main.getMainPanel().add(deleteView.getDeletePanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }

    public void saveAdd(AddView addView) {
        model.saveAdd(addView);

        this.menuList(addView.getMainView());
    }

    public void resetAdd(AddView addView) {
        addView.getTxtAddNama().setText("");
        addView.getComboAddLayanan().setSelectedIndex(0);
        addView.getTxtAddBerat().setText("");
        addView.getTxtAddTglMasuk().setText("");
    }

    public void menuAbout(LaundryMainView main) {
        setActiveBtn(main.getBtnAboutPanel(), main);

        main.getMainPanel().removeAll();
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();

        main.getMainPanel().add(aboutView.getAboutPanel());
        main.getMainPanel().repaint();
        main.getMainPanel().revalidate();
    }

    public void logOut(LaundryMainView main) {
        main.dispose();

        LoginView loginWindow = new LoginView();

        loginWindow.setVisible(true);
    }
}
