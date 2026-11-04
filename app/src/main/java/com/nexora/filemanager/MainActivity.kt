
package com.nexora.filemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NEXORAApp()
        }
    }
}

@Composable
fun NEXORAApp() {
    val navy = Color(0xFF101827)
    val blue = Color(0xFF3978F6)

    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = blue,
            background = Color(0xFFF5F7FB),
            surface = Color.White
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFF5F7FB)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "NEXORA",
                            fontSize = 27.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = navy
                        )
                        Text(
                            text = "Your files. Your control.",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                    }

                    Text(
                        text = "⋮",
                        fontSize = 28.sp,
                        color = navy
                    )
                }

                Spacer(modifier = Modifier.height(28.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = navy,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(22.dp)
                ) {
                    Text(
                        text = "YOUR STORAGE",
                        color = Color.LightGray,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Storage overview",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Storage information will appear here.",
                        color = Color.LightGray,
                        fontSize = 13.sp
                    )
                }

                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = navy
                )

                Spacer(modifier = Modifier.height(14.dp))

                CategoryRow("Images", "Photos and pictures")
                CategoryRow("Videos", "Your video files")
                CategoryRow("Audio", "Music and recordings")
                CategoryRow("Documents", "PDFs and other documents")
                CategoryRow("Downloads", "Downloaded files")

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Recent files",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = navy
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Your recent files will appear here.",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

@Composable
fun CategoryRow(title: String, subtitle: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 9.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF101827)
            )
            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}
