package com.example.quizapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StudentInfo(fio: String, groupNumber: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "ФИО: $fio")
        Text(text = "Номер группы: $groupNumber")
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val studentName = "Иванов Иван Иванович"
    val groupNumber = "Группа 12345"

    StudentInfo(studentName, groupNumber)
}