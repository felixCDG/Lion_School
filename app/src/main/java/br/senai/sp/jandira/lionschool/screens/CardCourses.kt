package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CardCourses(
    imagePainter: Painter = painterResource(R.drawable.imagecourses),
    acronymCourses: String = "SC",
    nameCourses: String = "nomeCurso",
    descriptionCourses: String = "descricaoCurso",
    imageTime: Painter = painterResource(R.drawable.imagetime),
    buleteColor: Color = Color.Transparent,
    timeCourses: String = "tempoCurso",

    background: Brush = Brush.horizontalGradient(colors = listOf(Color(0xFF1E1E85),
                                                               Color(0xFF696990)
    ))
){
    Card (
        modifier = Modifier
            .height(200.dp)
            .width(400.dp)
            .background(background),
        colors = CardDefaults.cardColors(containerColor = buleteColor),
        border = BorderStroke(1.dp,Color(0xffFFC23D))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = imagePainter,
                    contentDescription = "",
                    modifier = Modifier
                        .height(70.dp)
                        .width(70.dp)
                )
                Text(
                    text = acronymCourses,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xffFFC23D),
                    fontSize = 50.sp,
                    modifier = Modifier
                        .padding(5.dp)

                )
            }
            Text(
                text = nameCourses,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 6.dp)


                )
            Text(
                text = descriptionCourses,
                color = Color(0xFFA8A8A8),
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(top = 1.dp)


            )
            Spacer(modifier = Modifier .height(40.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){

                Image(
                    painter = imageTime,
                    contentDescription = "",
                    modifier = Modifier
                        .height(23.dp)
                        .width(23.dp)
                )
                Text(
                    text = timeCourses,
                    color = Color(0xFFFFFFFF),
                    fontSize = 8.sp,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )
            }

        }
    }
}

@Composable
@Preview
private fun CardCoursesPreview(){
    CardCourses()
}


