package com.pawan.sage.onlinedictionary.dictionary_details.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pawan.sage.onlinedictionary.dictionary_details.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)

abstract class WordDetailDatabase: RoomDatabase() {
    abstract val dao: WordInfoDao
}