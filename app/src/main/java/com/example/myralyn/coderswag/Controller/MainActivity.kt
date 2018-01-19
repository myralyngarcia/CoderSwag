package com.example.myralyn.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myralyn.coderswag.Adapters.CategoryAdapter
import com.example.myralyn.coderswag.Adapters.CategoryRecycleAdapter
import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Services.DataService
import com.example.myralyn.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //adapter = CategoryAdapter(this, DataService.categories)
        //we use lambda category->
        adapter = CategoryRecycleAdapter(this, DataService.categories){ category ->
            //when we click on the itemt we transition to another activity
            val productIntent = Intent(this, ProductsActivity::class.java)
            //we need to pass data so when we click in name the name of product is printed out
            //we need to create package Utilites and file Constants
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)

        }
        //tell ui element categoryListView what it needs to listen to
        categoryListView.adapter = adapter
        //for recyclerview we need the layout manager
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        //lets create onclickListener

        }
    }

