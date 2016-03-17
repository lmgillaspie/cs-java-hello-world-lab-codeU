package com.flatironschool.javacs;
//Edited by Lindsey Gillaspie  3/17/2016

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.specification.version");
	Double dblVersion = Double.parseDouble(version);
	return dblVersion;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	Double finalVersion = getVersion();
	System.out.println("You have java version " + finalVersion);
    }
}
