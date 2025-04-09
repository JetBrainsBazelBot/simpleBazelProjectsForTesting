load("@rules_java//java:java_library.bzl", "java_library")
load("@rules_java//java:java_test.bzl", "java_test")

java_test(
  name = "addition_test",
  srcs = [
    "AdditionTest.java",
  ],
  deps = [
    "@maven//:junit_junit",
  ],
  test_class = "AdditionTest",
)

java_test(
  name = "multiplication_test",
  srcs = [
    "MultiplicationTest.java",
  ],
  deps = [
    "@maven//:junit_junit",
  ],
  test_class = "MultiplicationTest",
)

java_test(
  name = "subtraction_test",
  srcs = [
    "SubtractionTest.java",
  ],
  deps = [
    "@maven//:junit_junit",
  ],
  test_class = "SubtractionTest",
  tags = ["manual"],
)

