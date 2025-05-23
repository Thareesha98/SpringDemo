package com.example.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Named
public class SomeCDIBusiness {
	@Inject
	SomeCDIDAO someCDIDAo;

	public SomeCDIDAO getSomeCDIDAo() {
		return someCDIDAo;
	}

	public void setSomeCDIDAo(SomeCDIDAO someCDIDAo) {
		this.someCDIDAo = someCDIDAo;
	}
}
