package com.example.zemzhelper.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zemzhelper.databinding.ItemMachineBinding
import com.example.zemzhelper.model.entities.Machine

class MachineAdapter : RecyclerView.Adapter<MachineAdapter.MachineViewHolder>() {

    var machines: List<Machine> = emptyList<Machine>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = machines.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MachineViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMachineBinding.inflate(inflater, parent, false)
        return MachineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MachineViewHolder, position: Int) {
        val machine = machines[position]
        with(holder.binding) {
            tvNameMachine.text = machine.machineName
            tvCountMachine.text = machine.machineCount.toString()
        }
    }

    class MachineViewHolder(val binding: ItemMachineBinding) : RecyclerView.ViewHolder(binding.root)
}