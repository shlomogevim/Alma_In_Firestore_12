package com.sg.alma_in_firestore_12.details

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.res.ResourcesCompat
import coil.load
import com.sg.alma_in_firestore_12.R
import com.sg.alma_in_firestore_12.model.Post
import com.sg.alma_in_firestore_12.utilities.CONSTANT
import com.sg.alma_in_firestore_12.utilities.Helper1
import com.sg.alma_in_firestore_12.utilities.Utility


class CreatePost(val contex: Context, val layout: ConstraintLayout) {

    val util= Utility()

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()
    val helper = Helper1()
    val textView9 = TextView(contex)
    val textView8 = TextView(contex)
    val textView7 = TextView(contex)
    val textView6 = TextView(contex)
    val textView5 = TextView(contex)
    val textView4 = TextView(contex)
    val textView3 = TextView(contex)
    val textView2 = TextView(contex)

    fun drawPost(post: Post) {
        //util.logi(" \n CeratePost10  ===>\n $post")
        var lineNum=1
         lineNum= post.lineNum!!
        val postText=post.postText
        val backGround=post.postBackground
        val transparency=post.postTransparency
        val margin=post.postMargin
        val padding=post.postPadding
        val textSizeArray=post.postTextSize
        val textColorArray=post.postTextColor
        val fontFamily=post.postFontFamily
        val radius=post.postRadiuas

          // val image: ImageView = (context as Activity).findViewById(R.id.imageView)
          val image: ImageView =layout.findViewById(R.id.imageView)

        val fontAddress = helper.getFamilyFont(fontFamily)
        val tra = helper.getTransfo(transparency)
        val shape = GradientDrawable()
        shape.cornerRadius = radius.toPx().toFloat()
        shape.setColor(Color.parseColor("#$tra$backGround"))

        image.load(post.imageUri)

         for (index in 1.. textColorArray.size-1){
             if (!textColorArray[index].contains("#")){
                 textColorArray[index]="#"+textColorArray[index]
             }
         }

     //   util.logi("postGenerator9 ==> /n textColorArray[0]= ${textColorArray[0]}")
        val textView1 = TextView(contex)
        textView1.text = postText[0]
      // util.logi("postGenerator10 ==> /n textColorArray[0]= ${textColorArray[0]}")
        if (textColorArray[0] == CONSTANT) {
            textView1.setTextColor(Color.parseColor(textColorArray[1]))
        } else {
            textView1.setTextColor(Color.parseColor(textColorArray[1]))
        }
        if (textSizeArray[0] == 0) {
            textView1.textSize = textSizeArray[1].toFloat()
        } else {
            textView1.textSize = textSizeArray[1].toFloat()
        }
        textView1.id = View.generateViewId()
        textView1.background = shape
        textView1.typeface = ResourcesCompat.getFont(contex, fontAddress)
        textView1.setPadding(
            padding[0].toPx(),
            padding[1].toPx(),
            padding[2].toPx(),
            padding[3].toPx()
        )
        textView1.gravity = Gravity.CENTER

      // util.logi("NineLinesPostNew10 ==>\n lineNum=$lineNum,  postText[0]=${postText[0]}, backGround=$backGround, ")

        if (lineNum>1) {
            textView2.text = postText[1]
            if (textSizeArray[0] == 0) {
                textView2.textSize = textSizeArray[1].toFloat()
            } else {
                textView2.textSize = textSizeArray[2].toFloat()
            }
            textView2.id = View.generateViewId()
            textView2.typeface = ResourcesCompat.getFont(contex, fontAddress)
            if (textColorArray[0] == CONSTANT) {
                textView2.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView2.setTextColor(Color.parseColor(textColorArray[2]))
            }
            // textView2.setBackgroundColor(Color.parseColor("#$tra$backGround"))
            textView2.background = shape
            textView2.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView2.gravity = Gravity.CENTER
        }
        if (lineNum > 2) {
            textView3.text = postText[2]
            if (textSizeArray[0] == 0) {
                textView3.textSize = textSizeArray[1].toFloat()
            } else {
                textView3.textSize = textSizeArray[3].toFloat()
            }
            textView3.id = View.generateViewId()
            textView3.typeface = ResourcesCompat.getFont(contex, fontAddress)
            if (textColorArray[0] == CONSTANT) {
                textView3.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView3.setTextColor(Color.parseColor(textColorArray[3]))
            }
            textView3.background = shape
            textView3.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView3.gravity = Gravity.CENTER
        }

        if (lineNum > 3) {
            textView4.text = postText[3]
            if (textSizeArray[0] == 0) {
                textView4.textSize = textSizeArray[1].toFloat()
            } else {
                textView4.textSize = textSizeArray[4].toFloat()
            }
            textView4.id = View.generateViewId()
            textView4.typeface = ResourcesCompat.getFont(contex, fontAddress)
            if (textColorArray[0] == CONSTANT) {
                textView4.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView4.setTextColor(Color.parseColor(textColorArray[4]))
            }
            textView4.background = shape
            textView4.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView4.gravity = Gravity.CENTER
        }
        if (lineNum > 4) {
            textView5.text = postText[4]
            if (textSizeArray[0] == 0) {
                textView5.textSize = textSizeArray[1].toFloat()
            } else {
                textView5.textSize = textSizeArray[5].toFloat()
            }
            if (textColorArray[0] == CONSTANT) {
                textView5.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView5.setTextColor(Color.parseColor(textColorArray[5]))
            }
            textView5.id = View.generateViewId()
            textView5.typeface = ResourcesCompat.getFont(contex, fontAddress)
            textView5.background = shape
            textView5.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView5.gravity = Gravity.CENTER
        }

        if (lineNum > 5) {
            textView6.text = postText[5]

          //  util.logi("NineLinesPostNew11 ==>\n lineNum=$lineNum,  postText[5]=${postText[5]}, backGround=$backGround, ")

            if (textSizeArray[0] == 0) {
                textView6.textSize = textSizeArray[1].toFloat()
            } else {
                textView6.textSize = textSizeArray[6].toFloat()
            }
            if (textColorArray[0] == CONSTANT) {
                textView6.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView6.setTextColor(Color.parseColor(textColorArray[6]))
            }
            textView6.id = View.generateViewId()
            textView6.typeface = ResourcesCompat.getFont(contex, fontAddress)
            textView6.background = shape
            textView6.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView6.gravity = Gravity.CENTER
        }

        if (lineNum > 6) {
            textView7.text = postText[6]
            if (textSizeArray[0] == 0) {
                textView7.textSize = textSizeArray[1].toFloat()
            } else {
                textView7.textSize = textSizeArray[7].toFloat()
            }
            textView7.id = View.generateViewId()
            if (textColorArray[0] == CONSTANT) {
                textView7.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView7.setTextColor(Color.parseColor(textColorArray[7]))
            }
            textView7.typeface = ResourcesCompat.getFont(contex, fontAddress)
            textView7.background = shape
            textView7.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView7.gravity = Gravity.CENTER
        }
        if (lineNum > 7) {
            textView8.text = postText[7]
            if (textSizeArray[0] == 0) {
                textView8.textSize = textSizeArray[1].toFloat()
            } else {
                textView8.textSize = textSizeArray[8].toFloat()
            }
            if (textColorArray[0] == CONSTANT) {
                textView8.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView8.setTextColor(Color.parseColor(textColorArray[8]))
            }
            textView8.id = View.generateViewId()
            textView8.typeface = ResourcesCompat.getFont(contex, fontAddress)
            textView8.background = shape
            textView8.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView8.gravity = Gravity.CENTER
        }

        if (lineNum > 8) {
            textView9.text = postText[8]
            if (textSizeArray[0] == 0) {
                textView9.textSize = textSizeArray[1].toFloat()
            } else {
                textView9.textSize = textSizeArray[9].toFloat()
            }
            if (textColorArray[0] == CONSTANT) {
                textView9.setTextColor(Color.parseColor(textColorArray[1]))
            } else {
                textView9.setTextColor(Color.parseColor(textColorArray[9]))
            }
            textView9.id = View.generateViewId()
            textView9.typeface = ResourcesCompat.getFont(contex, fontAddress)
            textView9.background = shape
            textView9.setPadding(
                padding[0].toPx(),
                padding[1].toPx(),
                padding[2].toPx(),
                padding[3].toPx()
            )
            textView9.gravity = Gravity.CENTER
        }

        val lp1 = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        if (lineNum>1) {
            val lp2 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView2.layoutParams = lp2
        }
        if (lineNum > 2) {
            val lp3 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView3.layoutParams = lp3
        }
        if (lineNum > 3) {
            val lp4 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView4.layoutParams = lp4
        }
        if (lineNum > 4) {
            val lp5 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView5.layoutParams = lp5
        }
        if (lineNum > 5) {
            val lp6 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView6.layoutParams = lp6
        }
        if (lineNum > 6) {
            val lp7 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView7.layoutParams = lp7
        }
        if (lineNum > 7) {
            val lp8 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView8.layoutParams = lp8
        }
        if (lineNum > 8) {
            val lp9 = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )
            textView9.layoutParams = lp9
        }

