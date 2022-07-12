package com.example.hmwrk10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hmwrk10.databinding.CategoriesLayoutBinding

class ItemAdapter(var itemList: MutableList<ItemData>) : RecyclerView.Adapter<UsersViewHolder>() {


    private lateinit var itemClickListener: (CategoryData, Int) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val binding =
            CategoriesLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UsersViewHolder(binding)
    }


    fun setOnDeleteClickListener(clickListener: (CategoryData,Int) -> Unit) {
        this.itemClickListener = clickListener
    }


    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {

//        val user = usersList[position]
//        holder.binding.tvEmail.text = user.email
//        holder.binding.tvLastname.text = user.lastName
//        holder.binding.tvFirstname.text = user.firstName


    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}




class UsersViewHolder(val binding: CategoriesLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {

}