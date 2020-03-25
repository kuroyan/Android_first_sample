package jp.lgs.android_first_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun toForm2Click( view: View)
    {
        val intent = Intent(applicationContext,Main2Activity::class.java)
        //-- toastは以下でもstartActivityの後でも表示タイミングは関係ないようだ
        //toastMake("画面変更中！！",0,-100)
        startActivity(intent)
        Id_form1Txtt.setText(R.string.helloAgain)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
