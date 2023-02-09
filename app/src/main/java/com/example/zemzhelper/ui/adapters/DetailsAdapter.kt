package com.example.zemzhelper.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zemzhelper.R
import com.example.zemzhelper.databinding.ItemDetailBinding
import com.example.zemzhelper.model.details.Details

class DetailsAdapter : RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>() {

    var details: List<Details> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = details.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDetailBinding.inflate(inflater, parent, false)
        return DetailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val detail = details[position]
        with(holder.binding) {
            tvNumber.text = detail.number()
            tvName.text = detail.name()
            tvSteel.text = detail.steel()
            tvDiameter.text = detail.diameter()
            tvLength.text = detail.length()
        }
    }

    class DetailsViewHolder(
        val binding: ItemDetailBinding
    ) : RecyclerView.ViewHolder(binding.root)
}