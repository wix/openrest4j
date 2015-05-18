package com.openrest.v1_1;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryOrdersRequest extends Request {
	public static final String TYPE = "query_orders";
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public QueryOrdersRequest() {}
    
    public QueryOrdersRequest(String accessToken, String distributorId, String chainId, Collection<String> restaurantIds, ClientId clientId,
    		String status, String source, String platform, String ref, Long since, Long until, String query, String viewMode, String ordering, Set<String> fields,
    		Integer limit) {
    	this.accessToken = accessToken;
    	this.distributorId = distributorId;
    	this.chainId = chainId;
    	this.restaurantIds = restaurantIds;
    	this.clientId = clientId;
    	this.status = status;
    	this.source = source;
    	this.platform = platform;
    	this.ref = ref;
    	this.since = since;
    	this.until = until;
    	this.query = query;
    	this.viewMode = viewMode;
    	this.ordering = ordering;
    	this.fields = fields;
    	this.limit = limit;
    }
    
    @JsonInclude(Include.NON_NULL)
    public String accessToken;
    
    @JsonInclude(Include.NON_NULL)
    public String distributorId;
    
    @JsonInclude(Include.NON_NULL)
    public String chainId;
    
    @JsonInclude(Include.NON_NULL)
    public Collection<String> restaurantIds;
    
    @JsonInclude(Include.NON_NULL)
    public ClientId clientId;
    
    /** Use clientId */
    @Deprecated
    @JsonInclude(Include.NON_NULL)
    public String userId;

    @JsonInclude(Include.NON_NULL)
    public String status;
    
    @JsonInclude(Include.NON_NULL)
    public String source;
    
    @JsonInclude(Include.NON_NULL)
    public String platform;
    
    /** Use source and platform */
    @Deprecated
    @JsonInclude(Include.NON_NULL)
    public String ref;

    @JsonInclude(Include.NON_NULL)
    public Long since;
    
    public Date since() {
    	return ((since != null) ? new Date(since.longValue()) : null);
    }
    
    @JsonInclude(Include.NON_NULL)
    public Long until;
    
    public Date until() {
    	return ((until != null) ? new Date(until.longValue()) : null);
    }
    
    @JsonInclude(Include.NON_NULL)
    public String query;
    
    /** @see Order#ALL_ORDER_VIEW_MODES */
    @JsonInclude(Include.NON_NULL)
    public String viewMode;
    
    /** Use viewMode */
    @Deprecated
    @JsonInclude(Include.NON_DEFAULT)
    public Boolean restaurantView = Boolean.FALSE;
    
    @JsonInclude(Include.NON_NULL)
    public String ordering;
    
    @JsonInclude(Include.NON_NULL)
	public Set<String> fields;
    
    @JsonInclude(Include.NON_NULL)
    public Integer limit;
}