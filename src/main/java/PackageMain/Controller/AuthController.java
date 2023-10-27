package PackageMain.Controller;

import PackageMain.App;
import PackageMain.Controller.imp.IAuthController;
import PackageMain.Utils.AppException;
import PackageMain.Utils.AppInput;
import PackageMain.Utils.StringUtils;
import PackageMain.View.AuthPage;

public class AuthController implements IAuthController {
    private final AuthPage authPage;

    public AuthController() {
        authPage=new AuthPage();
    }


    @Override
    public void authMenu() {
        authPage.AuthMenu();

        int choice;
        try {
            choice= AppInput.IntInput(StringUtils.ENTER_CHOICE);
        } catch (AppException appException) {
            throw new ;
        }


    }
}
