package com.example.mylibrary

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.just.library.AgentWeb

/**
 * Created by finfo on 10/10/17.
 */
open class BaseActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}