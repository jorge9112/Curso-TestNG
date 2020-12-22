package com.company;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FAIL_ConfigurationAnnotation
{
    @BeforeClass
    public void setUp() {}

    @Test
    public void signIn() {}

    @Test
    public void userSearch() {}

    @Test
    public void userSignOut() {}

    @AfterClass
    public void tearDown() {}
}
