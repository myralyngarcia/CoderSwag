package com.example.myralyn.coderswag.Services

import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.Model.Product

/**
 * Created by myralyn on 18/01/18.
 */
object DataService {
    val categories = listOf(Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRT","shirtimage"),
            Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRT","shirtimage"),
            Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRT","shirtimage")
    )

    //declare the products
    val hats = listOf(Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4"),
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4"),
            Product("Devslopes Graphic Beanie","$18","hat1"),
            Product("Devslopes Hat Black","$20","hat2"),
            Product("Devslopes Hat White","$18","hat3"),
            Product("Devslopes Hat Snapback","$22","hat4")
            )

    val hoodies = listOf(Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4"),
            Product("Devslopes Hoodie Gray","$28","hoodie1"),
            Product("Devslopes Hoodie Red","$32","hoodie2"),
            Product("Devslopes Gray Hoodie","$28","hoodie3"),
            Product("Devslopes Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip Studios","$18","shirt5"),
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip Studios","$18","shirt5"),
            Product("Devslopes Shirt Black","$18","shirt1"),
            Product("Devslopes Badge Light Gray","$20","shirt2"),
            Product("Devslopes Logo Shirt Red","$22","shirt3"),
            Product("Devslopes Hustle","$22","shirt4"),
            Product("Kickflip Studios","$18","shirt5"))

    //we also need to create an empty array of products
    val digitalGood = listOf<Product>()
    //function to return list of product depends on the supplied category ie. HOODIES, SHIRT, HAT
    fun getProducts(category:String): List<Product> {
        return when (category) {
            "HOODIES" -> hoodies
            "HATS" -> hats
            "SHIRT" -> shirts
            else -> digitalGood
        }

    }
}