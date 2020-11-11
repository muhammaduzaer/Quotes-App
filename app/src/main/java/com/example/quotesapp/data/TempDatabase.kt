package com.example.quotesapp.data

class TempDatabase private constructor(){

    var quoteDao = TempQuoteDao()
        private set

    companion object {
        @Volatile private var instance: TempDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: TempDatabase().also { instance = it }
        }
    }

}