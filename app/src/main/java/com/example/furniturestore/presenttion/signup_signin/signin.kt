package com.example.furniturestore.presenttion.signup_signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.furniturestore.R


@Composable
fun SigninScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize(),
        content = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black) // Now the background won't overflow
            )
            {

                Image(
                    painter = painterResource(R.drawable.signin_image),
                    contentDescription = "Phone",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()

                )

            }

            Box(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 35.dp),
            )
            {
                Column(modifier = Modifier.fillMaxSize()) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(modifier = Modifier.padding(horizontal = 30.dp)) {
                            Text(
                                buildAnnotatedString {
                                    withStyle(
                                        style = ParagraphStyle(
                                            TextAlign.Center
                                        )
                                    ) {
                                        withStyle(
                                            style = SpanStyle(
                                                color = Color(0xFF1A5D8F),
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 21.sp,
                                                letterSpacing = 0.219.sp
                                            )
                                        ) {
                                            append("The Furniture App")
                                        }
                                        withStyle(
                                            style = SpanStyle(
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 21.sp,
                                                letterSpacing = 0.219.sp
                                            )
                                        ) {
                                            append(" That  Elevates Your Home")
                                        }
                                    }
                                }
                            )
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "Change colors, materials, and sizes instantly— \n make every piece your own.",
                            color = Color.Black,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,

                            )


                        Spacer(modifier = Modifier.height(24.dp))

                        Button(
                            onClick = { /* Handle Google Sign-in */ },
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(Color(0xFF0058A3))
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                modifier = Modifier.padding(
                                    horizontal = 35.dp, vertical = 5.dp
                                )
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.google_icon),
                                    contentDescription = "Google Logo",
                                    modifier = Modifier.size(20.dp)
                                )
                                Text(
                                    "Continue with Google",
                                    color = Color.White,
                                    fontSize = 14.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Don’t have an account?",
                                fontSize = 16.sp,
                                color = Color(0xff18181A)
                            )

                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Sign up",
                                fontSize = 16.sp,
                                color = Color(0xFf18181A),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.clickable {navController.navigate("SignupScreen")}
                            )
                        }
                    }
                }
            }

        }
    )
}
