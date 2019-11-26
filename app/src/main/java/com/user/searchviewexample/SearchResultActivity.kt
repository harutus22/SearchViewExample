package com.user.searchviewexample

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SearchResultActivity : AppCompatActivity() {

    private lateinit var mTextViewSearchResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_result)
        mTextViewSearchResult = findViewById(R.id.textViewSearchResult)
        if (Intent.ACTION_SEARCH == intent.action){
            handleSearch(intent.getStringExtra(SearchManager.QUERY))
        }
    }

    private fun handleSearch(searchQuery: String){
        mTextViewSearchResult.text = searchQuery
    }
}
