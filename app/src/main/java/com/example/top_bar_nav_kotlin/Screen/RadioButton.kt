package com.example.top_bar_nav_kotlin.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonUi() {

    val genderList by remember { mutableStateOf(listOf("Male", "Female", "Others")) }
    var genderState by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        genderList.forEach {
            Row {
                Text(text = it, modifier = Modifier.align(Alignment.CenterVertically))
                RadioButton(
                    selected = genderState == it, onClick = {
                        genderState = it
                    },
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.LightGray
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}
