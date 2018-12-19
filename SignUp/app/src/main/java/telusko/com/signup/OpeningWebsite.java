package telusko.com.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OpeningWebsite extends AppCompatActivity {

    WebView ourBrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_website);

        ourBrow = (WebView) findViewById(R.id.webView);
        ourBrow.setWebViewClient(new MyBrowser());
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.loadUrl("http://www.telusko.com");
    }

    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
