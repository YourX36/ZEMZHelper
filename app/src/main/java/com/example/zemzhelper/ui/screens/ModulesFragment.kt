package com.example.zemzhelper.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.zemzhelper.databinding.FragmentModulesBinding
import com.example.zemzhelper.modules22
import com.example.zemzhelper.ui.adapters.ModulesAdapter

class ModulesFragment : Fragment() {

    private var _binding: FragmentModulesBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter: ModulesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentModulesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ModulesAdapter()

        val layoutManager = LinearLayoutManager(requireContext())
        rvModules.layoutManager = layoutManager
        rvModules.adapter = adapter
        adapter.modules = modules22
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance() = ModulesFragment()
    }
}