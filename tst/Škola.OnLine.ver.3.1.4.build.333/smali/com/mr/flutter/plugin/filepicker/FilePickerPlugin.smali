.class public Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/k$c;
.implements Lk8/a;
.implements Ll8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;,
        Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;
    }
.end annotation


# static fields
.field private static v:Ljava/lang/String; = null

.field private static w:Z = false

.field private static x:Z = false


# instance fields
.field private n:Ll8/c;

.field private o:Lcom/mr/flutter/plugin/filepicker/b;

.field private p:Landroid/app/Application;

.field private q:Lk8/a$b;

.field private r:Landroidx/lifecycle/f;

.field private s:Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

.field private t:Landroid/app/Activity;

.field private u:Lt8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;)Lcom/mr/flutter/plugin/filepicker/b;
    .locals 0

    iget-object p0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    return-object p0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "dir"

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "video"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_1
    const-string v0, "media"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_2
    const-string v0, "image"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_3
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_5
    const-string v0, "any"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_6
    const-string v0, "custom"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    const-string p0, "video/*"

    return-object p0

    :pswitch_1
    const-string p0, "image/*,video/*"

    return-object p0

    :pswitch_2
    const-string p0, "image/*"

    return-object p0

    :pswitch_3
    const-string p0, "audio/*"

    return-object p0

    :pswitch_4
    return-object v1

    :pswitch_5
    const-string p0, "*/*"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5069748f -> :sswitch_6
        0x179ec -> :sswitch_5
        0x1848d -> :sswitch_4
        0x58d9bd6 -> :sswitch_3
        0x5faa95b -> :sswitch_2
        0x62f6fe4 -> :sswitch_1
        0x6b0147b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private c(Lt8/c;Landroid/app/Application;Landroid/app/Activity;Lt8/o;Ll8/c;)V
    .locals 2

    iput-object p3, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->t:Landroid/app/Activity;

    iput-object p2, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->p:Landroid/app/Application;

    new-instance v0, Lcom/mr/flutter/plugin/filepicker/b;

    invoke-direct {v0, p3}, Lcom/mr/flutter/plugin/filepicker/b;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    new-instance v0, Lt8/k;

    const-string v1, "miguelruivo.flutter.plugins.filepicker"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->u:Lt8/k;

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    new-instance v0, Lt8/d;

    const-string v1, "miguelruivo.flutter.plugins.filepickerevent"

    invoke-direct {v0, p1, v1}, Lt8/d;-><init>(Lt8/c;Ljava/lang/String;)V

    new-instance p1, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$a;

    invoke-direct {p1, p0}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$a;-><init>(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;)V

    invoke-virtual {v0, p1}, Lt8/d;->d(Lt8/d$d;)V

    new-instance p1, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

    invoke-direct {p1, p0, p3}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;-><init>(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->s:Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

    if-eqz p4, :cond_0

    invoke-virtual {p2, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {p4, p1}, Lt8/o;->b(Lt8/m;)Lt8/o;

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {p4, p1}, Lt8/o;->c(Lt8/p;)Lt8/o;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {p5, p1}, Ll8/c;->b(Lt8/m;)V

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {p5, p1}, Ll8/c;->c(Lt8/p;)V

    invoke-static {p5}, Lo8/a;->a(Ll8/c;)Landroidx/lifecycle/f;

    move-result-object p1

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->r:Landroidx/lifecycle/f;

    iget-object p2, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->s:Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/i;)V

    :goto_0
    return-void
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {v0, v1}, Ll8/c;->d(Lt8/m;)V

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-interface {v0, v1}, Ll8/c;->g(Lt8/p;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->s:Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->r:Landroidx/lifecycle/f;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/i;)V

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->p:Landroid/app/Application;

    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->s:Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$LifeCycleObserver;

    invoke-virtual {v1, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->r:Landroidx/lifecycle/f;

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    invoke-virtual {v1, v0}, Lcom/mr/flutter/plugin/filepicker/b;->o(Lt8/d$b;)V

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->u:Lt8/k;

    invoke-virtual {v1, v0}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->u:Lt8/k;

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->p:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ll8/c;)V
    .locals 6

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->q:Lk8/a$b;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v1

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->q:Lk8/a$b;

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/app/Application;

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object v3

    iget-object v5, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->n:Ll8/c;

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->c(Lt8/c;Landroid/app/Application;Landroid/app/Activity;Lt8/o;Ll8/c;)V

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->q:Lk8/a$b;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->d()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->q:Lk8/a$b;

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 8

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->t:Landroid/app/Activity;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p1, "no_activity"

    const-string v0, "file picker plugin requires a foreground activity"

    invoke-interface {p2, p1, v0, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v7, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;

    invoke-direct {v7, p2}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;-><init>(Lt8/k$d;)V

    iget-object p2, p1, Lt8/j;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v2, "clear"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->t:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/mr/flutter/plugin/filepicker/c;->a(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v7, p1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->v:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-interface {v7}, Lt8/k$d;->c()V

    goto :goto_0

    :cond_2
    const-string v2, "dir"

    if-eq v0, v2, :cond_3

    const-string v0, "allowMultipleSelection"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->w:Z

    const-string v0, "withData"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->x:Z

    const-string v0, "allowedExtensions"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-static {p2}, Lcom/mr/flutter/plugin/filepicker/c;->f(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object p2

    move-object v6, p2

    goto :goto_1

    :cond_3
    :goto_0
    move-object v6, v1

    :goto_1
    iget-object p1, p1, Lt8/j;->a:Ljava/lang/String;

    if-eqz p1, :cond_5

    const-string p2, "custom"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v6, :cond_4

    array-length p1, v6

    if-nez p1, :cond_5

    :cond_4
    const-string p1, "FilePicker"

    const-string p2, "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead."

    invoke-interface {v7, p1, p2, v1}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->o:Lcom/mr/flutter/plugin/filepicker/b;

    sget-object v3, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->v:Ljava/lang/String;

    sget-boolean v4, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->w:Z

    sget-boolean v5, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->x:Z

    invoke-virtual/range {v2 .. v7}, Lcom/mr/flutter/plugin/filepicker/b;->r(Ljava/lang/String;ZZ[Ljava/lang/String;Lt8/k$d;)V

    :goto_2
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;->onAttachedToActivity(Ll8/c;)V

    return-void
.end method
