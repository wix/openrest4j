package com.wix.restaurants.orders.notifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wix.restaurants.notifications.Notification;

/** Triggered when an order is accepted. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AcceptedOrderNotification extends Notification {
    public static final String TYPE = "accepted_order";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public AcceptedOrderNotification() {}
    
    public AcceptedOrderNotification(String channelId, String channelParam, String comment, String state) {
    	super(channelId, channelParam, comment, state);
    }
    
	@Override
	public AcceptedOrderNotification clone() {
		return new AcceptedOrderNotification(channelId, channelParam, comment, state);
	}
}