        textView1.layoutParams = lp1


        with(layout) {
            if (lineNum>1) {
                val lp2 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView2.layoutParams = lp2
            }
            if (lineNum > 2) {
                val lp3 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView3.layoutParams = lp3
            }
            if (lineNum > 3) {
                val lp4 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView4.layoutParams = lp4
            }
            if (lineNum > 4) {
                val lp5 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView5.layoutParams = lp5
            }
            if (lineNum > 5) {
                val lp6 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView6.layoutParams = lp6
            }
            if (lineNum > 6) {
                val lp7 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView7.layoutParams = lp7
            }
            if (lineNum > 7) {
                val lp8 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView8.layoutParams = lp8
            }
            if (lineNum > 8) {
                val lp9 = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                textView9.layoutParams = lp9
            }

            textView1.layoutParams = lp1


            addView(textView1)
        }
        if (lineNum>1) {
            layout.addView(textView2)
        }
        if (lineNum > 2) {
            layout.addView(textView3)
        }
        if (lineNum > 3) {
            layout.addView(textView4)
        }
        if (lineNum > 4) {
            layout.addView(textView5)
        }
        if (lineNum > 5) {
            layout.addView(textView6)
        }
        if (lineNum > 6) {
            layout.addView(textView7)
        }
        if (lineNum > 7) {
            layout.addView(textView8)
        }
        if (lineNum > 8) {
            layout.addView(textView9)
        }

