load(":junit_test.bzl", "kt_test")
load("@rules_java//java:java_library.bzl", "java_library")

kt_test(
    name = "SimpleKotlinTest",
    size = "large",
    srcs = ["SimpleKotlinTest.kt"],
    classname = "SimpleKotlinTest",
)

java_library(
    name = "hello",
    srcs = ["nested_src/Hello.java"],
)
