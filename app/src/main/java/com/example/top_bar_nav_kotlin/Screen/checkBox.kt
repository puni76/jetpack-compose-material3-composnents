package com.example.top_bar_nav_kotlin.Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun CheckBoxUi() {

    var isChecked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = {
                isChecked = it
            },
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Yellow,
                checkmarkColor = Color.Black
            )
        )

        //  CustomCheckBox()
    }

}


@Composable
fun CustomCheckBox() {

    var isCheck by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {


        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Card(
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Box(modifier = Modifier
                    .background(
                        if (isCheck) Color.Green else Color.White
                    )
                    .clickable {
                        isCheck = !isCheck
                    }
                    .size(25.dp),
                    contentAlignment = Alignment.Center
                ) {
                    if (isCheck)
                        Icon(Icons.Default.Check, contentDescription = "", tint = Color.White)
                }
            }

            Text(
                text = "Accept all terms & conditions", modifier = Modifier
                    .padding(start = 5.dp)
                    .align(CenterVertically)
            )
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomEditText() {

    var name by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = name, onValueChange = {
                name = it
            },
            label = {

                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = 20.dp),
                    horizontalArrangement = Arrangement.End,

                    ) {
                    Text(text = "Username", textAlign = TextAlign.End)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
    }

}