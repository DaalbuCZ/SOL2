.class Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LifeCycleObserver"
.end annotation


# instance fields
.field private final n:Landroid/app/Activity;

.field final synthetic o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin;


# direct methods
.method constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->n:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/j;)V
    .locals 0

    return-void
.end method

.method public b(Landroidx/lifecycle/j;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->n:Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->onActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method

.method public c(Landroidx/lifecycle/j;)V
    .locals 0

    return-void
.end method

.method public e(Landroidx/lifecycle/j;)V
    .locals 0

    return-void
.end method

.method public f(Landroidx/lifecycle/j;)V
    .locals 0

    return-void
.end method

.method public g(Landroidx/lifecycle/j;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->n:Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->onActivityStopped(Landroid/app/Activity;)V

    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->n:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->n:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->d(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;)Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->b()Lio/flutter/plugins/imagepicker/d;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/d;->E()V

    :cond_0
    return-void
.end method
