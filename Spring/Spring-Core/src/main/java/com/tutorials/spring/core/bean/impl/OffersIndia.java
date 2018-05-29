/**
 * 
 */
package com.tutorials.spring.core.bean.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tutorials.spring.core.bean.intf.IOffers;

/**
 * @author Siddhant sahu
 *
 */
@Component
public class OffersIndia implements IOffers {

	@Value(value = "${India.Message}")
	private String offerValue;

	public String getOfferValue() {
		return offerValue;
	}

	public void setOfferValue(String offerValue) {
		this.offerValue = offerValue;
	}

	/* (non-Javadoc)
	 * @see com.tutorials.spring.core.bean.intf.IOffers#getOffer()
	 */
	@Override
	public String getOffer() {
		return offerValue;
	}

	@PostConstruct
	public void init() {
		System.out.println("This is Offer INDIA class...");
	}

	@PreDestroy
	public void end() {
		System.out.println("Offer INDIA class is destoried ...");
	}
}
