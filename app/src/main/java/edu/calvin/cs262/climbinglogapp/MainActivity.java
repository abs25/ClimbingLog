package edu.calvin.cs262.climbinglogapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_settings:  //Do the same thing if it was the settings button
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Taken from the lab

    //Settings method
    private void openSettings(){
        startActivity(new Intent(Settings.ACTION_SETTINGS));
    }

    /**
     * This will start up the activity that shows the profile page of a user.
     */
    public void startProfile(View view) {
        Intent profileIntent = new Intent(MainActivity.this, Profile.class);
        MainActivity.this.startActivity(profileIntent);
    }

    /**
     * This will start up the logger should a user click the green button.
     */
    public void startLog(View view) {
        Intent logIntent = new Intent(MainActivity.this, ClimbLogger.class);
        MainActivity.this.startActivity(logIntent);
    }

    /*
     * This will start the activity that brings the user to the Friends page
     */

    public void startFriends(View view) {
        Intent friendsIntent = new Intent(MainActivity.this, Friends.class);
        MainActivity.this.startActivity(friendsIntent);
    }

    /*
     * This will start the activity that brings the user to the Gyms page
     */

    public void startGyms(View view) {
        Intent gymsIntent = new Intent(MainActivity.this, Gyms.class);
        MainActivity.this.startActivity(gymsIntent);
    }

    /*
     * This will start the activity that brings the user to the Routes page
     */

    public void startRoutes(View view) {
        Intent routesIntent = new Intent(MainActivity.this, Routes.class);
        MainActivity.this.startActivity(routesIntent);
    }
}
