package kr.hs.dgsw.smartschool.dui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kr.hs.dgsw.smartschool.components.component.appbar.DodamAppBar
import kr.hs.dgsw.smartschool.components.component.avatar.Avatar
import kr.hs.dgsw.smartschool.components.theme.Body1
import kr.hs.dgsw.smartschool.components.theme.DodamColor
import kr.hs.dgsw.smartschool.components.theme.DodamTheme
import kr.hs.dgsw.smartschool.components.theme.Label2
import kr.hs.dgsw.smartschool.components.theme.Title2

@Composable
@Preview(showBackground = true)
fun AvatarPreview() {
    AvatarScreen(navController = rememberNavController())
}

@Composable
fun AvatarScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(DodamColor.White)
    ) {
        DodamAppBar(title = "Avatar", onStartIconClick = { navController.popBackStack() })
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .background(DodamColor.White)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(20.dp))
            Title2(text = "Avatar")
            Spacer(modifier = Modifier.height(20.dp))
            Body1(text = "Basic Avatar")
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .width(300.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                BasicAvatar(label = "color = primary\nsize = 40.dp", iconColor = DodamColor.MainColor)
                BasicAvatar(label = "color = secondary\nsize = 60.dp", iconColor = DodamColor.SecondaryColor, size = 60.dp)
                BasicAvatar(label = "color = myInfo\nsize = 80.dp", iconColor = DodamColor.FeatureColor.MyInfoColor, size = 80.dp)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Body1(text = "Name Avatar")
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .width(300.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                NameAvatar(
                    label = "name = 홍길동\n" +
                        "size = 40.dp",
                    name = "홍길동"
                )
                NameAvatar(
                    label = "name = 김김김\n" +
                        "size = 60.dp",
                    name = "김김김",
                    size = 60.dp
                )
                NameAvatar(
                    label = "name = John\n" +
                        "size = 80.dp",
                    name = "John",
                    size = 80.dp
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Body1(text = "Image Avatar")
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .width(300.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                ImageAvatar(label = "img = dummy\nsize 40.dp", painter = painterResource(id = kr.hs.dgsw.smartschool.dui.R.drawable.img_dummy))
                ImageAvatar(label = "img = dummy\nsize = 60.dp", painter = painterResource(id = kr.hs.dgsw.smartschool.dui.R.drawable.img_dummy), size = 60.dp)
                ImageAvatar(label = "img = dummy\nsize = 80.dp", painter = painterResource(id = kr.hs.dgsw.smartschool.dui.R.drawable.img_dummy), size = 80.dp)
            }
        }
    }
}

@Composable
fun NameAvatar(
    label: String,
    name: String,
    modifier: Modifier = Modifier,
    nameStyle: TextStyle = DodamTheme.typography.title2,
    nameColor: Color = DodamTheme.color.Gray400,
    backgroundColor: Color = DodamTheme.color.Background,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
) {
    Column(
        modifier = Modifier
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Avatar(
            name = name,
            modifier = modifier,
            nameStyle = nameStyle,
            nameColor = nameColor,
            backgroundColor = backgroundColor,
            shape = shape,
            size = size
        )
        Label2(text = label, textAlign = TextAlign.Center)
    }
}
@Composable
fun ImageAvatar(
    label: String,
    painter: Painter,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
) {
    Column(
        modifier = Modifier
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Avatar(
            painter = painter,
            modifier = modifier,
            shape = shape,
            size = size
        )
        Label2(text = label, textAlign = TextAlign.Center)
    }
}
@Composable
fun BasicAvatar(
    label: String,
    modifier: Modifier = Modifier,
    iconSize: Dp = 20.dp,
    iconColor: Color = DodamTheme.color.Gray400,
    backgroundColor: Color = DodamTheme.color.Background,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
) {
    Column(
        modifier = Modifier
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Avatar(
            modifier = modifier,
            iconSize = iconSize,
            iconColor = iconColor,
            backgroundColor = backgroundColor,
            shape = shape,
            size = size
        )
        Label2(text = label, textAlign = TextAlign.Center)
    }
}
