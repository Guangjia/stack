package me.tylerbwong.stack.ui.settings

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Experimental @Inject constructor(private val context: Context) {

    private val preferences: SharedPreferences
        get() = context.getSharedPreferences(EXPERIMENTAL_SHARED_PREFS, Context.MODE_PRIVATE)

    var syntaxHighlightingEnabled: Boolean
        get() = preferences.getBoolean(MARKDOWN_SYNTAX_HIGHLIGHT, false)
        set(value) = preferences.edit().putBoolean(MARKDOWN_SYNTAX_HIGHLIGHT, value).apply()

    companion object {
        private const val EXPERIMENTAL_SHARED_PREFS = "markdown_shared_prefs"
        private const val MARKDOWN_SYNTAX_HIGHLIGHT = "markdown_syntax_highlight"
    }
}