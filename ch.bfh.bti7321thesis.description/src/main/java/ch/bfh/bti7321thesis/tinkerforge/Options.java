package ch.bfh.bti7321thesis.tinkerforge;

import org.eclipse.paho.client.mqttv3.MqttCallback;

public class Options {
	public enum SchemaFormat  {JSON, YAML};
	
	private SchemaFormat schemaFormat = SchemaFormat.YAML;
	private String mqttBrokerUri;
	private String mqttClientId;
	private String appId;
	
	// TODO
	private boolean logPublishMessages = false;

	public String getMqttBrokerUri() {
		return mqttBrokerUri;
	}
	public void setMqttBrokerUri(String mqttBrokerUri) {
		this.mqttBrokerUri = mqttBrokerUri;
	}
	public String getMqttClientId() {
		return mqttClientId;
	}
	public void setMqttClientId(String mqttClientId) {
		this.mqttClientId = mqttClientId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	private MqttCallback mqttCallback;
	
	public MqttCallback getMqttCallback() {
		return mqttCallback;
	}
	public void setMqttCallback(MqttCallback mqttCallback) {
		this.mqttCallback = mqttCallback;
	}
	public SchemaFormat getSchemaFormat() {
		return schemaFormat;
	}
	public void setSchemaFormat(SchemaFormat schemaFormat) {
		this.schemaFormat = schemaFormat;
	}
	
	
	

}

