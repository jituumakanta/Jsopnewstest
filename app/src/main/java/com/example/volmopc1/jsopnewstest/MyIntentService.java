package com.example.volmopc1.jsopnewstest;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
           // Element content = doc.getElementById("page-wrapper");
            Elements content = doc.getElementsByClass("cb-col cb-col-33");
            Elements contentr = doc.getElementsByClass("cb-nws-intr");

            for (Element link : content) {
                Elements contentt =link.getElementsByTag("a");
                Elements contenttt =link.getElementsByTag("img");


                String linkHref = contentt.attr("href");
                System.out.println(linkHref);

                String linkHreff = contenttt.attr("src");
                System.out.println(linkHreff);
                String linkHreffd = contenttt.attr("title");
                System.out.println(linkHreffd);

            }
            for(Element linkg : contentr){
                String linkText = linkg.text();
                System.out.println(linkText);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
