package com.example.zemzhelper.model.services

import com.example.zemzhelper.model.details.Details



class DetailService {
    private var details = mutableListOf<Details>()


    fun getDetails(): List<Details> = details

}