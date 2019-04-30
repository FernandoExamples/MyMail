package com.udemy.fernando.mymail.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udemy.fernando.mymail.Fragments.EmailFragment;
import com.udemy.fernando.mymail.Fragments.MailsListFragment;
import com.udemy.fernando.mymail.Model.Email;
import com.udemy.fernando.mymail.R;

public class MainActivity extends FragmentActivity implements MailsListFragment.OnFragmentInteractionListener, EmailFragment.OnFragmentInteractionListener {

    boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMultiPanel();
    }

    @Override
    public void onClickItemMail(int position, Email email) {

        String sender = email.getSender();
        String subject = email.getSubject();
        String message = email.getMessage();
        String date = email.getDate();

        if(!isMultiPanel) {
            Intent intent = new Intent(this, EmailActivity.class);
            intent.putExtra("sender", sender);
            intent.putExtra("subject", subject);
            intent.putExtra("message", message);
            intent.putExtra("date", date);
            startActivity(intent);
        }else{
            EmailFragment emailFragment = (EmailFragment) getSupportFragmentManager().findFragmentById(R.id.emailFragment);
            emailFragment.showEmail(new Email(sender, subject, message, 0, date));
        }
    }

    private void setMultiPanel(){
        isMultiPanel = getSupportFragmentManager().findFragmentById(R.id.emailFragment) != null;
    }
}
