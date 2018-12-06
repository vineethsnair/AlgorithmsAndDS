package com.DesignPattern.Adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket socket = new Socket();
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		return new Volt(socket.getVolt().getVolts()/10);
	}

	@Override
	public Volt get3Volt() {
		return new Volt(socket.getVolt().getVolts()/40);
	}

}
