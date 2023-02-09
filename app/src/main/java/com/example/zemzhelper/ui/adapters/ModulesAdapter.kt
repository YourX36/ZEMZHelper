package com.example.zemzhelper.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zemzhelper.databinding.ItemModuleBinding
import com.example.zemzhelper.model.entities.Module


class ModulesAdapter: RecyclerView.Adapter<ModulesAdapter.ModulesViewHolder>() {

    var modules: List<Module> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModulesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemModuleBinding.inflate(inflater, parent, false)
        return ModulesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ModulesViewHolder, position: Int) {
        val module = modules[position]
        with(holder.binding) {
            tvModuleName.text = module.moduleName
            tvNameMachine.text = module.moduleMachine.machineName
        }
    }

    override fun getItemCount(): Int = modules.size

    class ModulesViewHolder(val binding: ItemModuleBinding) : RecyclerView.ViewHolder(binding.root)
}