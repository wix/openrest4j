package com.wix.restaurants.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wix.restaurants.orders.requests.SetOrderStatusRequest;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
	    property = "type")
@JsonSubTypes({
	@Type(value = SetOrderStatusRequest.class, name = SetOrderStatusRequest.TYPE),
	@Type(value = QueryClubMembersRequest.class, name = QueryClubMembersRequest.TYPE),
	@Type(value = RegisterForPushNotificationsRequest.class, name = RegisterForPushNotificationsRequest.TYPE),
	@Type(value = RegisterForPushRequest.class, name = RegisterForPushRequest.TYPE),
	@Type(value = PushRequest.class, name = PushRequest.TYPE),
	@Type(value = GetAppCredentialsRequest.class, name = GetAppCredentialsRequest.TYPE),
	@Type(value = SetAppCredentialsRequest.class, name = SetAppCredentialsRequest.TYPE),
	@Type(value = SetAppMappingRequest.class, name = SetAppMappingRequest.TYPE),
	@Type(value = GetAppMappedObjectRequest.class, name = GetAppMappedObjectRequest.TYPE),
	@Type(value = GetClientInfoRequest.class, name = GetClientInfoRequest.TYPE),
	@Type(value = SetClientInfoCommentsRequest.class, name = SetClientInfoCommentsRequest.TYPE),
	@Type(value = SignUpRequest.class, name = SignUpRequest.TYPE),
	@Type(value = SignedRequest.class, name = SignedRequest.TYPE),
	@Type(value = ResetPasswordRequest.class, name = ResetPasswordRequest.TYPE),
	@Type(value = SetPasswordRequest.class, name = SetPasswordRequest.TYPE),
	@Type(value = GetAppPublisherRequest.class, name = GetAppPublisherRequest.TYPE),
	@Type(value = SetAppPublisherRequest.class, name = SetAppPublisherRequest.TYPE),
	@Type(value = SubmitAppRequest.class, name = SubmitAppRequest.TYPE),
	@Type(value = SetAppRequest.class, name = SetAppRequest.TYPE),
	@Type(value = QueryAppsRequest.class, name = QueryAppsRequest.TYPE),
	@Type(value = GetInventoryRequest.class, name = GetInventoryRequest.TYPE),
	@Type(value = SetInventoryRequest.class, name = SetInventoryRequest.TYPE),
	@Type(value = AddInventoryRequest.class, name = AddInventoryRequest.TYPE),
	@Type(value = AddChargeUsageRequest.class, name = AddChargeUsageRequest.TYPE),
	@Type(value = GetChargeUsageRequest.class, name = GetChargeUsageRequest.TYPE),
	@Type(value = CreateGroupRequest.class, name = CreateGroupRequest.TYPE),
	@Type(value = SetGroupRequest.class, name = SetGroupRequest.TYPE),
	@Type(value = GetGroupsRequest.class, name = GetGroupsRequest.TYPE),
	@Type(value = JoinGroupRequest.class, name = JoinGroupRequest.TYPE),
	@Type(value = LeaveGroupRequest.class, name = LeaveGroupRequest.TYPE),
	@Type(value = GetGroupStaffRequest.class, name = GetGroupStaffRequest.TYPE),
	@Type(value = SetGroupStaffRequest.class, name = SetGroupStaffRequest.TYPE),
	@Type(value = AuthenticateRequest.class, name = AuthenticateRequest.TYPE)
})
public abstract class Request implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** Default constructor for JSON deserialization. */
    public Request() {}
}
