package com.bitcodetech.customviews1

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.Toast

@SuppressLint("AppCompatCustomView")
class ExitButton(
    context: Context,
    attributeSet: AttributeSet?
) : Button(context, attributeSet) {

    var exitable = true

    init {
        this.setOnClickListener {
            if(exitable) {
                System.exit(0)
            }
            else {
                Toast.makeText(
                    this.context,
                    "Can exit app...",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    constructor(context: Context) : this(context, null)

}