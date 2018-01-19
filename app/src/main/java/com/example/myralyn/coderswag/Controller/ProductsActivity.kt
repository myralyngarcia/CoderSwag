package com.example.myralyn.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.category_list_item.*

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
