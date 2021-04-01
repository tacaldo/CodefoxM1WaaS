package com.codefoxflashworx.codefoxm1waas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        // Configure sign-in to request the user's ID, email address, and basic
// profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        // Build a GoogleSignInClient with the options specified by gso.
        var mGoogleSignInClient = GoogleSignIn.getClient(this, gso)

// Check for existing Google Sign In account, if the user is already signed in
// the GoogleSignInAccount will be non-null.
        // Check for existing Google Sign In account, if the user is already signed in
// the GoogleSignInAccount will be non-null.
        val account = GoogleSignIn.getLastSignedInAccount(this)
//        updateUI(account)

        var signInButton = findViewById<SignInButton>(R.id.sign_in_button)
        //signInButton.setSize(SignInButton.SIZE_WIDE)
        signInButton.setSize(SignInButton.SIZE_WIDE)




    }


}