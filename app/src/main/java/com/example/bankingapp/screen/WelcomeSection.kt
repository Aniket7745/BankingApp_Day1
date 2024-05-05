package com.example.bankingapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun  WelcomeSection(modifier: Modifier = Modifier) {

    Column(modifier= Modifier.padding(16.dp)) {
        Surface(color = MaterialTheme.colorScheme.onBackground,
            contentColor = MaterialTheme.colorScheme.tertiary
        ) {
            Text(text = "Welcome to the App,", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        }
        Surface(
            color = MaterialTheme.colorScheme.onBackground,
            contentColor = MaterialTheme.colorScheme.tertiary
        ) {
            Text(text = "Aniket!,",fontSize = 26.sp, fontWeight = FontWeight.Bold)
        }



    }

}
@Preview
@Composable
fun WelcomeSectionPreview() {

    WelcomeSection()
}
