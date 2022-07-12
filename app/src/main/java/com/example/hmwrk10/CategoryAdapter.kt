package com.example.hmwrk10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hmwrk10.databinding.CategoriesLayoutBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    val categoryList = mutableListOf<CategoryData>()
    private lateinit var itemClickListener: (CategoryData, Int) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding =
            CategoriesLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }


    fun setOnDeleteClickListener(clickListener: (CategoryData, Int) -> Unit) {
        this.itemClickListener = clickListener
    }


    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        holder.catdata(categoryList[position])


    }

    fun updateCategory(list: List<CategoryData>) {
        categoryList.clear()
        categoryList.addAll(list)
        notifyItemRangeChanged(0, categoryList.size)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    inner class CategoryViewHolder(val binding: CategoriesLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun catdata(categoryData: CategoryData) {
            binding.tvCategory.text = categoryData.CategoryName
        }
    }
}


