package jp.lgs.android_first_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }


    fun onClickReturnForm1(view: View) {
        //--　以下どちらでも機能する。ステータスとすればどうなのか？

        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)

        //-- ここで以下をやると暴走する
        //Id_form1Txtt.setText(R.string.helloAgain)

        //finish()
    }

    fun onClickGotoFrm3(view: View){
        val intent = Intent(applicationContext,Main3Activity::class.java)
        startActivity(intent)
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
