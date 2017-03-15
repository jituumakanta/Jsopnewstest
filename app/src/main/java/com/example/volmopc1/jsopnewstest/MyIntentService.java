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
            //news0();
            //news2();
            //news3();
            //news4();
            news5();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void news0() throws IOException {

        Document doc = Jsoup.connect("http://www.cricbuzz.com/cricket-news/latest-news").get();
        // Element content = doc.getElementById("page-wrapper");
        Elements content = doc.getElementsByClass("cb-col cb-col-100 cb-lst-itm cb-lst-itm-lg");

        //Elements contentr = doc.getElementsByClass("cb-nws-intr");

        for (Element link : content) {

            Elements contentt = link.getElementsByClass("cb-col cb-col-33");
            for (Element linkss : contentt) {
                Elements lin = linkss.getElementsByTag("a");
                String linkHref = lin.attr("href");
                System.out.println(linkHref);

                Elements lin2 = linkss.getElementsByTag("img");
                String linkHref2 = lin2.attr("src");
                System.out.println(linkHref2);
            }
            // System.out.println(contentt);

            Elements contentt5 = link.getElementsByClass("cb-nws-hdln-ancr text-hvr-underline");
            String linkText = contentt5.text();
            System.out.println(linkText);

        }


    }

   /* public void news1()throws IOException {

            Document doc = Jsoup.connect("http://www.cricbuzz.com/cricket-news/latest-news").get();
            // Element content = doc.getElementById("page-wrapper");
            Elements content = doc.getElementsByClass("cb-col cb-col-33");

            Elements contentr = doc.getElementsByClass("cb-nws-intr");

            for (Element link : content) {
                Elements contentt = link.getElementsByTag("a");
                Elements contenttt = link.getElementsByTag("img");


                String linkHref = contentt.attr("href");
                System.out.println(linkHref);

                String linkHreff = contenttt.attr("src");
                System.out.println(linkHreff);
                String linkHreffd = contenttt.attr("title");
                System.out.println(linkHreffd);

            }
            for (Element linkg : contentr) {
                String linkText = linkg.text();
                System.out.println(linkText);
            }

    }*/

    public void news2() throws IOException {
        Document doc = Jsoup.connect("http://indianexpress.com/section/entertainment/bollywood/").get();
        Elements content = doc.getElementsByClass("articles");
        for (Element link : content) {
            Elements contentt = link.getElementsByClass("snaps");
            for (Element linkss : contentt) {
                Elements lin = linkss.getElementsByTag("a");
                String linkHref = lin.attr("href");
                System.out.println(linkHref);

                Elements lin2 = linkss.getElementsByTag("img");
                String linkHref2 = lin2.attr("src");
                System.out.println(linkHref2);
            }
            // System.out.println(contentt);

            Elements contentt5 = link.getElementsByClass("title");
            String linkText = contentt5.text();
            System.out.println(linkText);

        }

    }


    public void news3() throws IOException {
        Document doc = Jsoup.connect("http://www.rajnikantvscidjokes.in/").get();
        Element content = doc.getElementById("inner-wrap");
        Elements links = content.getElementsByClass("thumb-wrap");

        for (Element link : links) {
            Element linkk = link.select("a").get(0);
            String linkHreff = linkk.attr("href");
            System.out.println(linkHreff);

            Element linkkk = link.select("img").get(0);
            String linkHrefff = linkkk.attr("src");
            System.out.println(linkHrefff);

            Element linkkkk = link.select("img").get(0);
            String linkHreffff = linkkkk.attr("title");
            System.out.println(linkHreffff);


        }
    }


    public void news4() throws IOException {
        Document doc = Jsoup.connect("http://indianexpress.com/section/sports/cricket/").get();
        Elements content = doc.getElementsByClass("articles");
        for (Element link : content) {
            Elements contentt = link.getElementsByClass("snaps");
            for (Element linkss : contentt) {
                Elements lin = linkss.getElementsByTag("a");
                String linkHref = lin.attr("href");
                System.out.println(linkHref);

                Elements lin2 = linkss.getElementsByTag("img");
                String linkHref2 = lin2.attr("src");
                System.out.println(linkHref2);
            }
            // System.out.println(contentt);

            Elements contentt5 = link.getElementsByClass("title");
            String linkText = contentt5.text();
            System.out.println(linkText);

        }

    }

    public void news5() throws IOException {
        Document doc = Jsoup.connect("http://www.deccanchronicle.com/entertainment/bollywood").get();
        Elements content = doc.getElementsByClass("col-sm-12 SunChNewListing");
        for (Element link : content) {

            Elements contentt = link.getElementsByClass("col-sm-4 ThumbImg");

            for (Element linkss : contentt) {
                Elements lin = linkss.getElementsByTag("a");
                String linkHref ="http://www.deccanchronicle.com"+lin.attr("href");
                System.out.println(linkHref);

                Elements lin2 = linkss.getElementsByTag("img");
                String linkHref2 =lin2.attr("data-src");
                System.out.println(linkHref2);
            }

            Elements contentt5 = link.getElementsByClass("SunChroListH3");
            String linkText = contentt5.text();
            System.out.println(linkText);

        }

    }


}
