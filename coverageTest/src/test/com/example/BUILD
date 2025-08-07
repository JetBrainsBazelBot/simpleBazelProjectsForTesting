load("@rules_java//java:java_test.bzl", "java_test")

java_test(
    name = "calculator_test",
    srcs = [
        "CalculatorTest.java",
    ],
    test_class = "com.example.CalculatorTest",
    deps = [
        "//src/main/com/example:calculator",
        "@maven//:junit_junit",
    ],
)
