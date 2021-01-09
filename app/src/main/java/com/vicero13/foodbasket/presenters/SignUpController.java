/*
package com.vicero13.foodbasket.presenters;

import android.view.View;
import android.widget.Button;

import com.vicero13.foodbasket.R;
import com.vicero13.foodbasket.User;
import com.vicero13.foodbasket.database.DBHandler;

public class SignUpController {


    public void init(){

        Button btn = (Button)
        .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpNewUser();
            }
        });
    }

    public void signUpNewUser() {
        DBHandler dbHandler = new DBHandler();

        String email = findViewById(R.id.etEmail).toString();
        String password = findViewById(R.id.etPassword).toString();

        User user = new User(email, password);

        // NEED New Thread !!!
        dbHandler.signUpUser(user);
    }

}
*/
