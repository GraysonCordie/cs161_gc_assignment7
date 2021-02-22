package edu.cgcc.cs161;

import java.util.List;

//HEADER
//Program Name: Assignment 7
//Author: Grayson Cordie
//Class: CS161 Winter 2021
//Date: 2/21/2021
//Description: The framework for a Scheduler based on given method specification.


public class Scheduler {
	
	private ClinicService availServices;
	private Survey survey;
	private ServiceNeed serviceNeed;
	private Appointment appointment;
	private Referral referral;

	
	public void requestToBeSeen() {
		
		availServices = availServices.getAvailServices();//Ask client to select a service
		
		if(availServices != null) { //If client selects service
			makeAppointment();
		} else { //Figure out what service client needs
			Survey surv = new Survey();
			survey = surv.fillOutSurvey();
			
			ServiceNeed serv = new ServiceNeed();
			serviceNeed = serv.identifyNeed(survey);
			
			if(availServices.compare(serviceNeed) != null) { //If surveyed needs align with service, make appointment
				makeAppointment();
			} else { //Provide other options
				makeReferral();
			}
		}
		
	}
	
	public void makeAppointment() {
				
	}
	
	public void makeReferral() {
		
	}
	
}

/* FOOTER
 * Not functional.
*/