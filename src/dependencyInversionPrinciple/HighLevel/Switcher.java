package dependencyInversionPrinciple.HighLevel;

import dependencyInversionPrinciple.lowLevel.Switchable;

public interface Switcher {

	boolean isOn();

	void setClient(Switchable client);

	void press();

}