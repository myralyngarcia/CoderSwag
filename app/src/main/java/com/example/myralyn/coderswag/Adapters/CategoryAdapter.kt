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
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        //image and name ui elements references
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        //now we have CategoryView, image and name ui elements references now we can assign these values
        //for the category that it corresponds to in the list view
        //we can grab each category for each corresponding row element by doing the following
        //then assigning the title, ie: HATS, HOODIES, DIGITAL to the text ui element
        val category = categories[position]
        categoryName.text = category.title


        //the image we do: from res we see the image name ie. hat1.png, hat2.png we need to convert this string
        //to resource id
        //get reference from our resources then call getIdentifier
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        //now we have reference that corresponds to category image, then we can say
        categoryImage.setImageResource(resourceId)

        //printout this resourceId so we see what it looks like
        println(resourceId)



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

}