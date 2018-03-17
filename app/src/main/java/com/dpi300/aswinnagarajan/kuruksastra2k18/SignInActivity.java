package com.dpi300.aswinnagarajan.kuruksastra2k18;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {

    int RC_SIGN_IN = 123;
    /*private FirebaseAuth mAuth;*/

    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        constraintLayout = findViewById(R.id.constraintLayout_SignIn);

        /*final List<AuthUI.IdpConfig> providers = Collections.singletonList(
                new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build());*/

        Button button_signIn = findViewById(R.id.button_signIn);
        button_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* startActivityForResult(
                        AuthUI.getInstance()
                                .createSignInIntentBuilder()
                                .setAvailableProviders(providers)
                                //.setLogo(R.drawable.google_logo1)
                                .build(),
                        RC_SIGN_IN);*/

                ConstraintSet constraintSet_1 = new ConstraintSet();
                ConstraintSet constraintSet_2 = new ConstraintSet();

                constraintSet_2.clone(getApplicationContext(), R.layout.content_sign_in_1);
                constraintSet_1.clone(constraintLayout);

                TransitionManager.beginDelayedTransition(constraintLayout);
                constraintSet_2.applyTo(constraintLayout);


            }
        });

       /* mAuth = FirebaseAuth.getInstance();
        mAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                if (( firebaseAuth.getCurrentUser()== null)) {

                }else {

                   *//* Intent i = new Intent(SiginInAdmin.this , ScrollingActivity_AdminScreen.class);
                    i.putExtra("key",firebaseAuth.getUid());
                    startActivity(i);
                    finish();*//*
                }
            }

        });
*/
    }

   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if (resultCode == ResultCodes.OK) {
                // Successfully signed in
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                *//*Intent i = new Intent(getApplicationContext() , ScrollingActivity_AdminScreen.class);
                startActivity(i);*//*
                // ...
            } else {
                // Sign in failed, check response for error code
                // ...
                Snackbar.make(findViewById(android.R.id.content), "Sign In Failed..",
                        Snackbar.LENGTH_SHORT).show();

            }
        }
    }*/
}
