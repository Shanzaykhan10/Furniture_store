package com.example.furniturestore.presenttion.signup_signin

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.furniturestore.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OTPVerification(navController: NavController) {
    Column(modifier = Modifier.padding(vertical = 74.dp, horizontal = 14.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                contentDescription = "Continue",
                tint = Color.Black,
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(80.dp))
            Text(
                text = "OTP Verification",
                style = TextStyle(
                    fontSize = 17.5.sp,
                    lineHeight = 24.5.sp,
                    fontWeight = FontWeight(600),
                    textAlign = TextAlign.Center,
                    color = Color(0xFF18181A),
                    letterSpacing = 0.18.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(35.dp))
        Box() {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Verify Your Email Address",
                    style = TextStyle(
                        fontSize = 17.5.sp,
                        lineHeight = 24.5.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF18181A),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.18.sp,
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "We've sent a verification code OTP to your email\n****@email.com. Enter the code to verify and continue.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 19.6.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF18181A),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.14.sp,
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(27.dp))
        Row(
            modifier = Modifier.fillMaxWidth().
            padding(horizontal = 7.dp)
        ) {
            for (i in 0..5) {
                var number by remember { mutableStateOf("") }

            TextField(
                colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent),
                textStyle = TextStyle(fontSize = 27.34.sp),
                value = number,
                onValueChange = { newValue ->
                    if (newValue.length <= 1 && newValue.all { it.isDigit() }) {
                        number = newValue
                    }
                },
                modifier = Modifier.width(52.dp)
                    .drawBehind {
                        val strokeWidth = 2.dp.toPx() // Convert dp to pixels
                        drawLine(
                            color = Color.Black,
                            start = Offset(0f, size.height),
                            end = Offset(size.width, size.height),
                            strokeWidth = strokeWidth
                        )
                    },
                singleLine = true,
                maxLines = 1,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) // Set keyboard type to Number
            )
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
            }
            }

        Spacer(modifier = Modifier.height(50.dp))

        Box(
            modifier = Modifier.fillMaxWidth() ){
            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                ) {
                    Text(
                        text = "Haven't received the code?",
                        fontSize = 14.sp,
                        color = Color(0xff18181A),
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Resend",
                        fontSize = 14.sp,
                        color = Color(0xFF1A5D8F),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {}
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = {navController.navigate("SigninScreen")},
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A5D8F)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.width(280.dp)
                ) {
                    Text(
                        text = "Verification",
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 19.6.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.14.sp,
                        )
                    )
                }
            }
        }
        }

    }


