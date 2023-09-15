package com.stepDefination;

import com.cucumber.utils.HelperUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	@Before

	public void before() {

		HelperUtils.setDriver();

	}

	@After

	public void after() {

		HelperUtils.tearDown();

	}

}
