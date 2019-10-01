package com.sunbird.powermock;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MathUtil.class})
public class CaculatorTest {

    @Test
    public void getSum() throws Exception {
        Caculator caculator = new Caculator();

        PowerMockito.mockStatic(MathUtil.class);
        PowerMockito.when(MathUtil.class, "sum", anyInt(), anyInt()).thenReturn(3);
        assertEquals(3, caculator.getSum(1, 1));
    }
}