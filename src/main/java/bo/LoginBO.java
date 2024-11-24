package bo;

import po.LoginPO;

public class LoginBO {

    public void login() {
        LoginPO login = new LoginPO();
    }

    // Input login
    public static void inputLogin(String username) {
        LoginPO.inputUsername(username);
    }

    // Click login button
    public static void clickLoginButton() {
        LoginPO.clickLoginButton();
    }

    // Input password
    public static void inputPassword(String password) {
        LoginPO.inputPassword(password);
    }

    // Verify user is logged in
    public static boolean isLoggedIn() {
        return LoginPO.isUserLoggedIn();
    }
}
