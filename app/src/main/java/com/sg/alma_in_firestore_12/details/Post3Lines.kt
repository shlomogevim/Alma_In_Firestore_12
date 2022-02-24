package com.sg.alma12.Posts.general

import android.app.Activity
import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.firebase.firestore.FirebaseFirestore
import com.sg.alma_in_firestore_12.R
import com.sg.alma_in_firestore_12.details.CreatePost
import com.sg.alma_in_firestore_12.model.Post
import com.sg.alma_in_firestore_12.utilities.*

class Post3Lines(val context: Context) {

    private val layout: ConstraintLayout = (context as Activity).findViewById(R.id.mainLayout)
    private val createPost = CreatePost(context, layout)
    private val util= Utility()


     fun downloadPost306(index:Int) {
         FirebaseFirestore.getInstance().collection(POST_REF).document(index.toString()).get()
             .addOnCompleteListener { task->
                 if (task.isSuccessful){
                val post=util.retrivePostFromFirestore(task.result)

                      createPost.drawPost(post)
                 }
             }


     }
    fun uploadPost306() {
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
              postMargin = arrayListOf(
                  arrayListOf(0,0+di,0,-1+dd),
                  arrayListOf(0,90+di, 0, -1+dd),
                  arrayListOf(0,135+di, 0,-1+dd)
              )
           //  util.sendMargintoFirestore(postMargin,di,dd,postNum)
              postBackground ="a3842c"
              postTransparency =7
              val size1=25
              val size2=0
              postTextSize =  arrayListOf(0, size1,size2)
              postPadding =  arrayListOf(10, 0,10,0)
              postTextColor = arrayListOf(CONSTANT, "ffffff")
              postFontFamily =4
              postRadiuas = 15
          }

        createPost.drawPost(post)
    //  util.sendPostToFirestore(post)
      util.sendPostToStringFirestore(post)
      }


    }
    /*fun findUser(id: String): User {
        var user = User()
        FirebaseFirestore.getInstance().collection(USER_REF).document(id).get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    user = convertToUser(task.result)
                }
            }
        return user
    }*/



/*  fun post306() {
        /*  val imageUri1 ="https://cdn.pixabay.com/photo/2021/01/08/17/02/old-man-5900410_1280.jpg"
          image.load(imageUri1)*/

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
              postMargin = arrayOf(
                  arrayOf(0,0+di,0,-1+dd),
                  arrayOf(0,90+di, 0, -1+dd),
                  arrayOf(0,135+di, 0,-1+dd)
              )
              util.sendMargintoFirestore(postMargin,di,dd,postNum)
              postBackground ="a3842c"
              postTransparency =7
              val size1=25
              val size2=0
              postTextSize =  arrayListOf(0, size1,size2)
              postPadding =  arrayListOf(10, 0,10,0)
              postTextColor = arrayListOf(CONSTANT, "ffffff")
              postFontFamily =4
              postRadiuas = 15
          }
        createPost.createPost(post)
         util.sendPostToFirestore(post)

      }
}*/

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
       createPost.createPost(post)

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


