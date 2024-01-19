package com.norm.myroomdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_table_data")
data class NameEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String

)