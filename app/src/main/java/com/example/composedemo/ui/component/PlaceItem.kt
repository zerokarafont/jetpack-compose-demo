package com.example.composedemo.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlaceItem() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(130.dp)
        .padding(top = 2.dp, bottom = 20.dp), elevation = 10.dp) {
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.padding(10.dp)) {
            Text(text = "北京西站")
            Text(text = "中国北京市", fontSize = 12.sp)
        }
    }
}

@Preview
@Composable
fun PlaceItemPreview() {
    PlaceItem()
}