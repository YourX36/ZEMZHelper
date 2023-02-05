package com.example.zemzhelper.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zemzhelper.databinding.FragmentMainBinding
import com.example.zemzhelper.machinesTMP
import com.example.zemzhelper.ui.adapters.MachineAdapter

class MainFragment : Fragment() {
    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter: MachineAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MachineAdapter()

        val layoutManager = LinearLayoutManager(requireContext())
        rvMachines.layoutManager= layoutManager
        rvMachines.adapter = adapter
        adapter.machines = machinesTMP
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}