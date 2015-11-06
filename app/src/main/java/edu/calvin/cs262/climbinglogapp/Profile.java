package edu.calvin.cs262.climbinglogapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by cpd5 on 10/12/2015.
 * This is the page that will contain the profile of the user.
 */
public class Profile extends FragmentActivity {

    //onCreate() method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Button disableProfile = (Button) findViewById(R.id.profile_button);
        disableProfile.setEnabled(false);
    }

    protected void onPause() {
        super.onPause();
    }
}
