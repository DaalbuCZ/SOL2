.class public Lo8/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ll8/c;)Landroidx/lifecycle/f;
    .locals 0

    invoke-interface {p0}, Ll8/c;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;

    invoke-virtual {p0}, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    return-object p0
.end method
