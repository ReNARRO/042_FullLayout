package com.example.praktikumlayouting

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumlayouting.ui.theme.PraktikumlayoutingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PraktikumlayoutingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}


@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "ENDRIARTO D",
            fontSize = 30.sp)
        Spacer(modifier = Modifier
            .padding(5.dp)
        )
        BoxHeader()
        Spacer(modifier = Modifier
            .padding(20.dp)
        )
        Lokasi()
        Spacer(modifier = Modifier
            .padding(10.dp)
        )
        Keterangan()
        
    }
}
@Composable
fun BoxHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(Color.Gray)){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(R.drawable.img_logoorang) ,
                contentDescription = "",
                modifier = Modifier
                    .size(300.dp)
                    .padding(20.dp)
            )
            Text(
                text = "Rain",
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(10.dp)
            )
        }
    }

}
@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier
        .padding(5.dp)
    )
    Row {
        Image(painter = painterResource(R.drawable.baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier
                .size(40.dp)
        )
        Spacer(modifier = Modifier
            .padding(5.dp)
        )
        Text(
            text = "Yogyakarta",
            fontSize = 30.sp,
        )
    }
    Spacer(modifier = Modifier
        .padding(5.dp)
    )
    Text(
        text = "Kasihan, Kabupaten Bantul,",
        textAlign = TextAlign.Center,
        color = Color.Gray
    )
    Text(
        text = "Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Gray
    )

}

@Composable
fun Keterangan(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(color = Color.Gray)
        .height(200.dp)
    ){
        Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize(), verticalArrangement = Arrangement.SpaceAround
        ){
            Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()){
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Humidity", fontSize = 20.sp)
                    Text(text = "98%", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "UV Index", fontSize = 20.sp)
                    Text(text = "9/10",  fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
            }

            Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()){
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Sunrise", fontSize = 20.sp)
                    Text(text = "05.00 AM",  fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Sunset", fontSize = 20.sp)
                    Text(text = "05.40 PM", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PraktikumlayoutingTheme {
        Surface {
            Home()

        }

    }
}
