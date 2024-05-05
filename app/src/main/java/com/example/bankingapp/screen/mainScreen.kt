import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingapp.screen.CardSection
import com.example.bankingapp.screen.TopBar
import com.example.bankingapp.screen.WelcomeSection

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
      Column {
          TopBar()
            Spacer(modifier = Modifier.size(20.dp))
          WelcomeSection()
            Spacer(modifier = Modifier.size(26.dp))
          CardSection()

          TransactionSection()

      }


}
@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}