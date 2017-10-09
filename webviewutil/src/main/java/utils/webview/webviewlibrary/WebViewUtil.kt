package utils.webview.webviewlibrary

import android.webkit.WebSettings
import android.webkit.WebView

/****
 *
 *@author TEANG SUNRY on 10/9/2017.
 *
 */

fun WebView.onSetUpWebView() {
    val mWebSettings = this.settings
    mWebSettings.javaScriptEnabled = true
    this.settings.setRenderPriority(WebSettings.RenderPriority.HIGH)
    this.settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
    this.settings.setAppCacheEnabled(true)
    mWebSettings.domStorageEnabled = true
    mWebSettings.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS
    mWebSettings.useWideViewPort = true
    mWebSettings.loadWithOverviewMode = true

    this.setOnLongClickListener { v -> true }
    this.isLongClickable = false
}