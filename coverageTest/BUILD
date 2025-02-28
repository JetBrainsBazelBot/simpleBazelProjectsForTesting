load("@rules_java//java:java_library.bzl", "java_library")
load("@rules_java//java:java_test.bzl", "java_test")

java_library(
  name = "calculator",
  srcs = [
    "src/com/example/Calculator.java",
  ],
)

java_test(
  name = "calculator_test",
  srcs = [
    "src/com/example/CalculatorTest.java",
  ],
  deps = [
    ":calculator",
    "@maven//:junit_junit",
  ],
  test_class = "com.example.CalculatorTest",
)

