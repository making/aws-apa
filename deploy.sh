#!/bin/sh
mvn -Dmaven.test.skip=true -DaltDeploymentRepository=making-dropbox-releases::default::file:../maven/releases clean deploy