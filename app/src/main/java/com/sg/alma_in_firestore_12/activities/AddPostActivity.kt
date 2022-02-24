package com.sg.alma_in_firestore_12.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma12.Posts.general.*
import com.sg.alma_in_firestore_12.databinding.ActivityAddPostBinding
import com.sg.alma_in_firestore_12.details.Post1Lines
import com.sg.alma_in_firestore_12.utilities.Utility

class AddPostActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddPostBinding

    lateinit var post1Lines: Post1Lines
    lateinit var post2Lines: Post2Lines
    lateinit var post3Lines: Post3Lines
    lateinit var post4Lines: Post4Lines
    lateinit var post5Lines: Post5Lines
    lateinit var post6Lines: Post6Lines
    lateinit var post7Lines: Post7Lines
    lateinit var post8Lines: Post8Lines
    lateinit var post9Lines: Post9Lines

    val util = Utility()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        post1Lines = Post1Lines(this)
        post2Lines = Post2Lines(this)
        post3Lines = Post3Lines(this)
        post4Lines = Post4Lines(this)
        post5Lines = Post5Lines(this)
        post6Lines = Post6Lines(this)
        post7Lines = Post7Lines(this)
        post8Lines = Post8Lines(this)
        post9Lines = Post9Lines(this)


      //  post1Lines.upLoadPost(100)
       //  util.downloadPost(this,100)

    //   post2Lines.uploadPost(200)
      //  util.downloadPost(this,200)

   //post3Lines.uploadPost(306)
     //   util.downloadPost(this,306)

      //  post4Lines.uploadPost(400)
       // util.downloadPost(this,400)

          // post5Lines.uploadPost(500)
       // util.downloadPost(this,500)

      //post6Lines.uploadPost(600)
     //  util.downloadPost(this,600)

    // post7Lines.uploadPost(700)
    //util.downloadPost(this,700)

       //post8Lines.uploadPost(800)
       // util.downloadPost(this,800)

       // post9Lines.uploadPost(900)
      util.downloadPost(this,900)

    }
}
