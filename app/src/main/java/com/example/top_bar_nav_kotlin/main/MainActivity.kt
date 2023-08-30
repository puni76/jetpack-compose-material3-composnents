package com.example.top_bar_nav_kotlin.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.top_bar_nav_kotlin.Screen.AlertDialogUi
import com.example.top_bar_nav_kotlin.Screen.CheckBoxUi
import com.example.top_bar_nav_kotlin.Screen.CustomCheckBox
import com.example.top_bar_nav_kotlin.Screen.CustomEditText
import com.example.top_bar_nav_kotlin.Screen.CustomToggleButton
import com.example.top_bar_nav_kotlin.Screen.PickImageFromGallery
import com.example.top_bar_nav_kotlin.Screen.RadioButtonUi
import com.example.top_bar_nav_kotlin.Screen.TabNavigation
import com.example.top_bar_nav_kotlin.Screen.TextFieldLayout
import com.example.top_bar_nav_kotlin.ui.theme.TopbarnavkotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopbarnavkotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScrollableColumnContent()
                }

            }
        }
    }
}
@Composable
fun ScrollableColumnContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(vertical = 10.dp),
        contentPadding = PaddingValues(20.dp) // Optional: Add padding for spacing
    ) {
        item {
            TabNavigation()
        }
        item {
            TextFieldLayout()
        }

        item {
            AlertDialogUi()
        }

        item {
            RadioButtonUi()
        }

        item{
            PickImageFromGallery()
        }
        item {
            CustomToggleButton()
        }
        item {
            CustomCheckBox()
        }
        item {
            CustomEditText()
        }
        item {
            CheckBoxUi()
        }
    }
}