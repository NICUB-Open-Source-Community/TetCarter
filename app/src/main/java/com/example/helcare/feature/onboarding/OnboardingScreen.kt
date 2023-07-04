package com.example.helcare.feature.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helcare.R
import com.example.helcare.core.designsystem.icon.HelCareIcons
import com.example.helcare.core.designsystem.theme.HelCareTheme
import com.example.helcare.core.designsystem.theme.fontFamily

@Composable
fun OnboardingRoute(
    navigateToAuthentication: () -> Unit
) {
    OnboardingScreen(
        onNavigateToAuth = navigateToAuthentication
    )
}


@Composable
fun OnboardingScreen(
    onNavigateToAuth: () -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = MaterialTheme.colorScheme.primary

    Box(
        modifier = modifier
        .fillMaxSize()
        .drawWithCache {
            onDrawBehind {
                drawRect(
                    color = backgroundColor
                )
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Welcome",
                fontSize = 42.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 61.dp,
                    end = 16.dp,
//                        bottom = 6.dp
                ),
                color = Color.White
            )

            BackGroundImage()

            Surface(
                color = Color.White,
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier.padding(
                        top = 53.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    )
                ) {
                    LazyColumn(
                        modifier = Modifier.weight(1f)
                    ) {
                        item {
                            Text(
                                text = "Personalized Health Care",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = fontFamily
                            )
                        }
                        item {
                            Divider(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 12.dp)
                            )
                        }
                        item {
                            Text(
                                text = "Get experienced doctors to take care of you and your family.\n" +
                                        "Easy access to experienced doctors with 24/7 availability.\n" +
                                        "Access to ambulance in case of emergency. ",
                                fontSize = 18.sp,
                                fontFamily = fontFamily,
                                fontWeight = FontWeight.Normal,
                                color = Color(0xFF002357)
                            )
                        }
                    }

                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 22.dp, bottom = 22.dp)
                    )

                    val iconSize = 40.dp
                    TextButton(
                        onClick = onNavigateToAuth
                    ) {
                        Text(
                            text = "Let's get you started",
                            modifier = Modifier
                                .weight(1f)
                                .offset(x = iconSize / 2),
                            textAlign = TextAlign.Center
                        )

                        Icon(
                            painterResource(id = HelCareIcons.FilledArrowRightCircle),
                            contentDescription = null
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun BackGroundImage() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.welcome_screen_backgroud_img),
            contentDescription = null,
            modifier = Modifier
                .height(329.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.med_profs),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 48.dp, end = 22.dp)
                .size(186.dp, 133.dp)
                .align(Alignment.BottomEnd),
//                        .padding(bottom = 48.dp, end = 22.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    HelCareTheme {
        OnboardingScreen(onNavigateToAuth = {})
    }
}