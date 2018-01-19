package com.example.myralyn.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.myralyn.coderswag.Adapters.CategoryAdapter
import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this, DataService.categories)
        //tell ui element categoryListView what it needs to listen to
        categoryListView.adapter = adapter

        //when we click on one of the item in listview it does not do anything
        //do the following so it is clickable: Add onclick listener for the list view
        //but below wont work for recycler view so we will comment it for now
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}
