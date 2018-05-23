package com.hjc.demo;

public class DemoServiceImp implements DemoService {

	public DemoBean getDemoBeanEntity(String code, String msg) {
		DemoBean bean = new DemoBean();
		bean.setCode(Integer.parseInt(code));
		bean.setMsg(msg);
		return bean;
	}

	public void doSomething() {

		System.out.println("'doSomething()' method is called from client");
	}

}
