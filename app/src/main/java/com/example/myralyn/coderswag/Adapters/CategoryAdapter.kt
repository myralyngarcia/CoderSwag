package com.example.myralyn.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.R

/**
 * Created by myralyn on 18/01/18.
 */
class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        if(convertView == null) {
            //this means it the 1st time these views are present, when we launch the first time
            //if this is the case we go through the process of inflating and finding the id
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            //image and name ui elements references
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time!")
            categoryView.tag = holder

        }else{//we reuse the cell
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green, recycle!")
        }

        //now we have CategoryView, image and name ui elements references now we can assign these values
        //for the category that it corresponds to in the list view
        //we can grab each category for each corresponding row element by doing the following
        //then assigning the title, ie: HATS, HOODIES, DIGITAL to the text ui element
        val category = categories[position]
        holder.categoryName?.text = category.title


        //the image we do: from res we see the image name ie. hat1.png, hat2.png we need to convert this string
        //to resource id
        //get reference from our resources then call getIdentifier
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        //now we have reference that corresponds to category image, then we can say
        holder.categoryImage?.setImageResource(resourceId)
        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    //we need a class inside the Category Adapter to use ViewHolder
    //this allows us to recycle our views
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}

