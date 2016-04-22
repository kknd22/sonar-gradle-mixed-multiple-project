# sonar-gradle-mixed-multiple-project

try to find out what find-sec-bug can do with scala byte code

https://github.com/find-sec-bugs/find-sec-bugs/issues/186

./gradlew findSecurityBug

then check the findbug report under the build.

So far the results are: for java source, find-sec-bug does the job, for the counter part scala code, it reports nothing.


gradle sonar with mixed lanaguage (java/scala) and mixed test (junit/scalatest) and mixed coverage (jacocco/scoverage)

