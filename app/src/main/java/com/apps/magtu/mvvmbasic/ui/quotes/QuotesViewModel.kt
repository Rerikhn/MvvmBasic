package com.apps.magtu.mvvmbasic.ui.quotes

import androidx.lifecycle.ViewModel
import com.apps.magtu.mvvmbasic.data.Quote
import com.apps.magtu.mvvmbasic.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) :ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)
}