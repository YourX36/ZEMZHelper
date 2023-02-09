package com.example.zemzhelper.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zemzhelper.model.details.Details
import com.example.zemzhelper.model.services.DetailService

class DetailsViewModel(
private val detailsService: DetailService
) : ViewModel() {

    private val _details = MutableLiveData<List<Details>>()
    val details: LiveData<List<Details>> = _details

    fun loadDetails() {
        detailsService.getDetails()
    }

}