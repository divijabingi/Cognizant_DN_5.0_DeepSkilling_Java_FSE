package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class Exercise2Test {

    @Test
    public void testVerifyMethodCall() {

        ExternalApi api = mock(ExternalApi.class);

        api.getData();

        verify(api).getData();
    }
}