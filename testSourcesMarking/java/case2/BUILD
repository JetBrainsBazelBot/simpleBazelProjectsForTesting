load("@rules_java//java:java_test.bzl", "java_test")
load("@rules_java//java:java_library.bzl", "java_library")
load("@rules_java//java:java_binary.bzl", "java_binary")

java_library(
    name = "test_library",
    srcs = ["TestLibrary.java"],
    deps = ["@maven//:junit_junit"],
)

java_library(
    name = "normal_library1",
    srcs = ["NormalLibrary1.java"],
)

java_library(
    name = "normal_library2",
    srcs = ["NormalLibrary2.java"],
)

java_test(
    name = "test_with_source",
    srcs = ["JavaTest.java"],
    test_class = "tests.MathJ4Test",
    deps = ["@maven//:junit_junit", ":normal_library2"],
)

java_test(
    name = "test_with_lib",
    srcs = [],
    deps = [],
    runtime_deps = [":test_library", ":normal_library1"],
    test_class = "case2.JavaTest",
)

java_binary(
  name = "JavaBinary",
  srcs = ["JavaBinary.java"],
  deps = [":normal_library1"],
  main_class = "case2.JavaBinary"
)
