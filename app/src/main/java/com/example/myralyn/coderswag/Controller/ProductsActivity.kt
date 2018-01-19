package com.example.myralyn.coderswag.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.myralyn.coderswag.Adapters.ProductRecyclerAdaptor
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Services.DataService
import com.example.myralyn.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*
import kotlinx.android.synthetic.main.category_list_item.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductRecyclerAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //println(categoryType)

        //this is going to return the list of produce based on the category user clicks
        adapter = ProductRecyclerAdaptor(this, DataService.getProducts(categoryType))

        //when we rotate the device to landscape we have many spaces, so lets increase spancount
        //when in landscape mode
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount=3
        }

        //when we run this in table pixel the images are huge so we also check for device size
        val screenSize = resources.configuration.screenWidthDp
        //x-large screen starts 720dp
        if (screenSize > 720){
            spanCount=3
        }

        //this is what everyone forgets we need layoutmanager when using recyclerview
        //this time we are using gridlayoutmanager not linearlayoutmanager
        val layoutManager = GridLayoutManager(this, spanCount)
        //set layoutMan for the id ProductsListView in activity_products.xml
        ProductsListView.layoutManager = layoutManager
        ProductsListView.adapter = adapter

    }
}
