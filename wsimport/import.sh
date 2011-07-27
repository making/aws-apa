#!/bin/sh
wsimport -d ../target/classes -s ../src/main/java -p am.ik.aws.apa.jaxws http://ecs.amazonaws.com/AWSECommerceService/AWSECommerceService.wsdl -b custom.xml .