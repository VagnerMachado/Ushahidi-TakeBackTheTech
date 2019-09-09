package edu.ncc.machado.ushahidi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/***************************************************************************************************
 ****** This is the Project 2 for the Mobile application Course in Nassau Community College  *******
 *
 * This application uses Ushahidi Deployments and an API call to TakeBackTheTeck.net to retrieve and
 * parse incident data. A Splash layout provides the user with a brief description of the app and
 * its purpose. A GoogleMap Fragment is then loaded with markers based on each incidents'
 * location. Upon being clicked, each markers shows a title and snippet with data for each incident.
 * The detailed description for each class and method used can be found in their Javadoc comments
 *
 * ***********************  Vagner Machado - Fall 2016 - N00820127  ********************************
 **************************************************************************************************/



/**
 * Splash Class - extends AppCompatActivity and implements View.OnClickListener
 * The purpose of this class is to provide code to control a Splash page displayed to the
 * user before the map and markers are loaded. Therefore, this layout and java class provide
 * information about the application's purpose.
 */
public class Splash extends AppCompatActivity implements View.OnClickListener {
    //the button that starts the map activity
    private Button button;

    @Override
/**
 * onCreate method - here the layout and Bundle data are loaded.
 * the Button View is linked and  the listener for it is set
 * */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        button = (Button)findViewById(R.id.goButton);
        button.setOnClickListener(this);

    }

    @Override
    /**
     * onClick method - controls what happens when user clicks on 'go' button
     * When that happens, the MapsActivity launches
     */
    public void onClick(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
