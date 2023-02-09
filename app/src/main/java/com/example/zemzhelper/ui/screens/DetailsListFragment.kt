package com.example.zemzhelper.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zemzhelper.App
import com.example.zemzhelper.databinding.FragmentDetailsListBinding
import com.example.zemzhelper.model.services.DetailService
import com.example.zemzhelper.ui.adapters.DetailsAdapter

class DetailsListFragment : Fragment() {

    private var _binding: FragmentDetailsListBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: DetailsAdapter

    private val detailService: DetailService
        get() = (requireActivity().applicationContext as App).detailsService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailsListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        adapter = DetailsAdapter()

        val layoutManager = LinearLayoutManager(requireContext())
        rvDetails.layoutManager = layoutManager
        rvDetails.adapter = adapter
        adapter.details = detailService.getDetails()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance() = DetailsListFragment()
    }
}