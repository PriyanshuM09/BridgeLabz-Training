package com.BrowserBuddy;

class PageNode {
    String pageUrl;
    PageNode previousPage, nextPage;

    public PageNode(String pageUrl) {
        this.pageUrl = pageUrl;
        this.previousPage = null;
        this.nextPage = null;
    }
}
