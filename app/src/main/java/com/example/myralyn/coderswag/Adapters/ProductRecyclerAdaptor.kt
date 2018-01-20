package com.example.myralyn.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.myralyn.coderswag.Model.Product
import com.example.myralyn.coderswag.R

/**
 * Created by myralyn on 19/01/18.
 */
class ProductRecyclerAdaptor(val context: Context, val products: List<Product>, val itemClick: (Product)-> Unit): RecyclerView.Adapter<ProductRecyclerAdaptor.ProductHolder>(){
    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
       holder?.bindProduct(products[position],context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        //this is when we inflat the view for the very first time if no view to recycle
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
         return products.count()
    }

    inner class ProductHolder(itemView: View?, val itemClick: (Product)->Unit):RecyclerView.ViewHolder(itemView){

        //get reference to the UI elements
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productDesc = itemView?.findViewById<TextView>(R.id.productDesc)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        //then bind the data
        fun bindProduct(product:Product, context:Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productDesc?.text = product.title
            productPrice?.text = product.price
            itemView.setOnClickListener { itemClick(product) }
        }

    }
}