package com.bubble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileInformation : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_information)

        getCustomBar()

    }
}