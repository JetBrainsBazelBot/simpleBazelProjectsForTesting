load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load(":junit_test.bzl", "kt_test")

kt_test(
    name = "SimpleKotlinTest",
    size = "large",
    srcs = ["SimpleKotlinTest.kt"],
    classname = "SimpleKotlinTest",
)

kt_jvm_library(
    name = "associates_example",
    srcs = ["A.kt"],
    associates = [":B"],
)

kt_jvm_library(
    name = "B",
    srcs = ["B.kt"],
    exports = [":C"],
)

kt_jvm_library(
    name = "C",
    srcs = ["C.kt"],
)
