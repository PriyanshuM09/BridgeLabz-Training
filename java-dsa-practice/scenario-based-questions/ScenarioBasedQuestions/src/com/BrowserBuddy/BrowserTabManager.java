package com.BrowserBuddy;

import java.util.Stack;

class BrowserTabManager {
    private PageNode currentPage;
    private Stack<String> recentlyClosedTabs;

    public BrowserTabManager(String homePage) {
        currentPage = new PageNode(homePage);
        recentlyClosedTabs = new Stack<>();
        System.out.println("Home page opened: " + homePage);
    }

    // Open a new website
    public void openNewPage(String websiteUrl) {
        PageNode newPage = new PageNode(websiteUrl);
        currentPage.nextPage = newPage;
        newPage.previousPage = currentPage;
        currentPage = newPage;

        System.out.println("Visited: " + websiteUrl);
    }

    // Go to previous page
    public void goBack() {
        if (currentPage.previousPage != null) {
            currentPage = currentPage.previousPage;
            System.out.println("Back to: " + currentPage.pageUrl);
        } else {
            System.out.println("No previous page available.");
        }
    }

    // Go to next page
    public void goForward() {
        if (currentPage.nextPage != null) {
            currentPage = currentPage.nextPage;
            System.out.println("Forward to: " + currentPage.pageUrl);
        } else {
            System.out.println("No next page available.");
        }
    }

    // Close current tab
    public void closeCurrentTab() {
        recentlyClosedTabs.push(currentPage.pageUrl);
        System.out.println("Tab closed: " + currentPage.pageUrl);
    }

    // Reopen last closed tab
    public void reopenLastClosedTab() {
        if (!recentlyClosedTabs.isEmpty()) {
            String restoredPage = recentlyClosedTabs.pop();
            openNewPage(restoredPage);
            System.out.println("Reopened tab: " + restoredPage);
        } else {
            System.out.println("No closed tabs to reopen.");
        }
    }
}

