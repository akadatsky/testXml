package com.rocketshield.testparser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGoClick(View view) {
        Log.i("test_tag", "start");
        String data = DataSource.getData();
        data = data.replaceAll("&","&amp;");
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(data));

            while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlPullParser.START_TAG && parser.getName().equals("input")) {
                    Log.i("test_tag", "AttributeCount:" + parser.getAttributeCount());
                    Log.i("test_tag", "type:" + parser.getAttributeValue(null, "type"));
                    Log.i("test_tag", "name:" + parser.getAttributeValue(null, "name"));
                    Log.i("test_tag", "value:" + parser.getAttributeValue(null, "value"));
                    Log.i("test_tag", "autocomplete:" + parser.getAttributeValue(null, "autocomplete"));
                }
                parser.next();
            }
            Log.i("test_tag", "finish");
        } catch (XmlPullParserException | IOException e) {
            e.printStackTrace();
        }

    }
}
