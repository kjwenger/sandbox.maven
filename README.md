# sandbox.maven

Sandbox for all sorts of Maven tryouts such as code formatting etc. 

## Test

There are profiles to exclude certain tests that require for instance hardware.

In order to try the test tag exclusions, simply run:

```shell
# Should run all tests,
# software prints colored in green and hardware prints colored in red
mvn test --activate-profiles test-hardware
```

```shell
# Should only run software tests, prints colored in green
mvn test --activate-profiles test-software
```