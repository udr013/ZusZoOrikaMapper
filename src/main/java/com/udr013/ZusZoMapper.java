package com.udr013;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;


public class ZusZoMapper {

    private final static MapperFacade mapper;

	//static initializer block.....
	static {
		final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Black.class, Yellow.class)
				.field("zus", "zo")
				.field("name", "name")
				.byDefault().register();
		mapper = mapperFactory.getMapperFacade();
	}

	public ZusZoMapper() {
	}

	public Yellow mapBlackToYellow(final Black black) {
		Yellow yel = mapper.map(black, Yellow.class);
		return yel;
	}
}
