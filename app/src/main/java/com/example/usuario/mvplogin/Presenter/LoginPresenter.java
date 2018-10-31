package com.example.usuario.mvplogin.Presenter;

import com.example.usuario.mvplogin.Model.User;
import com.example.usuario.mvplogin.View.MainActivity;

public class LoginPresenter implements ILogin.ILoginPresenter {
    MainActivity loginView;

    public LoginPresenter(MainActivity loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email,password);
        int loginCode = user.isValidData();

        if(loginCode==0){
            loginView.onLoginError("You must enter your email");
        }else if(loginCode==1){
            loginView.onLoginError("Write your email again");
        }else if (loginCode==2){
            loginView.onLoginError("Your password is too short");
        }else{
            loginView.onLoginSuccess("Login Successfully");
        }
    }
}
