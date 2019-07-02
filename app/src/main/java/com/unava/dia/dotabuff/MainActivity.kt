package com.unava.dia.dotabuff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.unava.dia.dotabuff.ui.MatchesHistory
import com.unava.dia.dotabuff.ui.OneMatch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            // передаем в активити номер акка
            val intent = Intent(this@MainActivity, MatchesHistory::class.java)
            intent.putExtra("value", editText.text.toString())
            startActivity(intent)
        }

        button2.setOnClickListener {
            // передаем номер матча
            val intent = Intent(this@MainActivity, OneMatch::class.java)
            intent.putExtra("value", editText2.text.toString())
            startActivity(intent)
        }
    }
}
