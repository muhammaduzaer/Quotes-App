package com.example.quotesapp.utils

import com.example.quotesapp.data.QuoteRepository
import com.example.quotesapp.data.TempDatabase
import com.example.quotesapp.ui.quotes.QuotesViewModel
import com.example.quotesapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(TempDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)


    }
}