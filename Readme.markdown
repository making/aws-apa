## About
aws-apa is a library for Amazon Advertising Product API. This library supports all SOAP API using JAX-WS.

 - version 0.9.1 (2011-07-28) Supported http://webservices.amazon.com/AWSECommerceService/2011-08-01
 - version 0.9.2 (2011-08-15) Supported retry request when a web service exception occurs.
 - version 0.9.3 (2011-08-21) Supported i18n log message & changed logger library from SLF4J to YALF
 - version 0.9.4 (2011-09-23) Throws web service exceptions at the first time if not http status code is't 503. Updated YALF version to 0.9.1
 - version 0.9.5 (2014-03-09) Re-changed logger to SLF4J & deployed Maven Central Repository

## Settings
`am.ik.aws.apa.AwsApaRequesterImpl` is the main class to send requests to AWS. To use this class, all properties are required.
('required' means 'not null and not empty')

- Endpoint (ex. https://ecs.amazonaws.jp)
- Accesskey ID
- Secret Accesskey
- Associate Tag (ex. ikam-22)

You can write these in `aws-config.properties` like below. (This file must be located in just under the classpath.)

    aws.endpoint=https://ecs.amazonaws.jp
    aws.accesskey.id=<Your Accesskey ID for AWS>
    aws.secret.accesskey=<Your Secret Accesskey for AWS>
    aws.associate.tag=ikam-22

You can also set these in the constructor,  `am.ik.aws.apa.AwsApaRequesterImpl.AwsApaRequesterImpl(String, String, String, String)`.

## Examples

All examples use `aws-config.properties`.

### Item Search

    AwsApaRequester requester = new AwsApaRequesterImpl();
    ItemSearchRequest request = new ItemSearchRequest();
    request.setSearchIndex("Books");
    request.setKeywords("Java");
    ItemSearchResponse response = requester.itemSearch(request);

### Item Lookup

    AwsApaRequester requester = new AwsApaRequesterImpl();
    String asin = "489471499X";
    ItemLookupRequest request = new ItemLookupRequest();
    request.getItemId().add(asin);
    request.getResponseGroup().add("Small");
    ItemLookupResponse response = requester.itemLookup(request); // Get information about "Effective Java (Japanese Edition)"

### Item Search Asynchronously

    ItemSearchRequest request = new ItemSearchRequest();
    request.setSearchIndex("Books");
    request.setKeywords("Java");
    Response<ItemSearchResponse> res = requester.itemSearchAsync(request);
    // do something
    ItemSearchResponse response = res.get(); // Get response asynchronously

### Item Lookup Asynchronously

    String asin = "489471499X";
    ItemLookupRequest request = new ItemLookupRequest();
    request.getItemId().add(asin);
    request.getResponseGroup().add("Small");
    Response<ItemLookupResponse> res = requester.itemLookupAsync(request);
    // do something
    ItemLookupResponse response = res.get(); // Get response asynchronously

## Use with Maven

    <dependencies>
        ...

        <dependency>
            <groupId>am.ik.aws</groupId>
            <artifactId>aws-apa</artifactId>
            <version>0.9.5</version>
        </dependency>
    </dependencies>

## Requirements

- JDK 1.6+
- Commons Codec
- SLF4J

## License

Licensed under the Apache License, Version 2.0.