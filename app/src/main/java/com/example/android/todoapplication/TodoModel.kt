package com.example.android.todoapplication

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class TodoModel (
    var title:String,
    var description:String,
    var category: String,
    var date: Long,
    var time: Long,
    var ttime: Long,
    var isFinished: Int = 0,
    @PrimaryKey(autoGenerate = true)
    var id: Long=0//No need to use id at the start of arg declaration

)