        val containSet = ConstraintSet()
        containSet.clone(layout)

        if (margin[0][0] > -1) {
            containSet.connect(
                textView1.id,
                ConstraintSet.LEFT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.LEFT, margin[0][0].toPx()
            )
        }
        if (margin[0][1] > -1) {
            containSet.connect(
                textView1.id,
                ConstraintSet.TOP,
                ConstraintSet.PARENT_ID,
                ConstraintSet.TOP, margin[0][1].toPx()
            )
        }
        if (margin[0][2] > -1) {
            containSet.connect(
                textView1.id,
                ConstraintSet.RIGHT,
                ConstraintSet.PARENT_ID,
                ConstraintSet.RIGHT, margin[0][2].toPx()
            )
        }
        if (margin[0][3] > -1) {
            containSet.connect(
                textView1.id,
                ConstraintSet.BOTTOM,
                ConstraintSet.PARENT_ID,
                ConstraintSet.BOTTOM, margin[0][3].toPx()
            )
        }

        if (lineNum>1) {
            if (margin[1][0] > -1) {
                containSet.connect(
                    textView2.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[1][0].toPx()
                )
            }
            if (margin[1][1] > -1) {
                containSet.connect(
                    textView2.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[1][1].toPx()
                )
            }
            if (margin[1][2] > -1) {
                containSet.connect(
                    textView2.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[1][2].toPx()
                )
            }
            if (margin[1][3] >-1) {
                containSet.connect(
                    textView2.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[1][3].toPx()
                )
            }
        }
        if (lineNum > 2) {
            if (margin[2][0] > -1) {
                containSet.connect(
                    textView3.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[2][0].toPx()
                )
            }
            if (margin[2][1] > -1) {
                containSet.connect(
                    textView3.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[2][1].toPx()
                )
            }
            if (margin[2][2] > -1) {
                containSet.connect(
                    textView3.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[2][2].toPx()
                )
            }
            if (margin[2][3] > -1) {
                containSet.connect(
                    textView3.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[2][3].toPx()
                )
            }
        }

