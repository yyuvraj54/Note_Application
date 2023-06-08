package com.example.noteapplication

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {

    @Query("Select * from notesTable order by id ASC")
    fun getAllNotes():LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     suspend fun insert(note:Note)

    @Update
      suspend fun update(note:Note)

    @Delete
      suspend  fun delete(note:Note)







}