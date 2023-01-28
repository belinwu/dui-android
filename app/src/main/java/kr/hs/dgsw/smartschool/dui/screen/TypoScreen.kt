package kr.hs.dgsw.smartschool.dui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import kr.hs.dgsw.smartschool.components.foundation.Text
import kr.hs.dgsw.smartschool.dui.compose.ScreenAppBar


@Composable
@Preview(showBackground = true)
fun TypoPreview(){
}

@Composable
fun TypoScreen(
    viewModel: ViewModel,
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ScreenAppBar(title = "TypoScreen", navController = navController)
        Text(text = "TypoScreen입니다.")
    }
}