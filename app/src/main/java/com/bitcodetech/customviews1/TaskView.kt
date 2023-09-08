package com.bitcodetech.customviews1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

class TaskView(
    context: Context,
    attributeSet: AttributeSet?
) : androidx.appcompat.widget.AppCompatTextView(context, attributeSet){

    constructor(context: Context) : this(context, null)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.RED
        paint.strokeWidth = 3f

        canvas!!.apply {
            drawLine(50F, 0F, 50F, height.toFloat(), paint)
            drawLine(50F, 0F, 50F, height.toFloat(), paint)
            paint.color = Color.BLACK
            drawLine(0F, height.toFloat(), width.toFloat(), height.toFloat(), paint)
        }

        /*canvas?.drawLine(50F, 0F, 50F, height.toFloat(), paint)
        canvas?.drawLine(60F, 0F, 60F, height.toFloat(), paint)
        paint.color = Color.BLACK
        canvas?.drawLine(0F, height.toFloat(), width.toFloat(), height.toFloat(), paint)*/
    }

}