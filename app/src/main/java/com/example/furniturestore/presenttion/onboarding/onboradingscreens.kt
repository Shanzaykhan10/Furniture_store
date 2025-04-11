package com.example.furniturestore.presenttion.onboarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.furniturestore.R
import com.example.furniturestore.presenttion.signup_signin.SignupScreen


@Composable
fun OnboardingScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize(),
        content = {
            // Image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 96.dp, bottomEnd = 96.dp)) // Clip first!
                    .background(color = Color(0xFFEEEEEF)) // Now the background won't overflow

            ) {
                // Content inside the box
                Image(
                    painter = painterResource(R.drawable.mask_group),
                    contentDescription = "Phone",
                    modifier = Modifier
                        .fillMaxWidth()

                )

                Box(
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp) // Align to top right with padding
                ) {
                    TextButton(
                        onClick = { navController.navigate("SigninScreen")},
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(8.dp) // Align to top right with padding
                    ) {
                        Text("Skip", style = TextStyle(fontSize = 16.sp, color = Color(0xFF18181A)))
                    }
                }
            }
            Box (
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 68.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.End
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = ParagraphStyle(textAlign = TextAlign.Center,
                                )
                                ) {
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append("Transform Your")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(0xFF1A5D8F),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append(" Space with \n AI & AR!")
                                    }
                                }
                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        // Description text
                        Text(
                            text = "Experience the future  of furniture shopping—visualize, customize, and place items in your home before buying.",
                            color = Color.Black,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    FloatingActionButton(
                        onClick = {
                            navController.navigate("OnboardingScreen2")
                        },
                        shape = RoundedCornerShape(50.dp),
                        containerColor = Color(0xFF1A5D8F),
                        elevation = FloatingActionButtonDefaults.elevation(0.dp),
                        modifier = Modifier.size(42.dp)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Continue",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    )
}


@Composable
fun OnboardingScreen2(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize(),
        content = {
            // Image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 96.dp, bottomEnd = 96.dp)) // Clip first!
                    .background(color = Color(0xFFEEEEEF)) // Now the background won't overflow

            ) {
                // Content inside the box
                Image(
                    painter = painterResource(R.drawable.mask_group),
                    contentDescription = "Phone",
                    modifier = Modifier
                        .fillMaxWidth()

                )

                Box(
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp) // Align to top right with padding
                ) {
                    TextButton(
                        onClick = { navController.navigate("SigninScreen") },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(8.dp) // Align to top right with padding
                    ) {
                        Text("Skip", style = TextStyle(fontSize = 16.sp, color = Color(0xFF18181A)))
                    }
                }
            }
            Box (
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 68.dp)
            ) {
                Column {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = ParagraphStyle(textAlign = TextAlign.Center,
                                    )
                                ) {
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(0xFF1A5D8F),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append("Smart AI, ")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append("Perfect Picks!")
                                    }
                                }
                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        // Description text
                        Text(
                            text = "Our AI understands your style and space to suggest the best furniture for your home..",
                            color = Color.Black,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {

                        OutlinedIconButton(
                            onClick = {
                                navController.navigate("OnboardingScreen")
                            },
                            shape = RoundedCornerShape(50.dp),
                            border = BorderStroke(1.dp, Color(0xFF1A5D8F)),
                            modifier = Modifier.size(40.dp)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Continue",
                                tint = Color(0xFF1A5D8F),
                                modifier = Modifier.size(20.dp)
                            )
                        }

                        FloatingActionButton(
                            onClick = {
                           navController.navigate("OnboardingScreen3")
                            },
                            shape = RoundedCornerShape(50.dp),
                            containerColor = Color(0xFF1A5D8F),
                            elevation = FloatingActionButtonDefaults.elevation(0.dp),
                            modifier = Modifier.size(42.dp)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = "Continue",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}


@Composable
fun OnboardingScreen3(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize(),
        content = {
            // Image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 96.dp, bottomEnd = 96.dp)) // Clip first!
                    .background(color = Color(0xFFEEEEEF)) // Now the background won't overflow

            ) {
                // Content inside the box
                Image(
                    painter = painterResource(R.drawable.mask_group),
                    contentDescription = "Phone",
                    modifier = Modifier
                        .fillMaxWidth()

                )

                Box(
                    modifier = Modifier.fillMaxWidth()
                        .padding(16.dp) // Align to top right with padding
                ) {
                    TextButton(
                        onClick = {navController.navigate("SigninScreen") },
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(8.dp) // Align to top right with padding
                    ) {
                        Text("Skip", style = TextStyle(fontSize = 16.sp, color = Color(0xFF18181A)))
                    }
                }
            }
            Box(
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 68.dp)
            ) {
                Column {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = ParagraphStyle(
                                        textAlign = TextAlign.Center,
                                    )
                                ) {
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color.Black,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append("See It ")
                                    }
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(0xFF1A5D8F),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 24.sp
                                        )
                                    ) {
                                        append("Before You Buy!")
                                    }
                                }
                            }
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        // Description text
                        Text(
                            text =  "Use AR to place furniture in your room and get a real-time view of how it fits.",
                            color = Color.Black,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        OutlinedIconButton(
                            onClick = {
                                navController.navigate("OnboardingScreen2")
                            },
                            shape = RoundedCornerShape(50.dp),
                            border = BorderStroke(1.dp, Color(0xFF1A5D8F)),
                            modifier = Modifier.size(40.dp)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Continue",
                                tint = Color(0xFF1A5D8F),
                                modifier = Modifier.size(20.dp)
                            )
                        }

                        FloatingActionButton(
                            onClick = {
                            navController.navigate("SigninScreen")
                            },
                            shape = RoundedCornerShape(50.dp),
                            containerColor = Color(0xFF1A5D8F),
                            elevation = FloatingActionButtonDefaults.elevation(0.dp),
                            modifier = Modifier.size(42.dp)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = "Continue",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}


