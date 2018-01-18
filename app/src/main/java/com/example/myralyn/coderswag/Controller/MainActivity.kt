package com.example.myralyn.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tell ArrayAdapter which context it will use, the format, the datasource
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,DataService.categories)
        //tell listview what it needs to listen to
        categoryListView.adapter = adapter
    }
}
