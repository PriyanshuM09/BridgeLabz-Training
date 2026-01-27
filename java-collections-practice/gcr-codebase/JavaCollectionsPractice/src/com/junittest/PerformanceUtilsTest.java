package com.junittest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.PerformanceUtils;

public class PerformanceUtilsTest {
    PerformanceUtils utils = new PerformanceUtils();
    @Test
    @Timeout(2) 
    void testLongRunningTaskPerformance() {
        String result = utils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
