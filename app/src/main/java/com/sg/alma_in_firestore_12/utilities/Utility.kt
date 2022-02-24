package com.sg.alma_in_firestore_12.utilities

import android.util.Log
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma_in_firestore_12.model.Post
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class Utility {

    fun retrivePostFromFirestore(snap: DocumentSnapshot?): Post {

        var newPost = Post()
        val postId = snap?.get(POST_ID).toString()
        val postNum = snap?.getLong(POST_NUM)!!.toInt()
        val lineNum = snap?.getLong(POST_LINE_NUM)!!.toInt()
        val imageUri = snap?.getString(POST_IMAGE_URI).toString()
        val postText: ArrayList<String> = snap?.get(POST_TEXT) as ArrayList<String>
        val postBackground = snap?.getString(POST_BACKGROUND).toString()
        val postTranparency = snap?.getLong(POST_TRANPARECY)!!.toInt()
        val postTextColor: ArrayList<String> = snap?.get(POST_TEXT_COLOR) as ArrayList<String>
        val postFontFamily = snap?.getLong(POST_FONT_FAMILY)!!.toInt()
        val postRadius = snap?.getLong(POST_RADIUS)!!.toInt()

        val postTextSize1 = snap?.getString(POST_TEXT_SIZE).toString()
        val postTextSize: ArrayList<Int> = convertFromStringArrayToIntArry(postTextSize1)
        val postPadding1 = snap?.getString(POST_PADDING).toString()
        val postPadding: ArrayList<Int> = convertFromStringArrayToIntArry(postPadding1)
        val postMargin1 = snap?.getString(POST_MARGIN).toString()
        val postMargin: ArrayList<ArrayList<Int>> = convertFromStringArrayToIntArry2(postMargin1)

        /* val postMargin = arrayListOf(
             arrayListOf(0, 0, 0, -1),
             arrayListOf(0, 100, 0, -1),
             arrayListOf(0, 200, 0, -1)
         )*/


        val newPost1 = Post(
            postId,
            postNum,
            lineNum,
            imageUri,
            postText,
            postMargin,
            postBackground,
            postTranparency,
            postTextSize,
            postPadding,
            postTextColor,
            postFontFamily,
            postRadius
        )
        //logi("Utility 207   post=${newPost1}")
        return newPost1
    }

    private fun convertFromStringArrayToIntArry(str: String): ArrayList<Int> {
        var newAr = ArrayList<Int>()
        return littleHelper(str, newAr)
    }

    private fun littleHelper(str: String, arr: ArrayList<Int>): ArrayList<Int> {
        val str = str.split(",")
        for (index in 0 until str.size) {
            arr.add(str[index].trim().toInt())
        }
        return arr
    }

    private fun convertFromStringArrayToIntArry2(str: String): ArrayList<ArrayList<Int>> {
        var newAr = ArrayList<ArrayList<Int>>()

        return littleHelperForMargin(str, newAr)
    }
    private fun littleHelperForMargin(
        str: String,
        bigArray: ArrayList<ArrayList<Int>>
    ): ArrayList<ArrayList<Int>> {
        val str1 = str.replace("]", "").replace("[", "")

        var arStr = str1.split(",")
        //  logi("Utilities 250 arStr=${arStr}")
        val ind=arStr.size.div(4)
        logi("Utility300  ind=${ind}")

        when (ind){
            1->helper10(arStr,bigArray)
            2->helper20(arStr,bigArray)
            3->helper30(arStr,bigArray)
            4->helper40(arStr,bigArray)
            5->helper50(arStr,bigArray)
            6->helper60(arStr,bigArray)
            7->helper70(arStr,bigArray)
            8->helper80(arStr,bigArray)
            9->helper90(arStr,bigArray)


        }







        return bigArray
    }

    private fun helper10(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar1 = arrayListOf<Int>()
        for (index in 0..3) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(0,ar1)
        }
        return bigArray
    }

    private fun helper20(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()

        for (index in 0..3) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(0,ar1)
        }
        for (index in 4..7) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(1,ar2)
        }
        return bigArray
    }

    private fun helper30(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()

        for (index in 0..3) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(0,ar1)
        }
        for (index in 4..7) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(1,ar2)
        }
        for (index in 8..11) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(2,ar3)
        }
        return bigArray
    }
    private fun helper40(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var a4 = arrayListOf<Int>()

        for (index in 0..3) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(0,ar1)
        }
        for (index in 4..7) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(1,ar2)
        }
        for (index in 8..11) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(2,ar3)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        return bigArray
    }

    private fun helper50(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar0 = arrayListOf<Int>()
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var ar4 = arrayListOf<Int>()

        for (index in 0..3) {
            ar0.add(arStr[index].trim().toInt())
            bigArray.add(0,ar0)
        }
        for (index in 4..7) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(1,ar1)
        }
        for (index in 8..11) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(2,ar2)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        for (index in 16..19) {
            ar4.add(arStr[index].trim().toInt())
            bigArray.add(4,ar4)
        }
        return bigArray
    }
    private fun helper60(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar0 = arrayListOf<Int>()
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var ar4 = arrayListOf<Int>()
        var ar5 = arrayListOf<Int>()


        for (index in 0..3) {
            ar0.add(arStr[index].trim().toInt())
            bigArray.add(0,ar0)
        }
        for (index in 4..7) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(1,ar1)
        }
        for (index in 8..11) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(2,ar2)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        for (index in 16..19) {
            ar4.add(arStr[index].trim().toInt())
            bigArray.add(4,ar4)
        }
        for (index in 20..23) {
            ar5.add(arStr[index].trim().toInt())
            bigArray.add(5,ar5)
        }
        return bigArray
    }
    private fun helper70(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar0 = arrayListOf<Int>()
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var ar4 = arrayListOf<Int>()
        var ar5 = arrayListOf<Int>()
        var ar6 = arrayListOf<Int>()

        for (index in 0..3) {
            ar0.add(arStr[index].trim().toInt())
            bigArray.add(0,ar0)
        }
        for (index in 4..7) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(1,ar1)
        }
        for (index in 8..11) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(2,ar2)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        for (index in 16..19) {
            ar4.add(arStr[index].trim().toInt())
            bigArray.add(4,ar4)
        }
        for (index in 20..23) {
            ar5.add(arStr[index].trim().toInt())
            bigArray.add(5,ar5)
        }
        for (index in 24..27) {
            ar6.add(arStr[index].trim().toInt())
            bigArray.add(6,ar6)
        }
        return bigArray
    }
    private fun helper80(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar0 = arrayListOf<Int>()
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var ar4 = arrayListOf<Int>()
        var ar5 = arrayListOf<Int>()
        var ar6 = arrayListOf<Int>()
        var ar7 = arrayListOf<Int>()

        for (index in 0..3) {
            ar0.add(arStr[index].trim().toInt())
            bigArray.add(0,ar0)
        }
        for (index in 4..7) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(1,ar1)
        }
        for (index in 8..11) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(2,ar2)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        for (index in 16..19) {
            ar4.add(arStr[index].trim().toInt())
            bigArray.add(4,ar4)
        }
        for (index in 20..23) {
            ar5.add(arStr[index].trim().toInt())
            bigArray.add(5,ar5)
        }
        for (index in 24..27) {
            ar6.add(arStr[index].trim().toInt())
            bigArray.add(6,ar6)
        }
        for (index in 28..31) {
            ar7.add(arStr[index].trim().toInt())
            bigArray.add(7,ar7)
        }
        return bigArray
    }
    private fun helper90(arStr: List<String>, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
        var ar0 = arrayListOf<Int>()
        var ar1 = arrayListOf<Int>()
        var ar2 = arrayListOf<Int>()
        var ar3 = arrayListOf<Int>()
        var ar4 = arrayListOf<Int>()
        var ar5 = arrayListOf<Int>()
        var ar6 = arrayListOf<Int>()
        var ar7 = arrayListOf<Int>()
        var ar8 = arrayListOf<Int>()

        for (index in 0..3) {
            ar0.add(arStr[index].trim().toInt())
            bigArray.add(0,ar0)
        }
        for (index in 4..7) {
            ar1.add(arStr[index].trim().toInt())
            bigArray.add(1,ar1)
        }
        for (index in 8..11) {
            ar2.add(arStr[index].trim().toInt())
            bigArray.add(2,ar2)
        }
        for (index in 12..15) {
            ar3.add(arStr[index].trim().toInt())
            bigArray.add(3,ar3)
        }
        for (index in 16..19) {
            ar4.add(arStr[index].trim().toInt())
            bigArray.add(4,ar4)
        }
        for (index in 20..23) {
            ar5.add(arStr[index].trim().toInt())
            bigArray.add(5,ar5)
        }
        for (index in 24..27) {
            ar6.add(arStr[index].trim().toInt())
            bigArray.add(6,ar6)
        }
        for (index in 28..31) {
            ar7.add(arStr[index].trim().toInt())
            bigArray.add(7,ar7)
        }
        for (index in 32..35) {
            ar8.add(arStr[index].trim().toInt())
            bigArray.add(8,ar8)
        }
        return bigArray
    }


    /* private fun littleHelper30(
         str: String,
         bigArray: ArrayList<ArrayList<Int>>
     ): ArrayList<ArrayList<Int>> {
         val str1 = str.replace("]", "").replace("[", "")

         var arStr = str1.split(",")
         //  logi("Utilities 250 arStr=${arStr}")
         var ar1 = arrayListOf<Int>()
         var ar2 = arrayListOf<Int>()
         var ar3 = arrayListOf<Int>()

         for (index in 0..3) {
             ar1.add(arStr[index].trim().toInt())
         }
         for (index in 4..7) {
             ar2.add(arStr[index].trim().toInt())
         }
         for (index in 8..11) {
             ar3.add(arStr[index].trim().toInt())
         }

         bigArray.add(ar1)
         bigArray.add(ar2)
         bigArray.add(ar3)

         return bigArray
     }*/









    /*   private fun littleHelper2(str: String, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
           val str1 = str.replace("]","").replace("[","")

           var arStr=str1.split(",")
           //  logi("Utilities 250 arStr=${arStr}")
           var ar= arrayListOf<Int>()
           var size=arStr.size

           if (size>1){
               for (index in 0..3){
                   ar.add(arStr[index].trim().toInt())
               }
               bigArray.add(ar)
               ar.clear()
           }
           if (size>4){
               for (index in 4..7){
                   ar.add(arStr[index].trim().toInt())
               }
               bigArray.add(ar)
               ar.clear()
           }
           if (size>8){
               for (index in 8..11){
                   ar.add(arStr[index].trim().toInt())
               }
               bigArray.add(ar)
               ar.clear()
           }

           return bigArray
       }*/


    /*   private fun littleHelper2(str: String, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
         val str1 = str.replace("]","").replace("[","")

           var arStr=str1.split(",")
         //  logi("Utilities 250 arStr=${arStr}")

           var ar= arrayListOf<Int>()
           for (index in 0..3){
               ar.add(arStr[index].trim().toInt())
           }

           bigArray.add(ar)
       //   logi("Utilities 260 ar1=${ar}  bigArray=$bigArray")
           ar.clear()

           for (index in 4..7){
               ar.add(arStr[index].trim().toInt())
           }
        //   logi("Utilities 260 ar2=${ar}")
           bigArray.add(ar)
           ar.clear()

           for (index in 8..11){
               ar.add(arStr[index].trim().toInt())
           }
           bigArray.add(ar)
        //   logi("Utilities 260 ar3=${ar}  bigArray=$bigArray")

           return bigArray
       }
 */



















    /* private fun littleHelper2(str: String, bigArray: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
         val str1 = str.replace("]","").replace("[","")

         var arStr=str1.split(",")
         //  logi("Utilities 250 arStr=${arStr}")

         val size=arStr.size

         if (size==12) {

             var ar = arrayListOf<Int>()
             for (index in 0..3) {
                 ar.add(arStr[index].trim().toInt())
             }

             bigArray.add(ar)
             //   logi("Utilities 260 ar1=${ar}  bigArray=$bigArray")
             ar.clear()

             for (index in 4..7) {
                 ar.add(arStr[index].trim().toInt())
             }
             //   logi("Utilities 260 ar2=${ar}")
             bigArray.add(ar)
             ar.clear()

             for (index in 8..11) {
                 ar.add(arStr[index].trim().toInt())
             }
             bigArray.add(ar)
             //   logi("Utilities 260 ar3=${ar}  bigArray=$bigArray")
         }

         return bigArray
     }*/


    /*   private fun getMarli(num: Int): ArrayList<Int> {
           var ttMarli = arrayListOf<Int>()
           val result = getTTMarli(num, ttMarli)
           return result
       }

       private fun getTTMarli(num: Int, ttMarli: java.util.ArrayList<Int>): java.util.ArrayList<Int> {
           ttMarli.add(7, 2)
           return ttMarli
       }*/

    fun getPostMargin(postNum: Int): ArrayList<ArrayList<Int>> {
        var marginArray: ArrayList<ArrayList<Int>> = arrayListOf<ArrayList<Int>>()

        /*  marginArray= arrayListOf(
              arrayListOf(0, 0 , 0, -1),
              arrayListOf(0, 100 , 0, -1 ),
              arrayListOf(0, 200 , 0, -1 ))*/

        var result = getMarginArray(postNum, marginArray)
        // logi("Utility 201   result=$result")

        return result
    }

    private fun getMarginArray(
        postNum: Int,
        marginArray: ArrayList<ArrayList<Int>>
    ): ArrayList<ArrayList<Int>> {

        /* var arr= arrayListOf<Int>(3,4,5)
        marginArray.add(0,arr)*/

        /*  marginArray = arrayListOf(
              arrayListOf(0, 0, 0, -1),
              arrayListOf(0, 100, 0, -1),
              arrayListOf(0, 200, 0, -1)
          )*/
        /*FirebaseFirestore.getInstance().collection(MARGIN_REF).document(postNum.toString())
                    .collection(MARGIN_GROUP).document(index.toString()).set(data)*/

        FirebaseFirestore.getInstance().collection(MARGIN_REF).document(postNum.toString())
            .collection(MARGIN_GROUP).addSnapshotListener { value, error ->
                var ar: ArrayList<Int> = arrayListOf()
                if (value != null) {
                    var index = 0
                    for (doc in value.documents) {
                        val arrSt = doc.getString(MARGIN_AR).toString()
                        ar = convertFromStringArrayToIntArry(arrSt)
                        /*  //  logi("Utilities 134 /n                       arrSt= $arrSt")
                             val stt= arrSt.split(",")
                              val stArr1=stt.toTypedArray()
                          //   logi("Utilities 134 /n                       stArr1= ${stArr1.joinToString()}")
                            ar=stArr1.map { it.trim().toInt() }.toTypedArray()
                            logi("Utilities 135 /n                       ar= ${ar.joinToString()}")*/
                        //  logi("Utilities 134 /n                       ar= ${ar.joinToString()}")

                        marginArray.add(ar)


                    }
                }

            }
        return marginArray
    }


    fun sendMargintoFirestore(
        postMargin: ArrayList<ArrayList<Int>>, di: Int, dd: Int, postNum: Int
    ) {
        var arrString = ""
        var data = HashMap<String, Any>()
        for (index in 0..postMargin.size - 1) {
            arrString = postMargin[index].joinToString()
            data.put(MARGIN_AR, arrString)
            //  logi("Utility 115                                         index=$index     arrString=$arrString")
            FirebaseFirestore.getInstance().collection(MARGIN_REF).document(postNum.toString())
                .collection(MARGIN_GROUP).document(index.toString()).set(data)
        }
    }

    /*    val left = doc.getString(MARGIN_LEFT).toString()
                        val up = doc.getString(MARGIN_UP).toString()
                        val right = doc.getString(MARGIN_RIGHT).toString()
                        val down = doc.getString(MARGIN_DOWN).toString()
                        val arr: ArrayList<Int> = arrayListOf(left.toInt(), up.toInt(), right.toInt(), down.toInt())

                        logi(" \n \n Utility 12  ====> index=$index       arr=${arr.joinToString()}")

                      // marginArray.add(index,arr)

                        index++*/

    fun sendPostToStringFirestore(post: Post) {
        val data = HashMap<String, Any>()
        with(post) {
            data[POST_ID] = 1
            data[POST_NUM] = postNum
            data[POST_LINE_NUM] = lineNum
            data[POST_IMAGE_URI] = imageUri
            data[POST_TEXT] = postText
            data[POST_MARGIN] = postMargin.joinToString()
            data[POST_BACKGROUND] = postBackground
            data[POST_TRANPARECY] = postTransparency
            data[POST_TEXT_SIZE] = postTextSize.joinToString()
            data[POST_PADDING] = postPadding.joinToString()
            data[POST_TEXT_COLOR] = postTextColor
            data[POST_FONT_FAMILY] = postFontFamily
            data[POST_RADIUS] = postRadiuas
        }
        FirebaseFirestore.getInstance().collection(POST_REF).document(post.postNum.toString())
            .set(data)
    }

    fun sendPostToFirestore(post: Post) {
        val data = HashMap<String, Any>()
        with(post) {
            data[POST_ID] = 1
            data[POST_NUM] = postNum
            data[POST_LINE_NUM] = lineNum
            data[POST_IMAGE_URI] = imageUri
            data[POST_TEXT] = postText
            //  data[POST_MARGIN] = postMargin
            data[POST_BACKGROUND] = postBackground
            data[POST_TRANPARECY] = postTransparency
            data[POST_TEXT_SIZE] = postTextSize
            data[POST_PADDING] = postPadding
            data[POST_TEXT_COLOR] = postTextColor
            data[POST_FONT_FAMILY] = postFontFamily
            data[POST_RADIUS] = postRadiuas
        }
        FirebaseFirestore.getInstance().collection(POST_REF).document(post.postNum.toString())
            .set(data)
    }


    /* private fun getPosi(postNum: Int): Array<ArrayList<Int>> {

     }*/


    /*  fun AddMargin(post: Post) :Post{
          val newPost=post
          val num=post.postNum
          var postMargin:Array<ArrayList<Int?>> = arrayOf<ArrayList<Int?>>()
          FirebaseFirestore.getInstance().collection(MARGIN_REF).document(num.toString()).collection(
              MARGIN_GROUP).addSnapshotListener { value, error ->
              if (value != null) {
                  var index=0
                  for (doc in value.documents){
                      //val postId = snap?.get(POST_ID).toString()
                      val left= doc.getLong(MARGIN_LEFT)?.toInt()
                      val up=doc.getLong(MARGIN_UP)?.toInt()
                      val right=doc.getLong(MARGIN_RIGHT)?.toInt()
                      val down=doc.getLong(MARGIN_DOWN)?.toInt()
                      val arr: ArrayList<Int?> = arrayListOf(left,up,right,down)
                      postMargin[index]=arr
                     index++
                  }
                  newPost.postMargin=postMargin
              }
          }
          return newPost
      }*/


    /*  fun convertToUser(snap: DocumentSnapshot?): User {
        var userName = "no userName"
        var fullName = "no fullName"
        var email: String = "no email"
        var profileImage =
            "https://firebasestorage.googleapis.com/v0/b/social55firestore.appspot.com/o/Default%20Images%2Fprofile.png?alt=media&token=4a02bf76-8cc4-43e7-9750-930176c9c9ee"
        var dio: String = "no dio"
        var uid: String = "no uid"
        userName = snap?.getString(USER_USERNAME).toString()
        fullName = snap?.getString(USER_FULLNAME).toString()
        email = snap?.getString(USER_EMAIL).toString()
        profileImage = snap?.getString(USER_IMAGE).toString()
        dio = snap?.getString(USER_BIO).toString()
        uid = snap?.getString(FIRESTORE_USER_ID).toString()

        val newUser = User(userName, fullName, email, profileImage, dio, uid)
        return newUser
    }*/

    /*  fun retrivePostFromFirestore(snap: DocumentSnapshot?): Post {
          //      logi("Utility 111==> \n \n snap= $snap")
          var newPost = Post()
          val postId = snap?.get(POST_ID).toString()
          val postNum = snap?.getLong(POST_NUM)!!.toInt()
          val lineNum = snap?.getLong(POST_LINE_NUM)!!.toInt()
          val imageUri = snap?.getString(POST_IMAGE_URI).toString()
          val postText: ArrayList<String> = snap?.get(POST_TEXT) as ArrayList<String>
          val postBackground = snap?.getString(POST_BACKGROUND).toString()
          val postTranparency = snap?.getLong(POST_TRANPARECY)!!.toInt()
          val postTextColor: ArrayList<String> = snap?.get(POST_TEXT_COLOR) as ArrayList<String>
          val postFontFamily = snap?.getLong(POST_FONT_FAMILY)!!.toInt()
          val postRadius = snap?.getLong(POST_RADIUS)!!.toInt()

          val postTextSize1 = snap?.getString(POST_TEXT_SIZE).toString()
          val postTextSize: ArrayList<Int> = convertFromStringArrayToIntArry(postTextSize1)
          val postPadding1 = snap?.getString(POST_PADDING).toString()
          val postPadding: ArrayList<Int> = convertFromStringArrayToIntArry(postPadding1)

          *//* logi("Utility 116==> \n postTextSize1= $postTextSize1")
         logi("Utility 117==> \n postTextSize[0]= ${postTextSize[0]}")
         logi("Utility 117==> \n postTextSize[1]= ${postTextSize[1]}")
         logi("Utility 117==> \n postTextSize[2]= ${postTextSize[2]}")*//*


        *//*   //   val postTextSize: ArrayList<Int> = snap?.get(POST_TEXT_SIZE) as ArrayList<Int>
             val postTextSize1: ArrayList<String> = snap?.get(POST_TEXT_SIZE) as ArrayList<String>
             val postTextSize: ArrayList<Int> = convertFromStringArrayToIntArry(postTextSize1)
             //val postPadding: ArrayList<Int> = snap?.get(POST_PADDING) as ArrayList<Int>
             val postPadding1: ArrayList<String> = snap?.get(POST_PADDING) as ArrayList<String>
          //   val postPadding: ArrayList<Int> = convertFromStringArrayToIntArry(postPadding1)


             val postMargin1: ArrayList<String> = snap?.get(POST_MARGIN) as ArrayList<String>
        //   val postMargin: ArrayList<Int> =convertFromStringArrayToIntArry(postMargin1)
  *//*

        val di = 0
        val dd = 0
        val postMarginOld = arrayOf(
            arrayListOf(0, 0 + di, 0, -1 + dd),
            arrayListOf(0, 100 + di, 0, -1 + dd),
            arrayListOf(0, 200 + di, 0, -1 + dd)
        )

        *//*     val postMargin1 = snap?.getString(POST_MARGIN).toString()
           val postMargin2: ArrayList<ArrayList<Int>> =convertFromStringArrayToIntArry11(postMargin1)*//*

        //   logi("Utility 117==> \n postMargin1= ${postMargin1}")

     *//*   val postMargin = getPostMargin(postNum)

        logi("Utility 217==> \n postMargin[0]= ${postMargin[0]}")
        logi("Utility 217==> \n postMargin[1]= ${postMargin[1]}")
        logi("Utility 217==> \n postMargin[2]= ${postMargin[2]}")*//*


        val newPost1 = Post(
            postId,
            postNum,
            lineNum,
            imageUri,
            postText,
            postMarginOld,
            postBackground,
            postTranparency,
            postTextSize,
            postPadding,
            postTextColor,
            postFontFamily,
            postRadius
        )

        //  logi("Utility 115 /n newPost1=$newPost")
        return newPost1
    }*/


    /*private fun convertToArrayList(postTextSize1: String): ArrayList<Int> {
        var arr: ArrayList<Int> = arrayListOf()
        val str = postTextSize1.split(",")


        //  arr= arrayListOf(str[0].trim().toInt(),str[1].trim().toInt(),str[0].trim().toInt())
        *//*   logi("Utility 217==> \n str[0]= ${str[0]}")
           logi("Utility 217==> \n str[1]= ${str[1]}")
           logi("Utility 217==> \n str[2]= ${str[2]}")*//*

        for (index in 0 until str.size) {
            arr.add(str[index].trim().toInt())
        }

    }*/
    /* private fun convertFromStringArrayToIntArry11(str: String): ArrayList<ArrayList<Int>> {
       //  logi("Utility 317==> \n str= ${str}")
         var newAr = ArrayList<ArrayList<Int>>()
         return littleHelper11(str, newAr)
     }*/

    /*  private fun littleHelper11(str: String, newAr: ArrayList<ArrayList<Int>>):ArrayList<ArrayList<Int>> {
          val str = str.split(",")
          for (index in 0 until str.size) {
            //  logi("Utility 30 /n index=$index   str[index]=${str[index]}")
             // newAr.add(str[index].trim()))
          }
          return newAr
      }*/


    /* private fun getPostMargin(postNum: Int): Array<ArrayList<Int>> {

         var postMa: Array<ArrayList<Int>> = arrayOf<ArrayList<Int>>()

         FirebaseFirestore.getInstance().collection(MARGIN_REF).document(postNum.toString())
             .collection(
                 MARGIN_GROUP
             ).addSnapshotListener { value, error ->
                 if (value != null) {
                     var index = 0
                     for (doc in value.documents) {
                         *//* val left= 5
                         val up=6
                         val right=7
                         val down=8*//*
                        val left = doc.getString(MARGIN_LEFT).toString()
                        val up = doc.getString(MARGIN_UP).toString()
                        val right = doc.getString(MARGIN_RIGHT).toString()
                        val down = doc.getString(MARGIN_DOWN).toString()
                        val arr: ArrayList<String> = arrayListOf(left, up, right, down)
                   //     val arrMa= arrayListOf(left, up, right, down)
                    //    postMa=Array(index){arr}
                        logi(" \n \n Utility 12  ====> index=$index       arr=${arr.joinToString()}"   )



                        //  logi(" \n \n Utility 12  ====> index=$index       arr=${arr.joinToString()}")

                     *//*  if (index==0) {
                           postMa= Array(index){arr}
                          logi(" \n \n Utility 12  ====> index=$index       arr=${arr.joinToString()}")
                        // postMa.set(index, arr)
                       }*//*

                      // postMa.get(index).set(0, left)
                   *//*     postMa.get(index).set(1, up)
                        postMa.get(index).set(2, right)
                        postMa.get(index).set(3, down)*//*

                        index++
                    }

                }
            }


        return postMa
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

    /* private fun deleteAllCollection(ref: CollectionReference) {
         ref.addSnapshotListener { value, error ->
             if (value != null) {
                 for (doc in value.documents){
                     doc.reference.delete()
                 }
             }
         }
     }*/
}
