package com.example.paymentsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.paymentsdk.databinding.ActivityMainBinding
import com.example.paymentsdk.model.UserModel
import com.example.paymentsdk.network.CardCallback


class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.pid.userModel = UserModel("feniljagani")

        activityMainBinding.pid.setThemeColor(R.color.purple_700)
        activityMainBinding.pid.setHintColor(R.color.teal_200)
        activityMainBinding.pid.setHeader("pay")
        activityMainBinding.pid.setIconColor(R.color.teal_700)


        activityMainBinding.pid.cardCallback = object : CardCallback {
            override fun onSuccess(userModel: UserModel) {

            }

            override fun onError(throwable: Throwable?) {

            }
        }
    }
}