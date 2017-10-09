package utils.webview.webviewutils

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import utils.webview.webviewlibrary.onSetUpWebView

/****
 *
 *@author TEANG SUNRY on 10/9/2017.
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wvGoogle.onSetUpWebView()
        wvGoogle.loadUrl("https://stackoverflow.com")

    }

}