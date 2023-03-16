.class public Lg8/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ld8/c;)Landroidx/lifecycle/e;
    .locals 0

    invoke-interface {p0}, Ld8/c;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;

    invoke-virtual {p0}, Lio/flutter/embedding/engine/plugins/lifecycle/HiddenLifecycleReference;->getLifecycle()Landroidx/lifecycle/e;

    move-result-object p0

    return-object p0
.end method
