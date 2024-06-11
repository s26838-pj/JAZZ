# BikeRentApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBikeRent**](BikeRentApi.md#createBikeRent) | **POST** /bike-rents | Create a new bike rent
[**getAllBikeRents**](BikeRentApi.md#getAllBikeRents) | **GET** /bike-rents | Get all bike rents

<a name="createBikeRent"></a>
# **createBikeRent**
> BikeRentResponse createBikeRent(body)

Create a new bike rent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BikeRentApi;


BikeRentApi apiInstance = new BikeRentApi();
BikeRentCreateRequest body = new BikeRentCreateRequest(); // BikeRentCreateRequest | 
try {
    BikeRentResponse result = apiInstance.createBikeRent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BikeRentApi#createBikeRent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BikeRentCreateRequest**](BikeRentCreateRequest.md)|  |

### Return type

[**BikeRentResponse**](BikeRentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllBikeRents"></a>
# **getAllBikeRents**
> List&lt;BikeRentResponse&gt; getAllBikeRents()

Get all bike rents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BikeRentApi;


BikeRentApi apiInstance = new BikeRentApi();
try {
    List<BikeRentResponse> result = apiInstance.getAllBikeRents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BikeRentApi#getAllBikeRents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BikeRentResponse&gt;**](BikeRentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

