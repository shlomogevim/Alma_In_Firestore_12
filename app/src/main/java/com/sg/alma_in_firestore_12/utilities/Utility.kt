package com.sg.alma_in_firestore_12.utilities

import android.util.Log


class Utility {

  /*  fun addPostToFirestore(post: Post){
        val data=HashMap<String,Any>()
        with (post){
           data[POST_ID] =1
           data[POST_NUM] =postNum
           data[POST_LINE_NUM] =lineNum
           data[POST_IMAGE_URI] =imageUri
           data[POST_TEXT] =postText
           data[POST_MARGIN] =postMargin
           data[POST_BACKGROUND] =postBackground
           data[POST_TRANPARECY] =postTransparency
           data[POST_TEXT_SIZE] =postTextSize
           data[POST_PADDING] =postPadding
           data[POST_TEXT_COLOR] =postTextColor
           data[POST_FONT_FAMILY] =postFontFamily
           data[POST_RADIUS] =postRadiuas
        }
        FirebaseFirestore.getInstance().collection(POST_REF).add(data)*/

    /*fun convertToPost(snap: DocumentSnapshot?): Post {
        val postId = snap?.getString(POST_ID).toString()
        val postNum = snap?.getLong(POST_NUM)!!.toInt()
        val lineNum = snap?.getLong(POST_LINE_NUM)?.toInt()
        val imageUri = snap?.getString(POST_IMAGE_URI).toString()
        val postText:Array<String> = snap?.get(POST_TEXT) as Array<String>
        val postMargin:Array<Array<Int>> = snap?.get(POST_MARGIN) as Array<Array<Int>>
        val postBackground = snap?.getString(POST_BACKGROUND).toString()
        val postTranparency = snap?.getLong(POST_TRANPARECY)!!.toInt()
        val postTextSize:Array<Int> = snap?.getString(POST_TEXT_SIZE)  as Array<Int>
        val postPadding: Array<Int> = snap?.getString(POST_PADDING) as Array<Int>
        val postTextColor: Array<String> = snap?.get(POST_TEXT_COLOR) as Array<String>
        val postFontFamily= snap?.getLong(POST_FONT_FAMILY)!!.toInt()
        val postRadius= snap?.getLong(POST_RADIUS)!!.toInt()
        val newPost=Post(postId,postNum,lineNum!!,imageUri,postText,postMargin,postBackground,postTranparency,postTextSize,postPadding,postTextColor,postFontFamily,postRadius )
        return newPost
    }*/
   /* fun convertToPost1(snap: DocumentSnapshot?): Post1 {
        val postId = snap?.getString(POST_ID).toString()
        val postNum = snap?.getLong(POST_NUM)!!.toInt()
        val lineNum = snap?.getLong(POST_LINE_NUM)!!.toInt()
        val imageUri = snap?.getString(POST_IMAGE_URI).toString()
        val postText:ArrayList<String> = snap?.get(POST_TEXT) as ArrayList<String>
        val postMargin:ArrayList<String> = snap?.get(POST_MARGIN) as ArrayList<String>
        val postBackground = snap?.getString(POST_BACKGROUND).toString()
        val postTranparency = snap?.getLong(POST_TRANPARECY)!!.toInt()
        val postTextSize:ArrayList<Int> = snap?.getString(POST_TEXT_SIZE)  as ArrayList<Int>
        val postPadding: ArrayList<Int> = snap?.getString(POST_PADDING) as ArrayList<Int>
        val postTextColor: ArrayList<String> = snap?.get(POST_TEXT_COLOR) as ArrayList<String>
        val postFontFamily= snap?.getLong(POST_FONT_FAMILY)!!.toInt()
        val postRadius= snap?.getLong(POST_RADIUS)!!.toInt()
        val newPost=Post1(postId,postNum,lineNum,imageUri,postText,postMargin,postBackground,postTranparency,postTextSize,postPadding,postTextColor,postFontFamily,postRadius)
        return newPost
    }*/




    fun logi(
        element1: String,
        element2: String = "",
        element3: String = "",
        element4: String = ""
    ) {
        if (element1 != "" && element2 == "" && element3 == "" && element4 == "") {
            Log.d("gg", "${element1}")
        }
        if (element1 != "" && element2 != "" && element3 == "" && element4 == "") {
            Log.d("gg", "${element1} ,${element2}")
        }
        if (element1 != "" && element2 != "" && element3 != "" && element4 == "") {
            Log.d("gg", "${element1} ,${element2} ,${element3}")
        }
        if (element1 != "" && element2 != "" && element3 != "" && element4 != "") {
            Log.d("gg", "${element1} ,${element2} ${element3},${element4}")
        }
    }
}