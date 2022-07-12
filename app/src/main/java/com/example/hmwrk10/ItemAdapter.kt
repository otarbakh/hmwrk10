package com.example.hmwrk10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hmwrk10.databinding.ItemLayoutBinding

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    private val itmeList = mutableListOf<ItemData>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }



    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.itemsData(itmeList[position])


    }

    fun updateItem(list: List<ItemData>) {
        itmeList.clear()
        itmeList.addAll(list)
        notifyItemRangeChanged(0, itmeList.size)
    }

    override fun getItemCount(): Int {
        return itmeList.size
    }

    inner class ItemViewHolder(val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun itemsData(itemData: ItemData) {
            binding.tvTitle.text = itemData.title
            binding.tvPrice.text = itemData.price.toString()
            binding.ivImage.setImageResource(itemData.image)


        }
    }
}