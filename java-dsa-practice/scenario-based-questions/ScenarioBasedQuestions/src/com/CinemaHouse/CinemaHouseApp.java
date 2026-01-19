package com.CinemaHouse;

class CinemaHouseApp {

    public static void main(String[] args) {

        int[] dailyShows = {1800, 1500, 2100, 1200, 1700};

        ShowSchedule schedule = new ShowSchedule(dailyShows);
        BubbleSorter sorter = new BubbleSorter();
        ScheduleDisplay display = new ScheduleDisplay();

        System.out.println("Before Sorting:");
        display.show(schedule.getShowTimes());

        sorter.sort(schedule.getShowTimes());

        System.out.println("After Sorting (Showtimes):");
        display.show(schedule.getShowTimes());
    }
}

