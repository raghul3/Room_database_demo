package com.roomdatabase

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Employee-table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)

    val id:Int=0,
    val name:String="",
    @ColumnInfo(name = "email-id")
    val email: String=""



)
