package com.norm.myroomdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.norm.myroomdb.ui.MainScreen
import com.norm.myroomdb.ui.theme.MyRoomDbTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyRoomDbTheme {
                MainScreen()
            }
        }
    }
}