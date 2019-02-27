package com.github.mauricioaniche.ck.metric;

import com.github.mauricioaniche.ck.CKNumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class MethodsDetailsTest extends BaseTest{

	private static Map<String, CKNumber> report;

	@BeforeClass
	public static void setUp() {
		report = run(fixturesDir() + "/details-methods");
	}

	@Test
	public void lineNumber() {
		CKNumber a = report.get("methods2.A1");
		Assert.assertEquals(6, a.getMethod("a/0").get().getLoc());
		Assert.assertEquals(2, a.getMethod("b/0").get().getLoc());
	}

	@Test
	public void parameterQty() {
		CKNumber a = report.get("methods2.A1");
		Assert.assertEquals(3, a.getMethod("c/3[int,int,methods2.A]").get().getParametersQty());
		Assert.assertEquals(0, a.getMethod("a/0").get().getParametersQty());
	}

	@Test
	public void variableQty() {
		CKNumber a = report.get("methods2.A1");
		Assert.assertEquals(5, a.getMethod("a/0").get().getVariablesQty());
		Assert.assertEquals(1, a.getMethod("c/3[int,int,methods2.A]").get().getVariablesQty());
		Assert.assertEquals(0, a.getMethod("b/0").get().getVariablesQty());
	}

	@Test
	public void returnQty() {
		CKNumber a = report.get("methods2.A1");
		Assert.assertEquals(0, a.getMethod("c/3[int,int,methods2.A]").get().getReturnQty());
		Assert.assertEquals(0, a.getMethod("a/0").get().getReturnQty());
		Assert.assertEquals(3, a.getMethod("d/0").get().getReturnQty());
		Assert.assertEquals(1, a.getMethod("e/0").get().getReturnQty());
	}
}
