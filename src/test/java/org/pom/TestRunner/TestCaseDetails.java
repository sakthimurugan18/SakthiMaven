package org.pom.TestRunner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCaseDetails {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(JunitTest.class);

		System.out.println("Failure count :" + result.getFailureCount());
		System.out.println("IgnoreCount: " + result.getIgnoreCount());
		System.out.println("Testcase RunCount :" + result.getRunCount());
		System.out.println("Testcase Runtime :" + result.getRunTime());
		List<Failure> list = result.getFailures();
		for (Failure fail : list) {

			System.out.println(fail);

		}
	}

}
