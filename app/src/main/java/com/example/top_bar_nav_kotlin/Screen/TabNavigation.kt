package com.example.top_bar_nav_kotlin.Screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabNavigation() {

    val pagerState = com.google.accompanist.pager.rememberPagerState()
    val currentIndex = pagerState.currentPage
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TabRow(selectedTabIndex = currentIndex,
            divider = {

            },
        ) {
            tabList.forEachIndexed { index, pair ->
                Tab(selected = currentIndex == index, onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }, modifier = Modifier.padding(20.dp)) {
                    Text(text = tabList[index].tabName)
                }
            }
        }

        com.google.accompanist.pager.HorizontalPager(
            state = pagerState,
            count = tabList.size
        ) { index ->
            Text(text = tabList[index].des)
        }
    }


}

data class Tab1(
    val tabName: String,
    val des: String
)

val tabList = listOf(
    Tab1(
        "Home",
        "This is Home page"
    ),
    Tab1(
        "Image",
        "This is image page"
    ),
    Tab1(
        "Videos",
        "This is Video page"
    )
)
