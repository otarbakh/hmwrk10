package com.example.hmwrk10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hmwrk10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var binding: ActivityMainBinding
    private val itemList = mutableListOf<ItemData>()
    private val categoriesList = mutableListOf<CategoryData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initICategories()
    }

    private fun initICategories(){
        categoryAdapter = CategoryAdapter().apply {

            categoriesNames()
            updateCategory(categoryList)

        }

        binding.rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.rvCategories.adapter = categoryAdapter
    }

    private fun categoriesNames() {
        categoriesList.add(
            CategoryData(
                "All",

                )
        )
        categoriesList.add(
            CategoryData(
                "party",

                )
        )
        categoriesList.add(
            CategoryData(
                "Catrgory1",

                )
        )
        categoriesList.add(
            CategoryData(
                "Catrgory2",

                )
        )
        categoriesList.add(
            CategoryData(
                "Catrgory3",

                )
        )


    }

}