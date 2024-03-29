package com.github.ymaniz09.mvvmbasics.ui.quotes

import androidx.lifecycle.ViewModel
import com.github.ymaniz09.mvvmbasics.data.Quote
import com.github.ymaniz09.mvvmbasics.data.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}