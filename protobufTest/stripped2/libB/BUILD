load("@rules_proto//proto:defs.bzl", "proto_library")

java_proto_library(
    name = "lib_b_java",
    visibility = ["//visibility:public"],
    deps = [":lib_b"],
)

proto_library(
    name = "lib_b",
    srcs = ["lib_b.proto"],
    import_prefix = "my_prefix_1337",
    visibility = ["//visibility:public"],
    deps = ["//stripped2/libA:lib_a"],
)
