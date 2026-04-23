load("@rules_java//java:java_test.bzl", "java_test")
load("@rules_java//java:java_library.bzl", "java_library")

java_library(
    name = "test_library",
    srcs = ["TestLibrary.java"],
    deps = ["@maven//:junit_junit"],
)

java_test(
    name = "test_with_lib",
    srcs = [],
    deps = [],
    runtime_deps = [":test_library"],
    test_class = "case1.JavaTest",
)
