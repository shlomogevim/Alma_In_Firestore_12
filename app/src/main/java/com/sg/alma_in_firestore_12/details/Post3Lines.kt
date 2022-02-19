package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.sg.alma_in_firestore_12.R
import com.sg.alma_in_firestore_12.details.PostGenerator
import com.sg.alma_in_firestore_12.model.Post
import com.sg.alma_in_firestore_12.utilities.CONSTANT
import com.sg.alma_in_firestore_12.utilities.Utility

class Post3Lines(val context: Context) {

    private val image: ImageView = (context as Activity).findViewById(R.id.imageView)
    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val postCreatorNew = PostGenerator(context, layout)
    private val util= Utility()



 /*   fun post306() {
        val imageUri1 ="https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
        image.load(imageUri1)
        val post = Post()
        with(post) {
            postNum = 306
            lineNum =3
            imageUri ="https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
            postText = arrayListOf(
                "המתכון הבטוח שלא  להזדקן",
                "הוא פשוט",
                "להישאר צעיר.",
            )
            val di=0
            val dd=0
            val postMargin1 = arrayOf(
                arrayOf(0,0+di,0,-1+dd),
                arrayOf(0,90+di, 0, -1+dd),
                arrayOf(0,135+di, 0,-1+dd)
            )
            postMargin=convetToString(postMargin1)
            postBackground ="a3842c"
            postTransparency =7
            val size1=25
            val size2=0
            postTextSize =  arrayListOf(0, size1,size2)
            postPadding =  arrayListOf(10, 0,10,0)
            postTextColor = arrayListOf(CONSTANT, "#ffffff")
            postFontFamily =4
            postRadiuas = 15
        }
        postCreatorNew.createPost(post)

    }*/

  /*  private fun convetToString(postMargin1: Array<Array<Int>>): ArrayList<String> {
        var arr=ArrayList<String>()
        for (index in postMargin1.indices){
            val doc=postMargin1[index]
            val str=doc.toString()
          arr.add(str)
        }
      return arr
    }*/


      fun post306() {
          val imageUri1 ="https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
          image.load(imageUri1)
          val post = Post()
          with(post) {
              postNum = 306
              lineNum =3
              imageUri ="https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
              postText = arrayOf(
                  "המתכון הבטוח שלא  להזדקן",
                  "הוא פשוט",
                  "להישאר צעיר.",
              )
              val di=0
              val dd=0
              postMargin = arrayOf(
                  arrayOf(0,0+di,0,-1+dd),
                  arrayOf(0,90+di, 0, -1+dd),
                  arrayOf(0,135+di, 0,-1+dd)
              )
              postBackground ="a3842c"
              postTransparency =7
              val size1=25
              val size2=0
              postTextSize =  arrayOf(0, size1,size2)
              postPadding =  arrayOf(10, 0,10,0)
              postTextColor = arrayOf(CONSTANT, "#ffffff")
              postFontFamily =4
              postRadiuas = 15
          }
          postCreatorNew.createPost(post)

      }


    }


