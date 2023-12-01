package com.github.mauricioaniche.ck.metric;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.mauricioaniche.ck.CK;
import com.github.mauricioaniche.ck.CKNumber;
import com.github.mauricioaniche.ck.CKReport;

public class WMCTest extends BaseTest {

	private static CKReport report;
	
	@BeforeClass
	public static void setUp() {
		report = new CK().calculate(fixturesDir() + "/wmc");
	}

	@Test
	public void countAllBranchInstructions() {
		CKNumber a = report.getByClassName("wmc.CC1");
		Assert.assertEquals(4, a.getWMC());
		CKNumber b = report.getByClassName("wmc.CC2");
		Assert.assertEquals(5, b.getWMC());
		CKNumber c = report.getByClassName("wmc.CC3");
		Assert.assertEquals(4, c.getWMC());
		CKNumber d = report.getByClassName("wmc.CC4");
		Assert.assertEquals(2, d.getWMC());
	}
}
