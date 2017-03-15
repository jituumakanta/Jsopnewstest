package com.example.volmopc1.jsopnewstest;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");



    }


    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Document doc = Jsoup.connect("http://www.cricbuzz.com/cricket-news/latest-news").get();
            Element content = doc.getElementById("content");
            System.out.println(content);
            System.out.println("ffff");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
