package com.DesignPattern.Adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return new Volt(v.getVolts()/10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = getVolt();
		return new Volt(v.getVolts()/40);
	}

}
