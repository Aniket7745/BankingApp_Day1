import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TransactionSection(modifier: Modifier = Modifier) {


    Surface(
        color = MaterialTheme.colorScheme.onBackground,
        contentColor = MaterialTheme.colorScheme.tertiary
    ) {
        Text(
            text = "Transactions,", fontSize = 26.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
    }


    Column(modifier= Modifier.fillMaxSize(),
        ) {
       PaymentHistoryCredit()
        Spacer(modifier = Modifier.size(26.dp))
        PaymentHistoryDebit()
        Spacer(modifier = Modifier.size(26.dp))
        PaymentHistoryCredit()

    }

}

@Composable
fun PaymentHistoryCredit(modifier: Modifier = Modifier) {

        Card(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 2.dp, top = 2.dp)
                .size(500.dp, 80.dp),
            colors = CardDefaults
                .cardColors(MaterialTheme.colorScheme.primary)


        ){
            Row(modifier= Modifier
                .fillMaxSize()
                .padding(20.dp),
                Arrangement.SpaceBetween
            ) {
                Icon(Icons.Rounded.AddCircle, contentDescription ="",
                    modifier= Modifier.size(40.dp),

                    )
                Column {

                    Text(
                        text = "Received by Zomato Refund", fontSize = 12.sp, fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(end = 50.dp))

                    Text(
                        text = "01/05/24", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp))
                }

                Text(
                    text = "$20.00", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Green,
                    modifier = Modifier.padding(top = 8.dp)
                )

            }

        }
    }


@Composable
fun PaymentHistoryDebit(modifier: Modifier = Modifier) {

        Card(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 2.dp, top = 2.dp)
                .size(500.dp, 80.dp),
            colors = CardDefaults
                .cardColors(MaterialTheme.colorScheme.primary)


        ){
            Row(modifier= Modifier
                .fillMaxSize()
                .padding(20.dp),
                Arrangement.SpaceBetween
            ) {
                Icon(Icons.Rounded.AddCircle, contentDescription ="",
                    modifier= Modifier.size(40.dp),

                    )
                Column {

                    Text(
                        text = "Received by Zomato Refund", fontSize = 12.sp, fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(end = 50.dp))

                    Text(
                        text = "01/05/24", fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 10.dp))
                }

                Text(
                    text = "$20.00", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Red,
                    modifier = Modifier.padding(top = 8.dp)
                )

            }

        }
    }



    


@Preview
@Composable
fun TransactionPreview() {
    TransactionSection()
}