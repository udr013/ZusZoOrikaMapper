package com.udr013;


public class Main {


	public static void main(String[] args) throws Exception {

		ZusZoMapper zusZoMapper = new ZusZoMapper();

		Black black = new Black();
		black.setName("yellow");
		black.setZus(4);

		//map source: p1Domain to target:p1Dto using orika
		Yellow yellow = zusZoMapper.mapBlackToYellow(black);

		System.out.println("after mapping with orika: yellow = " + yellow);
	}
}
