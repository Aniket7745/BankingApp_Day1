package com.example.bankingapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar() {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, top = 32.dp, end = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween



        ) {
            Surface(
                color = MaterialTheme.colorScheme.onBackground,
                contentColor = MaterialTheme.colorScheme.tertiary
            ) {

                Icon(
                    Icons.Rounded.List, contentDescription = "",

                    modifier = Modifier.size(50.dp),
                )

            }
            Surface(
                color = MaterialTheme.colorScheme.onBackground,
                contentColor = MaterialTheme.colorScheme.tertiary
            ) {
                Icon(
                    Icons.Rounded.Person, contentDescription = "",
                    modifier = Modifier.size(50.dp)
                )
            }




        }
    }

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun TopBarPreview() {
    TopBar()
}