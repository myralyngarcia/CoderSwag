package com.example.myralyn.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myralyn.coderswag.Model.Product
import com.example.myralyn.coderswag.R
import com.example.myralyn.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product=intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        productDesc.text=product.title
        productPrice.text=product.price
        productDetailedDesc.text="No Description for this product exists in DataService"
        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productImage.setImageResource(resourceId)


    }
}
