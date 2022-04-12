package com.example.paymentsdk

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.paymentsdk.databinding.ActivityMainBinding
import com.example.paymentsdk.model.UserModel
import com.example.paymentsdk.network.CardCallback
import com.example.paymentsdk.view.PaymentCard


class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.pid.userModel = UserModel("payment@gmail.com")

        activityMainBinding.pid.setThemeColor(R.color.purple_700)
        activityMainBinding.pid.setHintColor(R.color.teal_200)
        activityMainBinding.pid.setHeader("pay")
        activityMainBinding.pid.setIconColor(R.color.teal_700)


        activityMainBinding.pid.cardCallback = object : CardCallback {
            override fun onSuccess(userModel: UserModel) {
                Toast.makeText(this@MainActivity, "Token: ${userModel.strToken}", Toast.LENGTH_SHORT).show()
            }

            override fun onError(throwable: Throwable?) {
                if(throwable is PaymentCard.InvalidResponseException){
                    Toast.makeText(this@MainActivity,throwable.message,Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@MainActivity,getString(R.string.server_error),Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}