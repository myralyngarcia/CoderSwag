package com.example.myralyn.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by myralyn on 19/01/18.
 */
class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick: (Category)-> Unit): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        //this is where we inflate the view for the very first time if there isn't a view available to recycle
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        //get reference to the UI elements
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        //then we bind the data
        fun bindCategory(category:Category, context:Context){
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
            itemView.setOnClickListener { itemClick(category) }
        }

    }
}