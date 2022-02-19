package com.sg.alma_in_firestore_12.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sg.alma12.Posts.general.Post3Lines
import com.sg.alma_in_firestore_12.R
import com.sg.alma_in_firestore_12.databinding.ActivityAddPostBinding
import com.sg.alma_in_firestore_12.utilities.Utility

class AddPostActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddPostBinding

    lateinit var post3Lines: Post3Lines

    val util = Utility()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        post3Lines = Post3Lines(this)

        post3Lines.post306()
    }
}
