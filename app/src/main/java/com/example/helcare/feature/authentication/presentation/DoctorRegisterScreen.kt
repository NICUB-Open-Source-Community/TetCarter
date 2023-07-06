package com.example.helcare.feature.authentication.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helcare.core.designsystem.icon.HelCareIcons
import com.example.helcare.core.designsystem.theme.HelCareTheme

@Composable
fun DoctorRegisterRoute() {
    DoctorRegisterScreen()
}

@Composable
fun DoctorRegisterScreen(
    modifier: Modifier = Modifier
) {
    AuthBackground(
        modifier = modifier,
        topContent = {
            Text(
                text = "Register",
                fontSize = 42.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Spacer(modifier = Modifier.width(24.dp))

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter full name")
                    },
                    label = {
                        Text(text = "Full Name")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        disabledIndicatorColor = Color.White
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = null,
                    tint = Color.White
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter number")
                    },
                    label = {
                        Text(text = "Mobile number")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        disabledIndicatorColor = Color.White
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = null,
                    tint = Color.White
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter email")
                    },
                    label = {
                        Text(text = "Email Address")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        disabledIndicatorColor = Color.White
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = null,
                    tint = Color.White
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter password")
                    },
                    label = {
                        Text(text = "Password")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        disabledIndicatorColor = Color.White
                    )
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = null,
                    tint = Color.White
                )

                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = {
                        Text(text = "Enter password")
                    },
                    label = {
                        Text(text = "Confirm Password")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent,
                        disabledContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        disabledIndicatorColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFE8E8).copy(alpha = 0.15f)
                )
            ) {
                Text(text = "Next")
            }

        },
        bottomContent = {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Divider(
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = " OR ",
                        color = Color(0xFF606167),
                        fontSize = 12.sp
                    )
                    Divider(modifier = Modifier.weight(1f))
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White
                    ),
                    border = BorderStroke(width = 1.dp, color = Color(0xFF023C40))
                ) {
                    val iconWidth = 24.dp

                    Icon(
                        painter = painterResource(id = HelCareIcons.GoogleLogo),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )

                    Text(
                        text = "Login with Google",
                        modifier = Modifier
                            .weight(1f)
                            .offset(-iconWidth / 2),
                        textAlign = TextAlign.Center,
                        color = Color(0xFF023C40)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

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
//                        .align(Alignment.BottomCenter)
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .clickable { },
                    onClick = { offset ->
                        alreadyHaveAnAccountString.getStringAnnotations(
                            start = offset,
                            end = offset
                        )
                            .firstOrNull()
                            ?.let {
//                                onLoginClick()
                            }
                    }
                )
            }
        }
    )
}

@Preview
@Composable
fun DoctorRegisterPreview() {
    HelCareTheme {
        DoctorRegisterScreen()
    }
}