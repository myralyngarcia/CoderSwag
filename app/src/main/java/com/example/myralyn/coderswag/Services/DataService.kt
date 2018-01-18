package com.example.myralyn.coderswag.Services

import com.example.myralyn.coderswag.Model.Category
import com.example.myralyn.coderswag.Model.Product

/**
 * Created by myralyn on 18/01/18.
 */
object DataService {
    val categories = listOf(Category("HATS","hatimage.png"),
            Category("HOODIES","hoodieimage.png"),
            Category("DIGITAL","digitalgoodsimage.png"),
            Category("SHIRT","shirtimage.png")
    )

    //declare the products
    val hats = listOf(Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$18","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04")
            )

    val hoodies = listOf(Product("Devslopes Hoodie Gray","$28","hoodies01"),
            Product("Devslopes Hoodie Red","$32","hoodies02"),
            Product("Devslopes Gray Hoodie","$28","hoodies03"),
            Product("Devslopes Black Hoodie","$32","hoodies04")
    )

    val shirts = listOf(Product("Devslopes Shirt Black","$18","shirt01"),
            Product("Devslopes Badge Light Gray","$20","shirt02"),
            Product("Devslopes Logo Shirt Red","$22","shirt03"),
            Product("Devslopes Hustle","$22","shirt04"),
            Product("Kickflip Studios","$18","shirt05")    )
}