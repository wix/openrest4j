package com.wix.restaurants.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wix.restaurants.authentication.model.User;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetClientInfoCommentsRequest extends Request {
	public static final String TYPE = "set_client_info_comments";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public SetClientInfoCommentsRequest() {}
    
    public SetClientInfoCommentsRequest(String accessToken, User clientId, Map<String, String> comments) {
    	this.accessToken = accessToken;
    	this.clientId = clientId;
    	this.comments = comments;
    }
    
    @JsonInclude(Include.NON_NULL)
    public String accessToken;
    
    @JsonInclude(Include.NON_NULL)
    public User clientId;
    
    @JsonInclude(Include.NON_DEFAULT)
    public Map<String, String> comments = new LinkedHashMap<>();
}
