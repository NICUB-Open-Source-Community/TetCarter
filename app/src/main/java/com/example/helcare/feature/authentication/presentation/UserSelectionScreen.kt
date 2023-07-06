package com.example.helcare.feature.authentication.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helcare.core.designsystem.icon.HelCareIcons
import com.example.helcare.core.designsystem.theme.HelCareTheme
import com.example.helcare.core.designsystem.theme.fontFamily

enum class User {
    DOCTOR,
    PATIENT
}

@Composable
fun UserSelectionRoute(
    navigateToRegistration: (User) -> Unit,
    navigateToLogin: () -> Unit
) {
    UserSelectionScreen(
        onUserSelectionClick = { user ->
            // Todo: save user type to datastore through ViewModel
            navigateToRegistration(user)
        },
        onLoginClick = navigateToLogin
    )
}

@Composable
fun UserSelectionScreen(
    onLoginClick: () -> Unit,
    onUserSelectionClick: (User) -> Unit,
    modifier: Modifier = Modifier
) {
    AuthBackground(
        modifier = modifier,
        topContent = {
//            Spacer(modifier = Modifier.height(214.dp))

            Text(
                text = "Registration option:",
                fontSize = 18.sp
            )

            Text(
                text = "Select the best option that suits your interest to continue",
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            val registerAsAnnotatedString = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.Underline
                    )
                ) {
                    append("Register")
                }
                append(" ")
                append("as a:")
            }
            Text(
                text = registerAsAnnotatedString,
                fontSize = 24.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .width(300.dp)
                    .clickable {
                        onUserSelectionClick(User.DOCTOR)
                    }
            ) {
                Image(
                    painter = painterResource(id = HelCareIcons.Doctor),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
                Column {
                    Text(
                        text = "Doctor",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "This is for qualified doctors only",
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = HelCareIcons.ChevronRight,
                    contentDescription = null,
                    tint = Color.White
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .width(300.dp)
                    .clickable {
                        onUserSelectionClick(User.PATIENT)
                    }
            ) {
                Image(
                    painter = painterResource(id = HelCareIcons.Doctor),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
                Column {
                    Text(
                        text = "Patient",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "This is for all patients",
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = HelCareIcons.ChevronRight,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
        bottomContent = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                val login = "Login"
                val alreadyHaveAnAccountString = buildAnnotatedString {
                    pushStyle(
                        style = SpanStyle(
                            color = Color(0xFF002357)
                        )
                    )
                    append("Already have an account?")
                    append(" ")
                    pop()
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFF9E1007),
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        pushStringAnnotation(tag = login, annotation = login)
                        append(login)
                    }
                }
                ClickableText(
                    text = alreadyHaveAnAccountString,
                    style = MaterialTheme.typography.bodyLarge.merge(
                        TextStyle(
                            textAlign = TextAlign.Center
                        )
                    ),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 8.dp)
                        .clickable { },
                    onClick = { offset ->
                        alreadyHaveAnAccountString.getStringAnnotations(
                            start = offset,
                            end = offset
                        )
                            .firstOrNull()
                            ?.let {
                                onLoginClick()
                            }
                    }
                )
            }
        }
    )
}

@Composable
fun AuthBackground(
    topContent: @Composable ColumnScope.() -> Unit,
    bottomContent: @Composable ColumnScope.() -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor = MaterialTheme.colorScheme.primary
    val lazyListState = rememberLazyListState()

    Surface(
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            ProvideTextStyle(
                value = TextStyle(
                    color = Color.White,
                    fontFamily = fontFamily
                )
            ) {
                LazyColumn(
                    state = lazyListState,
                    modifier = Modifier
                        .weight(0.8f)
                        .fillMaxWidth()
                        .drawWithCache {
                            onDrawBehind {
                                val size = this.size
                                drawPath(
                                    path = Path().apply {
                                        moveTo(x = 0f, y = 0f)
                                        lineTo(x = size.width, y = 0f)
                                        lineTo(
                                            x = size.width,
                                            y = (size.height/* - size.height * 0.2*/)
                                        )
                                        arcTo(
                                            rect = Rect(
                                                topLeft = Offset(
                                                    x = -8f,
                                                    y = (size.height - size.height * 0.1).toFloat()
                                                ),
                                                bottomRight = Offset(
                                                    x = size.width + 8f,
                                                    y = size.height
                                                )
                                            ),
                                            startAngleDegrees = 0f,
                                            sweepAngleDegrees = 180f,
                                            forceMoveTo = false
                                        )
                                    },
                                    color = backgroundColor,
                                    style = Fill
                                )
                            }
                        }
                        .padding(16.dp)

                ) {
                    // Spacer in place of app logo
                    item {
                        Spacer(modifier = Modifier.height(180.dp))
                    }

                    item {
                        topContent()
                    }

                    item {
                        Spacer(modifier = Modifier.height(56.dp))
                    }
                }
            }
            Column(
                modifier = Modifier.weight(0.2f)
            ) {
                bottomContent()
            }
        }
    }
}

@Preview
@Composable
fun UserSelectionScreenPreview() {
    HelCareTheme {
        UserSelectionScreen(
            onUserSelectionClick = {},
            onLoginClick = {}
        )
    }
}