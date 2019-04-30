package com.udemy.fernando.mymail.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udemy.fernando.mymail.Fragments.EmailFragment;
import com.udemy.fernando.mymail.Model.Email;
import com.udemy.fernando.mymail.R;

public class EmailActivity extends AppCompatActivity implements EmailFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        Bundle bundle = getIntent().getExtras();
        String subject = "";
        String sender = "";
        String message = "";
        String date = "";

        if(bundle != null){
            subject = bundle.getString("subject");
            sender = bundle.getString("sender");
            date = bundle.getString("date");
            message = bundle.getString("message");
        }

        EmailFragment emailFragment = (EmailFragment) getSupportFragmentManager().findFragmentById(R.id.emailFragment);
        emailFragment.showEmail(new Email(sender, subject, message, 0, date));
    }
}
