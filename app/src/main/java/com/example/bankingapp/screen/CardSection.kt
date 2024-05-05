package com.example.bankingapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.R

@Composable
fun CardSection(modifier: Modifier = Modifier) {


    Surface(
        color = MaterialTheme.colorScheme.onBackground,

    ) {
        Column(modifier = Modifier) {
            CardsDesign()

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                color = MaterialTheme.colorScheme.onBackground,
                contentColor = MaterialTheme.colorScheme.primary
            ) {


                Icon(
                    Icons.Default.MoreVert, contentDescription = "",
                    modifier= Modifier
                        .size(30.dp)
                        .rotate(90f)

                )
            }
        }
    }
}


@Composable
fun CardsDesign(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 2.dp, top = 2.dp)
            .size(500.dp, 200.dp),
        colors = CardDefaults
            .cardColors(MaterialTheme.colorScheme.primary),
        ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.state_bank_of_india), contentDescription = "null",
                    modifier = Modifier.padding(start = 5.dp).size(55.dp)
                )

                Icon(
                    painter = painterResource(id = R.drawable.visa_new_2021), contentDescription = "null",
                    modifier = Modifier.size(50.dp).padding(end=5.dp)
                )
            }
            Spacer(modifier = Modifier.size(26.dp))
             Text(
                text = "xxxx xxxx xxxx 1234", fontSize = 22.sp,
                modifier = Modifier.padding(10.dp)
            )
            Icon(Icons.Filled.Refresh, contentDescription = "",modifier = Modifier.padding(start = 10.dp))
            Spacer(modifier = Modifier.size(5.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Aniket Kundu", fontSize = 16.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "24/30", fontSize = 16.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }

        }


    }
    
}

@Preview
@Composable
fun CardPreview() {
    CardSection()
}