package jp.lgs.android_first_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun onClickBackFrm2(view: View){
        //val intent = Intent(applicationContext,Main2Activity::class.java)
        //startActivity(intent)

        finish()
    }


}
