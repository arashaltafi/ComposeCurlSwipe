package com.arash.altafi.composecurlswipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arash.altafi.composecurlswipe.ui.theme.ComposeCurlSwipeTheme

class MainActivity : ComponentActivity() {

    private val images = mutableStateListOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeCurlSwipeTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CurlEffectScreen(
                        images = images,
                        onRemove = {
                            images.removeAt(it)
                        }
                    )
                }
            }
        }
    }
}

