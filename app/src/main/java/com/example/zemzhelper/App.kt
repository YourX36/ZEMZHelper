package com.example.zemzhelper

import android.app.Application
import com.example.zemzhelper.model.services.DetailService

class App : Application() {

    val detailsService = DetailService()
}