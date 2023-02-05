package com.example.zemzhelper.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zemzhelper.R
import com.example.zemzhelper.databinding.ItemDetailBinding
import com.example.zemzhelper.model.entities.Detail

class DetailsAdapter : RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>() {

    var details: List<Detail> = emptyList()
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
            val sketch = detail.sketch ?: R.drawable.ic_160
            val diameter = detail.diameter ?: detail.pipeDiameter
            val lenghtOrThickness = detail.length ?: detail.thickness
            imgSketch.setImageResource(sketch)
            tvNumberDrawing.text = detail.numberDrawing
            tvName.text = detail.detailName
            tvCount.text = detail.count.toString()
            tvSteel.text = detail.steel
            tvDiameter.text = diameter.toString()
            tvLengthOrThickness.text = lenghtOrThickness.toString()
        }
    }

    class DetailsViewHolder(
        val binding: ItemDetailBinding
    ) : RecyclerView.ViewHolder(binding.root)
}