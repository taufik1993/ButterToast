package com.taufik.buttertoast

import android.content.Context
import android.widget.Toast

class ButterToast private constructor(builder: Builder) {
    private val message: String? = builder.message
    private val resourceId: Int = builder.resourceId
    private val context: Context = builder.context

    fun showToast() {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    class Builder(val context: Context) {
        var message: String? = null
        var resourceId: Int = 0

        fun show()= ButterToast(this)
    }
}