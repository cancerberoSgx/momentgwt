package org.sgx.momentgwt.test;

import java.util.Date;

import org.sgx.momentgwt.client.Moment;

import com.google.gwt.core.client.EntryPoint;

public class MomentGwtTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		test1();
		
	}

	private void test1() {
		System.out.println(Moment.moment(new Date()).format("MMMM Do YYYY, h:mm:ss a"));
	}

}
