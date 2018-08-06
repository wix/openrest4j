package com.wix.restaurants.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wix.restaurants.authentication.model.User;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaveGroupRequest extends Request {
	public static final String TYPE = "leave_group";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public LeaveGroupRequest() {}
    
    public LeaveGroupRequest(String accessToken, String groupId, User clientId) {
    	this.accessToken = accessToken;
    	this.groupId = groupId;
    	this.clientId = clientId;
    }
    
    @JsonInclude(Include.NON_NULL)
    public String accessToken;

    @JsonInclude(Include.NON_NULL)
    public String groupId;
    
    @JsonInclude(Include.NON_NULL)
    public User clientId;
}
