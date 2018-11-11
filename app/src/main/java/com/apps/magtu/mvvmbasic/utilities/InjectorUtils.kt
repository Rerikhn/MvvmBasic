package com.apps.magtu.mvvmbasic.utilities

import com.apps.magtu.mvvmbasic.data.FakeDataBase
import com.apps.magtu.mvvmbasic.data.QuoteRepository
import com.apps.magtu.mvvmbasic.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDataBase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}