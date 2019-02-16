package com.huju.spring.demo5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {

	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "CollectionBean [arrs=" + Arrays.toString(arrs) + ", list=" + list + ", map=" + map + ", properties="
				+ properties + "]";
	}
	
	
}
