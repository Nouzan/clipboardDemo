package com.nouzan.nouzan.clipboraddemo

import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.widget.Button
import com.nouzan.nouzan.clipboraddemo.base.BaseActivity
import org.jetbrains.anko.find

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val button1: Button = find(R.id.button_1)
        button1.setOnClickListener {
            SecondActivity.actionStart(MainActivity@this, "退出")
        }
        //监听剪贴板
        val clipboard:ClipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.addPrimaryClipChangedListener {
            SecondActivity.actionStart(MainActivity@this, "我被剪贴板召唤而来")
        }
    }


}
