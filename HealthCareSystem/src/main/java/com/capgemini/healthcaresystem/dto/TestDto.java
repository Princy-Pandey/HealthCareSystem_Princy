package com.capgemini.healthcaresystem.dto;


public class TestDto
{
	private String testId;
	private String testName;
	
	public TestDto()
	{}
	
	public TestDto(String testId, String testName)
	{
		this.testId = testId;
		this.testName = testName;
	}

	public String getTestName() 
	{
		return testName;
	}
	public void setTestName(String testName) 
	{
		this.testName = testName;
	}

	public String getTestId() 
	{
		return testId;
	}

	public void setTestId(String testId) 
	{
		this.testId = testId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
