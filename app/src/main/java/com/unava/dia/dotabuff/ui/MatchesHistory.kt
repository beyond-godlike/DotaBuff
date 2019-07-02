package com.unava.dia.dotabuff.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.unava.dia.dotabuff.R

import kotlinx.android.synthetic.main.activity_matches_history.*

class MatchesHistory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches_history)
        setSupportActionBar(toolbar)
    }

}
