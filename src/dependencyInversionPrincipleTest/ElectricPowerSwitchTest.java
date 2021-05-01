package dependencyInversionPrincipleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dependencyInversionPrinciple.HighLevel.ElectricPowerSwitch;
import dependencyInversionPrinciple.HighLevel.Switcher;
import dependencyInversionPrinciple.lowLevel.Fan;
import dependencyInversionPrinciple.lowLevel.LightBulb;
import dependencyInversionPrinciple.lowLevel.Switchable;

class ElectricPowerSwitchTest {

	private Switchable lightBulb = new LightBulb();
	private Switchable fan = new Fan();
	private Switcher electricPowerSwitch = new ElectricPowerSwitch();

	@Test
	final void testElectricPowerSwitch() {
		assertNotNull(electricPowerSwitch);
	}

	@Test
	final void testIsOn() {
		assertFalse(electricPowerSwitch.isOn());
	}

	@Test
	final void testPressLightBulb() {
		electricPowerSwitch.setClient(lightBulb);
		electricPowerSwitch.press();
		assertTrue(electricPowerSwitch.isOn());
		electricPowerSwitch.press();
		assertFalse(electricPowerSwitch.isOn());
	}
	
	@Test
	final void testPressForFan() {
		electricPowerSwitch.setClient(fan);
		electricPowerSwitch.press();
		assertTrue(electricPowerSwitch.isOn());
		electricPowerSwitch.press();
		assertFalse(electricPowerSwitch.isOn());
	}

}
