load("@rules_java//java:java_binary.bzl", "java_binary")
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
    test_class = "com.example.CalculatorTest",
    deps = [
        ":calculator",
        "@maven//:junit_junit",
    ],
)

java_binary(
    name = "main",
    srcs = [
        "src/com/example/Main.java",
    ],
    main_class = "com.example.Main",
    deps = [
        ":calculator",
    ],
)
