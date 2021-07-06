package com.example.composedemo.ui.layout

import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composedemo.R
import com.example.composedemo.ui.component.PlaceItem

@Composable
fun SearchLayout() {
    var text by remember { mutableStateOf("") }

    Box(contentAlignment = Alignment.BottomCenter) {
        Image(painterResource(id = R.drawable.bg_place), "")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                Surface(color = MaterialTheme.colors.primary) {
                    TextField(
                        value = text,
                        placeholder = {
                            Text(text = "输入地址", fontSize = 12.sp)
                        },
                        onValueChange = { text = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(12.dp)
                            .clip(shape = RoundedCornerShape(4.dp))
                    )
                }
                LazyColumn(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                    .wrapContentHeight()) {
                    item {
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                        PlaceItem()
                    }
                }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchLayoutPreview() {
    SearchLayout()
}