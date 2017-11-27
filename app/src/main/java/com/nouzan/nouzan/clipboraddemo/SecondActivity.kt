package com.nouzan.nouzan.clipboraddemo

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nouzan.nouzan.clipboraddemo.base.ActivityCollector
import com.nouzan.nouzan.clipboraddemo.base.BaseActivity
import org.jetbrains.anko.find

class SecondActivity : BaseActivity() {

    companion object {
        fun actionStart(context: Context, buttonName: String) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("button_name", buttonName)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val button2: Button = find(R.id.button_2)
        button2.text = intent.getStringExtra("button_name")
        button2.setOnClickListener {
            ActivityCollector.finishAll()
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }

}
