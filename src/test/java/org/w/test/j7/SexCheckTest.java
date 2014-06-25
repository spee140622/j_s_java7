package org.w.test.j7;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class SexCheckTest {

    @Test
    public void testGetSex() throws Exception {
        String sex = "female";
        SexCheck sexCheck = new SexCheck();
        Assert.assertEquals("女士", sexCheck.getSex(sex));

        sex = "male";
        Assert.assertEquals("先生", sexCheck.getSex(sex));
    }
}