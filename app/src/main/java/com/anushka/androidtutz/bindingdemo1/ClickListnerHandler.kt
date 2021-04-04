package com.anushka.androidtutz.bindingdemo1

import android.content.Context
import android.view.View
import android.widget.Toast

class ClickListnerHandler(private val context: Context) {

    fun onClickRefreshListner(view: View){
        Toast.makeText(context, "Refrweshing the view" , Toast.LENGTH_SHORT).show()
    }
    fun onClickCancelListner(view: View){
        Toast.makeText(context, "Cancel the view" , Toast.LENGTH_SHORT).show()
    }
}