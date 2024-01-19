package com.norm.myroomdb.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.norm.myroomdb.data.NameEntity

@Composable
fun ListItem(
    item: NameEntity,
    onClick: (NameEntity) -> Unit,
    onClickDelete: (NameEntity) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable {
                onClick(item)
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.Gray,
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = item.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(8.dp),
                color = Color.Black
            )
            IconButton(onClick = {
                onClickDelete(item)
            }) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = "Delete"
                )
            }
        }
    }
}