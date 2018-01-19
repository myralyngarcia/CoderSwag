package com.example.myralyn.coderswag.Controller

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
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //adapter = CategoryAdapter(this, DataService.categories)
        //we use lambda category->
        adapter = CategoryRecycleAdapter(this, DataService.categories){ category ->
            println(category.title)//when we click on the item the name appears in logcat
            println(category.image)
            //but we want to transition to another activity, lets work on it
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

