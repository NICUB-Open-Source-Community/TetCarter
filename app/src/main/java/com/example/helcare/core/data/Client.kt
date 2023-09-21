package com.example.helcare.core.data

import android.content.Context
import com.example.helcare.core.data.Client.client
import io.appwrite.Client
import io.appwrite.ID
import io.appwrite.services.Account
import io.appwrite.services.Realtime

object Client {
    lateinit var client: Client

fun create(context: Context){
    client = Client(context)
    .setEndpoint("https://cloud.appwrite.io/v1") // Your Appwrite Endpoint
    .setProject("[PROJECT_ID]") // Your project ID
    .setSelfSigned(true)

}
}

// Register User
val account = Account(client)

//val user = account.create(
//    userId = ID.unique(),
//    email = "email@example.com",
//    password = "password"
//)

// Subscribe to files channel
val realtime = Realtime(client)

val subscription = realtime.subscribe("files") {
    if (it.events.contains("buckets.*.files.*.create")) {
        // Log when a new file is uploaded
        print(it.payload.toString());
    }
}