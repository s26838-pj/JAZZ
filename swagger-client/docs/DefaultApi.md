# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBikeRent**](DefaultApi.md#deleteBikeRent) | **DELETE** /bike-rents/{id} | Delete a bike rent
[**updateBikeRent**](DefaultApi.md#updateBikeRent) | **PUT** /bike-rents/{id} | Update a bike rent

<a name="deleteBikeRent"></a>
# **deleteBikeRent**
> deleteBikeRent(id)

Delete a bike rent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UUID id = new UUID(); // UUID | 
try {
    apiInstance.deleteBikeRent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteBikeRent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateBikeRent"></a>
# **updateBikeRent**
> BikeRentResponse updateBikeRent(body, id)

Update a bike rent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
BikeRentUpdateRequest body = new BikeRentUpdateRequest(); // BikeRentUpdateRequest | 
UUID id = new UUID(); // UUID | 
try {
    BikeRentResponse result = apiInstance.updateBikeRent(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateBikeRent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BikeRentUpdateRequest**](BikeRentUpdateRequest.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**BikeRentResponse**](BikeRentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

