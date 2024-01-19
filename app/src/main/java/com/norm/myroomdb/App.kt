package com.norm.myroomdb

import android.app.Application
import com.norm.myroomdb.data.MainDb

class App : Application() {
    val database by lazy {
        MainDb.crateDataBase(this)
    }
}