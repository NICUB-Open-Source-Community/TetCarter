package com.example.helcare.feature.authentication.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helcare.core.designsystem.icon.HelCareIcons
import com.example.helcare.core.designsystem.theme.HelCareTheme

@Composable
fun DoctorLoginRoute() {
    LoginScreen()
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    AuthBackground(
        modifier = modifier,
        topContent = {
            Text(
                text = "Log In",
                fontSize = 42.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

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
                        Text(text = "Email address")
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

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFE8E8).copy(alpha = 0.15f)
                )
            ) {
                Text(text = "Login")
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

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.weight(0.5f))

                    Row(
                        modifier = Modifier.weight(0.5f),
                        horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start)
                    ) {
                        Divider(
                            modifier = Modifier
                                .height(32.dp)
                                .width(1.dp)
                        )

                        TextButton(
                            onClick = { },
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = Color(0xFF9E1007)
                            )
                        ) {
                            Text(text = "Forgot Password?")
                        }
                    }

                }
            }
        }
    )
}

@Preview
@Composable
fun LoginScreenPreview() {
    HelCareTheme {
        LoginScreen()
    }
}