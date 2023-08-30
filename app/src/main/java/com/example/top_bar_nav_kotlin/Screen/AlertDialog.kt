package com.example.top_bar_nav_kotlin.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun AlertDialogUi() {

    var isDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            isDialog = true
        }) {
            Text(text = "open dialog box")
        }

        if (isDialog) {
            AlertDialog(
                onDismissRequest = {
                    isDialog = false
                },
                title = {
                    Text(text = "Title")
                },
                text = {
                    Text(text = "Dialog box contents")
                },
                confirmButton = {
                    Button(
                        onClick = {
                            isDialog = false
                        },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text("OK")
                    }
                }
            )
        }
    }
}
