package com.stepfinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void before() throws FileNotFoundException, IOException {
		browserLaunch();
		maximizewindow();
		launchtheappln(getPropertyValue("url"));
		implicitWait();
	}

	@After
	public void after() {
		closeCurrent();
	}
}
