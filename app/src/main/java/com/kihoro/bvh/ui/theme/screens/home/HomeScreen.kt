package com.kihoro.bvh.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kihoro.bvh.nav.ROUTE_NEWSTUDENT
import com.kihoro.bvh.nav.ROUTE_SEARCH
import com.kihoro.bvh.nav.ROUTE_VIEWRECORD

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text(text = "BVH MANAGEMENT SYSTEM",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = { navController.navigate(ROUTE_SEARCH)},
            modifier = Modifier
                .width(300.dp)
                .height(60.dp)
        ){
            Text(
                text = "Search",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = { navController.navigate(ROUTE_NEWSTUDENT) },
            modifier = Modifier
                .width(300.dp)
                .height(200.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Add a new student",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = { navController.navigate(ROUTE_VIEWRECORD) },
            modifier = Modifier
                .width(300.dp)
                .height(200.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "View Record",
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

    }
}

@Preview
@Composable
private fun Homeprev() {
    HomeScreen(navController = rememberNavController())
}