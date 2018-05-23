package com.hjc.test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import com.hjc.demo.DemoBean;

public class JsonRpcTest {
	public JsonRpcTest() {
	}

	public static void main(String[] args) throws Throwable {
		try {
			JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://127.0.0.1:8400/"));

			// add info to the request header
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("Rpc-Type", "shop");
			client.setHeaders(headers);

			// call "doSomething" server method
			client.invoke("doSomething", null);
			System.out.println("Call 'doSomething()' method in client successfully");

			// call "getDemoBeanEntity" server method
			String code = String.valueOf(1);
			String msg = "message......";
			String[] params = new String[]{code, msg};
			DemoBean entity = client.invoke("getDemoBeanEntity", params, DemoBean.class);
			System.out.println("code: " + entity.getCode());
			System.out.println("Msg: " + entity.getMsg());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
