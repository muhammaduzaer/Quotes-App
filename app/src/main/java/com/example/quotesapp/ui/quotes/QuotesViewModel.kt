package com.example.quotesapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotesapp.data.Quote
import com.example.quotesapp.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun getQuote () = quoteRepository.getQuote()

    fun addQuote (quote: Quote) = quoteRepository.addQuote(quote)
}