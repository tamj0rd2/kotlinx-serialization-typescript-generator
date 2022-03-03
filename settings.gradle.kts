rootProject.name = "kxs-typescript-generator"

apply(from = "./buildSrc/repositories.settings.gradle.kts")

include(
  ":modules:kxs-ts-gen-core",
  ":modules:kxs-ts-gen-plugin",
  ":docs:knit",
)

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
