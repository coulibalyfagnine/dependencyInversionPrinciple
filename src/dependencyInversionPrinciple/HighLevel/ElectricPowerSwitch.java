package dependencyInversionPrinciple.HighLevel;

import dependencyInversionPrinciple.lowLevel.Switchable;

public class ElectricPowerSwitch implements Switcher {
	
	private Switchable client;
	private boolean on;
	
	
	public ElectricPowerSwitch() {
		this.on = false;
	}
	
	@Override
	public boolean isOn() {
		return this.on;
	}
	
	
	@Override
	public void setClient(Switchable client) {
		this.client = client;
	}
	
	

	@Override
	public void press() {
		
		if(isOn()) 
			client.turnOff();
			
		if(!isOn())
			client.turnOn();
	
		this.on = !isOn();
	}

}
