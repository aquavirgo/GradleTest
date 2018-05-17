package com.example.myfirstlibrary;

import com.google.gson.Gson;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class IcndbJokeTest {
    private String jsonText = "test";

    @Test
    public void testGetJoke() throws Exception {
        Gson gson = new Gson();
        IcndbJoke icndbJoke = gson.fromJson(jsonText,IcndbJoke.class);
        String correct = "test";

        assertNotNull(icndbJoke);
        assertEquals(correct, icndbJoke.getJoke());
    }

}
