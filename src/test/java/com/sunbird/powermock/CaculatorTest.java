package com.sunbird.powermock;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MathUtil.class})
public class CaculatorTest {

    @Test
    public void getSum() throws Exception {
        Caculator caculator = new Caculator();
        PowerMockito.spy(MathUtil.class);
        //PowerMockito.when(MathUtil.class, "sum", anyInt(), anyInt()).thenReturn(2);
        int result = caculator.getSum(1, 1);
        assertEquals(2, result);
        PowerMockito.verifyStatic(MathUtil.class, Mockito.times(1));
        MathUtil.sum(Mockito.any(), Mockito.any());

        PowerMockito.verifyStatic(MathUtil.class, Mockito.never());
        MathUtil.sub(Mockito.any());
    }
}