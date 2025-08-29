package kr.co.prnd.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.co.prnd.apple.Apple
import kr.co.prnd.banana.Banana
import kr.co.prnd.sample.ui.theme.SampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Apple()
            Text(text = Banana().getName())
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    SampleTheme {
        MainScreen()
    }
}
