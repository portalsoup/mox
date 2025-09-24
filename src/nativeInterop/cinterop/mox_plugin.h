#ifndef MOX_PLUGIN_H
#define MOX_PLUGIN_H

#ifdef __cplusplus
extern "C" {
#endif

typedef struct Plugin Plugin;

struct Plugin {
    const char* name;
    const char* parentName;
    void (*run)(const char* args);
};

Plugin* createPlugin(void);

#ifdef __cplusplus
}
#endif

#endif