        if (lineNum > 3) {
            if (margin[3][0] > -1) {
                containSet.connect(
                    textView4.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[3][0].toPx()
                )
            }
            if (margin[3][1] > -1) {
                containSet.connect(
                    textView4.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[3][1].toPx()
                )
            }
            if (margin[3][2] > -1) {
                containSet.connect(
                    textView4.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[3][2].toPx()
                )
            }
            if (margin[3][3] > -1) {
                containSet.connect(
                    textView4.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[3][3].toPx()
                )
            }
        }
        if (lineNum > 4) {
            if (margin[4][0] > -1) {
                containSet.connect(
                    textView5.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[4][0].toPx()
                )
            }
            if (margin[4][1] > -1) {
                containSet.connect(
                    textView5.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[4][1].toPx()
                )
            }
            if (margin[4][2] > -1) {
                containSet.connect(
                    textView5.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[4][2].toPx()
                )
            }
            if (margin[4][3] > -1) {
                containSet.connect(
                    textView5.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[4][3].toPx()
                )
            }
        }
        if (lineNum > 5) {
            if (margin[5][0] > -1) {
                containSet.connect(
                    textView6.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[5][0].toPx()
                )
            }
            if (margin[5][1] > -1) {
                containSet.connect(
                    textView6.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[5][1].toPx()
                )
            }
            if (margin[5][2] > -1) {
                containSet.connect(
                    textView6.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[5][2].toPx()
                )
            }
            if (margin[5][3] > -1) {
                containSet.connect(
                    textView6.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[5][3].toPx()
                )
            }
        }
        if (lineNum > 6) {
            if (margin[6][0] > -1) {
                containSet.connect(
                    textView7.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[6][0].toPx()
                )
            }
            if (margin[6][1] > -1) {
                containSet.connect(
                    textView7.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[6][1].toPx()
                )
            }
            if (margin[6][2] > -1) {
                containSet.connect(
                    textView7.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[6][2].toPx()
                )
            }
            if (margin[6][3] > -1) {
                containSet.connect(
                    textView7.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[6][3].toPx()
                )
            }
        }
        if (lineNum > 7) {
            if (margin[7][0] > -1) {
                containSet.connect(
                    textView8.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[7][0].toPx()
                )
            }
            if (margin[7][1] > -1) {
                containSet.connect(
                    textView8.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[7][1].toPx()
                )
            }
            if (margin[7][2] > -1) {
                containSet.connect(
                    textView8.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[7][2].toPx()
                )
            }
            if (margin[7][3] > -1) {
                containSet.connect(
                    textView8.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[7][3].toPx()
                )
            }
        }
        if (lineNum > 8) {
            if (margin[8][0] > -1) {
                containSet.connect(
                    textView9.id,
                    ConstraintSet.LEFT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.LEFT, margin[8][0].toPx()
                )
            }
            if (margin[8][1] > -1) {
                containSet.connect(
                    textView9.id,
                    ConstraintSet.TOP,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.TOP, margin[8][1].toPx()
                )
            }
            if (margin[8][2] > -1) {
                containSet.connect(
                    textView9.id,
                    ConstraintSet.RIGHT,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.RIGHT, margin[8][2].toPx()
                )
            }
            if (margin[8][3] > -1) {
                containSet.connect(
                    textView9.id,
                    ConstraintSet.BOTTOM,
                    ConstraintSet.PARENT_ID,
                    ConstraintSet.BOTTOM, margin[8][3].toPx()
                )
            }
        }

     containSet.applyTo(layout)

    }


}