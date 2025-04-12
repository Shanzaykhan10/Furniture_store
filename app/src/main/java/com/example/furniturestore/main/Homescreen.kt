package com.example.furniturestore.main

import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniturestore.R

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    LazyColumn {
       item {
           Row(
               Modifier.fillMaxWidth()
                   .padding(start = 24.dp, end = 24.dp, top = 60.dp),
               horizontalArrangement = Arrangement.SpaceBetween
           ) {
               Column() {
                   Text(
                       text = "Location",
                       style = TextStyle(
                           fontSize = 14.2.sp,
                           lineHeight = 11.2.sp,
                           fontWeight = FontWeight(500),
                           color = Color(0xFF000000),
                           letterSpacing = 0.11.sp,
                       )
                   )
                   Spacer(modifier = Modifier.padding(bottom = 8.dp))
                   Row(
                       horizontalArrangement = Arrangement.spacedBy(5.dp),
                       verticalAlignment = Alignment.CenterVertically
                   ) {
                       Icon(
                           imageVector = Icons.Default.LocationOn,
                           contentDescription = "Location",
                           modifier = Modifier.size(16.dp)
                       )
                       Text(
                           text = "Multan, Punjab",
                           style = TextStyle(
                               fontSize = 14.sp,
                               lineHeight = 20.sp,
                               fontWeight = FontWeight(500),
                               color = Color(0xFF000000),
                               letterSpacing = 0.14.sp,
                           )
                       )
                       Icon(
                           imageVector = Icons.Default.KeyboardArrowDown,
                           contentDescription = "keyboardArrowDown",
                       )
                   }
               }
               Box(
                   modifier = Modifier
                       .shadow(elevation = 1.dp, shape = CircleShape)
                       .background(color = Color(0xffE5E5E5))
                       .size(50.dp),
                   contentAlignment = Alignment.Center
               )
               {
                   Image(
                       painter = painterResource(R.drawable.icons),
                       contentDescription = "Icon",
                       modifier = Modifier.size(30.dp)
                   )
               }
           }
           Row(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 12.dp, horizontal = 24.dp),
               verticalAlignment = Alignment.CenterVertically
           ) {
               OutlinedTextField(
                   colors = OutlinedTextFieldDefaults.colors(
                       unfocusedBorderColor = Color(0xffD3D3D3),
                       focusedBorderColor = Color(0xffD3D3D3)
                   ),
                   value = "",
                   onValueChange = { /* Handle text input */ },
                   leadingIcon = {
                       Icon(
                           Icons.Outlined.Search, contentDescription = "Search",
                           modifier = Modifier.size(30.dp)
                       )
                   },
                   placeholder = { Text("Search , Sofa, Lamp") },
                   modifier = Modifier.weight(1f)
                       .shadow(elevation = 2.dp, RoundedCornerShape(8.dp))
                       .background(color = Color(0xffD3D3D3)),
                   trailingIcon = {
                       Image(
                           painter = painterResource(R.drawable.microphone),
                           contentDescription = "Icon"
                       )
                   })
           }
           Row(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 22.dp, horizontal = 24.dp),
               horizontalArrangement = Arrangement.SpaceBetween
           )
           {
               Text(
                   text = "Categories",
                   style = TextStyle(
                       fontSize = 16.sp,
                       lineHeight = 20.sp,
                       fontWeight = FontWeight(400),
                       color = Color(0xFF000000),
                       letterSpacing = 0.16.sp,
                   )
               )
               Row(verticalAlignment = Alignment.CenterVertically) {
                   Text(
                       text = "See all",
                       style = TextStyle(
                           fontSize = 11.02.sp,
                           lineHeight = 14.sp,
                           fontWeight = FontWeight(400),
                           color = Color(0xFF000000),
                           letterSpacing = 0.11.sp,
                       ),
                       modifier = Modifier.clickable { }
                   )
                   Icon(
                       Icons.Default.ArrowForward,
                       contentDescription = "Arrowforward",
                       modifier = Modifier.size(14.dp)
                   )
               }
           }

           Categories()

           Column(
               modifier = Modifier.padding(vertical = 24.dp, horizontal = 24.dp)
                   .shadow(elevation = 1.dp, shape = RoundedCornerShape(8.dp))
           ) {
               Image(
                   painter = painterResource(id = R.drawable.kids), // replace with your image
                   contentDescription = "Kids playing with furniture",
                   modifier = Modifier
                       .fillMaxWidth(),
                   contentScale = ContentScale.Crop
               )
               Box(
                   modifier = Modifier
                       .fillMaxWidth()
                       .background(Color(0xFF005BAC)) // Blue background
                       .padding(24.dp)
               )
               {
                   Column(
                       modifier = Modifier.align(Alignment.TopStart)
                   ) {
                       Text(
                           text = "Scan and design with Furniture. Kreativ in mixed reality. Imagine that.",
                           style = TextStyle(
                               fontSize = 21.88.sp,
                               lineHeight = 28.44.sp,
                               fontWeight = FontWeight(500),
                               color = Color(0xFFFFFFFF),
                               letterSpacing = 0.22.sp,
                           )
                       )
                       Spacer(modifier = Modifier.padding(vertical = 5.dp))
                       FloatingActionButton(
                           onClick = {},
                           shape = RoundedCornerShape(50.dp),
                           containerColor = Color.White,
                           elevation = FloatingActionButtonDefaults.elevation(0.dp),
                           modifier = Modifier.size(42.dp)
                       ) {
                           Icon(
                               imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                               contentDescription = "Continue",
                               tint = Color.Black,
                               modifier = Modifier.size(27.dp)
                           )
                       }
                   }
               }
           }
           Text(
               text = "Shop by room",
               style = TextStyle(
                   fontSize = 16.sp,
                   lineHeight = 20.sp,
                   fontWeight = FontWeight(400),
                   color = Color(0xFF000000),
                   letterSpacing = 0.16.sp,
               ),
               modifier = Modifier.padding(start = 24.dp,)
           )

           var selected by remember { mutableStateOf("All") }
           val categories = listOf("All", "Bedroom", "Living room", "Kitchen", "Courtyard")

           CategoryChips(
               categories = categories,
               selectedCategory = selected,
               onCategorySelected = { selected = it }
           )
       }
    }
}


@Composable
fun Categories() {
    val catagory = listOf(
        "Sofa" to R.drawable.sofa,
        "Lamp" to R.drawable.lamp,
        "Bed" to R.drawable.bed,
        "Chair" to R.drawable.chair
    )
    Row(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(42.dp)
    ) {
        catagory.forEach { (name, drawable) ->

            Column {
                Card(
                    modifier = Modifier.size(56.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xffE5E5E5)),
                    shape = CircleShape

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id =drawable),
                            contentDescription =name,
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .width(56.dp)
                        .height(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = name,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}



@Composable
fun CategoryChips(
    categories: List<String>,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(categories) { category ->
            val isSelected = category == selectedCategory
            Surface(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .clickable { onCategorySelected(category) },
                color = if (isSelected) Color(0xFF0057B8) else Color(0xFFE5E5E5)
            ) {
                Text(
                    text = category,
                    color = if (isSelected) Color.White else Color.Black,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    fontSize = 14.sp
                )
            }
        }
    }
}
