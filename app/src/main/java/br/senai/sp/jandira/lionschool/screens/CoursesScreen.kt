package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CoursesScreen (){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),

        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()

            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .height(76.dp)
                        .width(65.dp)
                )
                Text(
                    text = "Lion\nSchool",
                    color = (Color(0xff3347B0)),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier

                )
            }
            Card(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(1.dp)
                    .width(370.dp),
                colors = CardDefaults.cardColors(Color(0xffFFC23D))

            ) { }
            OutlinedTextField(
                value = "", onValueChange = {},
                modifier = Modifier
                    .padding(top = 35.dp)
                    .width(370.dp),
                shape = RoundedCornerShape(10.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(0xFFA4A3A3)
                    )
                },
                label = {
                    Text(
                        text = stringResource(R.string.find_studante),
                        color = Color(0xFFA4A3A3),

                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xffFFC23D),
                    unfocusedContainerColor = Color (0xffF5F5F5)
                )


            )
            Spacer(modifier = Modifier .height(10.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)

            ){
                Image(
                    painter = painterResource(R.drawable.lista),
                    contentDescription = "",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                )
                Text(
                    text = "Courses",
                    color = (Color(0xff3347B0)),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)

                )
            }
            Spacer(modifier = Modifier .height(4.dp))
            CardCourses(

            )
            Spacer(modifier = Modifier .height(4.dp))
            CardCourses(

            )
            Spacer(modifier = Modifier .height(4.dp))
            CardCourses(

            )
            Spacer(modifier = Modifier .height(4.dp))
            CardCourses(

            )
        }
    }



}



@Composable
@Preview
private fun CoursesScreenPreview(){
    CoursesScreen()
}