package com.EduResults;

public class EduResultsApp {

    public static void main(String[] args) {

        int[] districtMarks = {78, 85, 92, 60, 70, 85, 90};

        DistrictResults results = new DistrictResults(districtMarks);
        MergeSorter sorter = new MergeSorter();
        RankDisplay display = new RankDisplay();

        System.out.println("Before Merging & Sorting:");
        display.show(results.getMarks());

        sorter.sort(results.getMarks(), 0, results.getMarks().length - 1);

        System.out.println("Final State-wise Rank List:");
        display.show(results.getMarks());
    }
}
