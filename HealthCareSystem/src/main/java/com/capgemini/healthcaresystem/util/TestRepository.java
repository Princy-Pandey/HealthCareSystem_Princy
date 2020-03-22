package com.capgemini.healthcaresystem.util;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.healthcaresystem.dto.TestDto;


public class TestRepository 
{
	public static List<TestDto> testCollectionObject=new CopyOnWriteArrayList<TestDto>();
	
	static {
		testCollectionObject.add(new TestDto("1111","Blood"));
		  testCollectionObject.add(new TestDto("2222","X-Ray"));
		  testCollectionObject.add(new TestDto("3333","MRI"));
		  testCollectionObject.add(new TestDto("4444","ECG"));
	}
	
	  public static List<TestDto> getTestCollectionObject() {
		return testCollectionObject;
	}
	public static void setTestCollectionObject(List<TestDto> testCollectionObject) {
		TestRepository.testCollectionObject = testCollectionObject;
	}
	
}
