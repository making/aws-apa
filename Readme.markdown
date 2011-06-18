
## About
aws-apa is a library for Amazon Advertising Product API. This library supports all SOAP API using JAX-WS.

## Settings
`am.ik.aws.apa.AwsApaRequesterImpl` is the main class to send requests to AWS. To use this class, some information is required.

- Accesskey ID
- Secret Accesskey
- Endpoint (ex. https://ecs.amazonaws.jp)
- Associate Tag (optional)

You can write these in `aws-config.properties` like below. (This file must be located in just under the classpath.)

    aws.accesskey.id=<Your Accesskey ID for AWS>
    aws.secret.accesskey=<Your Secret Accesskey for AWS>
    aws.endpoint=https://ecs.amazonaws.jp
    aws.associate.tag=ikam-22

You can also set Accesskey ID, Secret Accesskey and Endpoint in the constructor,  `am.ik.aws.apa.AwsApaRequesterImpl.AwsApaRequesterImpl(String, String, String)`.

## Examples

### Item Search

    ItemSearchRequest request = new ItemSearchRequest();
    request.setSearchIndex("Books");
    request.setKeywords("Java");
    ItemSearchResponse response = requester.itemSearch(request);

### Item Lookup

    String asin = "489471499X";
    ItemLookupRequest request = new ItemLookupRequest();
    request.getItemId().add(asin);
    request.getResponseGroup().add("Small");
    ItemLookupResponse response = requester.itemLookup(request); // Get information about "Effective Java (Japanese Edition)"

## Use with Maven 

At first, add repository in your pom.

    <repositories>
        ...

        <repository>
            <id>making-dropbox-releases</id>
            <name>making's Maven Release Repository</name>
            <url>http://dl.dropbox.com/u/342817/maven/releases</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>

And add dependency.

    <dependencies>
        ...

        <dependency>
            <groupId>am.ik.aws</groupId>
            <artifactId>aws-apa</artifactId>
            <version>0.9.0</version>
        </dependency>
    </dependencies>

## Requirements

- JDK 1.6+
- SLF4J
- Commons Codec