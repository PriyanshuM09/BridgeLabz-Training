package com.CinemaHouse;

class BubbleSorter {

    public void sort(int[] times) {

        int n = times.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (times[j] > times[j + 1]) {
                    int temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                }
            }
        }
    }
}
