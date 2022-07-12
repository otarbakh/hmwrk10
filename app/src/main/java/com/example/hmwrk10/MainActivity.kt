package com.example.hmwrk10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hmwrk10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var itemAdapter: ItemAdapter

    private lateinit var binding: ActivityMainBinding
    private val itemList = mutableListOf<ItemData>()
    private val categoriesList = mutableListOf<CategoryData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initICategories()
        initItems()
    }

    private fun initItems() {
        itemAdapter = ItemAdapter().apply {
            itemNames()
            updateItem(itemList)
        }

        binding.rvItems.layoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)


        binding.rvItems.adapter = itemAdapter


    }

    private fun initICategories() {
        categoryAdapter = CategoryAdapter().apply {

            categoriesNames()
            updateCategory(categoriesList)

        }

        binding.rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
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


    private fun itemNames() {
        itemList.add(
            ItemData(
                R.drawable.redcloth,
                "Belt suit blazer ",
                150,
                "ALl,"
            )
        )
        itemList.add(
            ItemData(
                R.drawable.blue,
                "Belt suit blazer ",
                150,
                "Camping"
            )
        )
        itemList.add(
            ItemData(
                R.drawable.blackcloth,
                "Belt suit blazer ",
                150,
                "Catrgory1"
            )
        )
        itemList.add(
            ItemData(
                R.drawable.yellowcloth,
                "Belt suit blazer ",
                150,
                "Catrgory2"
            )
        )
        itemList.add(
            ItemData(
                R.drawable.redcloth,
                "Belt suit blazer ",
                150,
                "party"
            )
        )
        itemList.add(
            ItemData(
                R.drawable.blackcloth,
                "Belt suit blazer ",
                150,
                "Catrgory3"
            )
        )

    }

}