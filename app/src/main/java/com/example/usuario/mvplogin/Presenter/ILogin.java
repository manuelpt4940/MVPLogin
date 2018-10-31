package com.example.usuario.mvplogin.Presenter;

public interface ILogin {
    interface ILoginPresenter {
        void onLogin(String email, String password);
    }
    interface IUser {
        String getEmail();
        String getPassword();
        int isValidData();
    }
    interface ILoginView{
        void onLoginSuccess(String message);
        void onLoginError(String message);
    }
}
