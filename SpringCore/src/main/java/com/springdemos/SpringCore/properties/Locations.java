package com.springdemos.SpringCore.properties;

import java.util.Properties;

public class Locations {

	Properties dailetc;

	public Properties getDailetc() {
		return dailetc;
	}

	@Override
	public String toString() {
		return "Locations [dailetc=" + dailetc + "]";
	}

	public void setDailetc(Properties dailetc) {
		this.dailetc = dailetc;
	}
}
