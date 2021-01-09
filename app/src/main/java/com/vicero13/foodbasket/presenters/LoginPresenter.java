package com.vicero13.foodbasket.presenters;

import android.content.Intent;

import com.vicero13.foodbasket.User;
import com.vicero13.foodbasket.database.DBHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPresenter {


    public void onLogin(String email, String password) {
        User user = new User(email, password);
        DBHandler dbHandler = new DBHandler();

        //NEW THREAD!!!!
        ResultSet result = dbHandler.getUser(user);
        int counter = 0;

        try {
            while (result.next()) {
                counter++;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        if (counter >= 1){
            isSuccessfulLogin();
        }

    }

    public boolean isSuccessfulLogin(){
        return true;
    }
}
