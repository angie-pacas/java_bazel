# src/test/java/com/ejemplo/app/BUILD

load("@rules_java//java:defs.bzl", "java_test")

java_test(
    name = "app_test",
    srcs = glob(["*Test.java"]),
    test_class = "com.ejemplo.app1.MainTest",
    deps = [
        "//app1/src/main/java/com/ejemplo/app1:app_lib",
        "@maven//:junit_junit",
    ],
)