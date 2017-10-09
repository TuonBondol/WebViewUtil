# WebViewUtil
This library using for custom function of set up WebView in Android App

## Installing

We can install this library by using gradle

Step 1

```
allprojects {
	repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2

```
dependencies {
	        compile 'com.github.BondolTuon:WebViewUtil:1.0.1'
	}
```

## Sample Using

```
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wvGoogle.onSetUpWebView()
        wvGoogle.loadUrl("https://stackoverflow.com")

    }
}

```

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="utils.webview.webviewutils.MainActivity">

    <WebView
        android:id="@+id/wvGoogle"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</android.support.constraint.ConstraintLayout>

```

## Min SDK Version

```
Support Min Sdk version >= 14

```

## Authors

* **Bondol Tuon** - [Bondol Tuon](https://github.com/BondolTuon)

See also the list of [contributors](https://github.com/BondolTuon/WebViewUtil/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/BondolTuon/WebViewUtil/blob/master/README.md) file for details
