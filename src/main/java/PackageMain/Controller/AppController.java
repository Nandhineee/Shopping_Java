package PackageMain.Controller;


import PackageMain.Controller.imp.IAppController;
import PackageMain.View.WelcomePage;

public class AppController implements IAppController {

    WelcomePage welcomeMsg;
    AuthController authController;

    public AppController() {
        welcomeMsg = new WelcomePage();
        authController = new AuthController();
    }

    @Override
    public void init() {
        welcomeMsg.welcomeMsg();
        authController.authMenu();

    }
}
