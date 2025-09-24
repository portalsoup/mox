#include "../src/nativeInterop/cinterop/mox_plugin.h"
#include <stdio.h>

static void run(const char* args) {
    printf("[Plugin called with] %s", args);
}

static Plugin plugin = {
    .name = "c_hello",
    .run = run
};

Plugin* createPlugin(void) {
    return &plugin;
}