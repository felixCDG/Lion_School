package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen (){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .fillMaxWidth()
                    .height(300.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(166.dp)
                        .width(133.dp)

                )
                Text(
                    text = "Lion\nSchool",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xff3347B0),
                    fontSize = 40.sp

                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Find your favorite course",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xff3347B0),
                    fontSize = 22.sp

                )
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(bottom = 25.dp)
                        .height(5.dp)
                        .width(60.dp),
                    colors = CardDefaults.cardColors(Color(0xffFFC23D))

                ) { }
                Text(
                    text = "Get to your destination faster, study at \nthe best " +
                            "vocational school in Brazil. Be \n          the best version of yourself.",
                    color = Color(0xff9E9FA4),
                    fontSize = 16.sp


                )

            }
            Button(
                onClick = {},
                modifier = Modifier
                    .width(276.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(Color(0xffFFC23D)),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, color = Color(0xff3347B0))
            ) {
                Text(
                    text = "Get Started",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xff3347B0),
                    fontSize = 18.sp
                )
            }
            Row (
                modifier = Modifier
                    .padding(top = 210.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly

            ){
                Image(
                    painter = painterResource(
                        R.drawable.youtube
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(43.dp)
                        .width(43.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.twitter
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(43.dp)
                        .width(43.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.instagram
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(43.dp)
                        .width(43.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.facebook
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(43.dp)
                        .width(43.dp)
                )
            }
        }
    }

}

@Composable
@Preview
private fun HomeScreenPreview(){
    HomeScreen()
}