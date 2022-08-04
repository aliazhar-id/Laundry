package laundrypbo.apps.controller;

import laundrypbo.apps.model.LaundryModel;
import laundrypbo.apps.view.AddView;
import laundrypbo.apps.view.LaundryMainView;

/*
 *
 * @author aliazhar
 */
public class AddController {

    private LaundryModel model;

    public LaundryModel getModel() {
        return model;
    }

    public void setModel(LaundryModel model) {
        this.model = model;
    }

    public void saveAdd(AddView addView) {
        model.saveAdd(addView);

        LaundryController controller = new LaundryController();
        LaundryMainView main = new LaundryMainView();
        controller.menuList(main);
    }

    public void resetAdd(AddView addView) {
        addView.getTxtAddNama().setText("");
        addView.getComboAddLayanan().setSelectedIndex(0);
        addView.getTxtAddBerat().setText("");
        addView.getTxtAddTglMasuk().setText("");
    }

}
