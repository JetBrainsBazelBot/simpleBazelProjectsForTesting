load("@rules_java//java:java_library.bzl", "java_library")

java_library(
    name = "test_library",
    srcs = ["TestLibrary.java"],
    deps = ["@maven//:junit_junit"],
    visibility = ["//java:__pkg__"],
)
