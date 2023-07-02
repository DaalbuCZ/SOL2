.class Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/app/Application;

.field private b:Landroid/app/Activity;

.field private c:Lio/flutter/plugins/imagepicker/d;

.field private d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

.field private e:Ll8/c;

.field private f:Lt8/c;

.field private g:Landroidx/lifecycle/f;

.field final synthetic h:Lio/flutter/plugins/imagepicker/ImagePickerPlugin;


# direct methods
.method constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Application;Landroid/app/Activity;Lt8/c;Lio/flutter/plugins/imagepicker/g$f;Lt8/o;Ll8/c;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->h:Lio/flutter/plugins/imagepicker/ImagePickerPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->a:Landroid/app/Application;

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->b:Landroid/app/Activity;

    iput-object p7, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->e:Ll8/c;

    iput-object p4, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->f:Lt8/c;

    invoke-virtual {p1, p3}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->e(Landroid/app/Activity;)Lio/flutter/plugins/imagepicker/d;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-static {p4, p5}, Lio/flutter/plugins/imagepicker/k;->h(Lt8/c;Lio/flutter/plugins/imagepicker/g$f;)V

    new-instance p4, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    invoke-direct {p4, p1, p3}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Activity;)V

    iput-object p4, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    if-eqz p6, :cond_0

    invoke-virtual {p2, p4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {p6, p1}, Lt8/o;->b(Lt8/m;)Lt8/o;

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {p6, p1}, Lt8/o;->c(Lt8/p;)Lt8/o;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {p7, p1}, Ll8/c;->b(Lt8/m;)V

    iget-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {p7, p1}, Ll8/c;->c(Lt8/p;)V

    invoke-static {p7}, Lo8/a;->a(Ll8/c;)Landroidx/lifecycle/f;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->g:Landroidx/lifecycle/f;

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/i;)V

    :goto_0
    return-void
.end method


# virtual methods
.method a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->b:Landroid/app/Activity;

    return-object v0
.end method

.method b()Lio/flutter/plugins/imagepicker/d;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    return-object v0
.end method

.method c()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->e:Ll8/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {v0, v2}, Ll8/c;->d(Lt8/m;)V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->e:Ll8/c;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    invoke-interface {v0, v2}, Ll8/c;->g(Lt8/p;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->e:Ll8/c;

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->g:Landroidx/lifecycle/f;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/i;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->g:Landroidx/lifecycle/f;

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->f:Lt8/c;

    invoke-static {v0, v1}, Lio/flutter/plugins/imagepicker/k;->h(Lt8/c;Lio/flutter/plugins/imagepicker/g$f;)V

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->a:Landroid/app/Application;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->a:Landroid/app/Application;

    :cond_2
    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->b:Landroid/app/Activity;

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;

    iput-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->c:Lio/flutter/plugins/imagepicker/d;

    return-void
.end method
