package com.BrowserBuddy;

public class BrowserBuddyApp {
    public static void main(String[] args) {

        BrowserTabManager myBrowser = new BrowserTabManager("google.com");

        myBrowser.openNewPage("youtube.com");
        myBrowser.openNewPage("github.com");

        myBrowser.goBack();
        myBrowser.goBack();
        myBrowser.goForward();

        myBrowser.closeCurrentTab();
        myBrowser.reopenLastClosedTab();
    }
}

