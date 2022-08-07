package laundrypbo.apps.controller;

import javax.swing.JOptionPane;
import laundrypbo.apps.aboutUs.AboutAdni;
import laundrypbo.apps.aboutUs.AboutAli;
import laundrypbo.apps.aboutUs.AboutAzka;
import laundrypbo.apps.aboutUs.AboutYuan;
import laundrypbo.apps.aboutUs.AboutAldi;
import laundrypbo.apps.model.LaundryModel;
import laundrypbo.apps.view.AboutView;
import laundrypbo.apps.view.LaundryMainView;

/*
 *
 * @author Aldiansyah
 */
public class AboutController {
  private LaundryModel model;
  private AboutAldi aboutAldi;
   private AboutAdni aboutAdni;
    private AboutAli aboutAli;
     private AboutAzka aboutAzka;
      private AboutYuan aboutYuan;
  


  public AboutController() {

    aboutAldi = new AboutAldi();
    aboutAdni = new AboutAdni();
    aboutAli = new AboutAli();
    aboutAzka = new AboutAzka();
    aboutYuan = new AboutYuan();
    
  }

  public LaundryModel getModel() {
    return model;
  }

  public void setModel(LaundryModel model) {
    this.model = model;
  }

 
  public void menuAldi(AboutView main) {
    main.getViewAbout().removeAll();
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();

    main.getViewAbout().add(aboutAldi.getAldiPanel());
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();
  }
  
   public void menuAdni(AboutView main) {
    main.getViewAbout().removeAll();
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();

    main.getViewAbout().add(aboutAdni.getAdniPanel());
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();
  }
   
    public void menuAli(AboutView main) {
    main.getViewAbout().removeAll();
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();

    main.getViewAbout().add(aboutAli.getAliPanel());
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();
  }
    
     public void menuAzka(AboutView main) {
    main.getViewAbout().removeAll();
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();

    main.getViewAbout().add(aboutAzka.getAzkaPanel());
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();
  }
     
      public void menuYuan(AboutView main) {
    main.getViewAbout().removeAll();
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();

    main.getViewAbout().add(aboutYuan.getYuanPanel());
    main.getViewAbout().repaint();
    main.getViewAbout().revalidate();
  }
}
