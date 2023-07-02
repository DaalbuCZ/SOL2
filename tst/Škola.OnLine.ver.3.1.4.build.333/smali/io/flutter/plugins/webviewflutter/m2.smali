.class public Lio/flutter/plugins/webviewflutter/m2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/p2;


# instance fields
.field private final n:Landroid/os/Handler;

.field final o:Ljava/lang/String;

.field private p:Lio/flutter/plugins/webviewflutter/n2;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/n2;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/m2;->p:Lio/flutter/plugins/webviewflutter/n2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/m2;->o:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/m2;->n:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/m2;->e(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/m2;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/m2;->g(Ljava/lang/Void;)V

    return-void
.end method

.method private static synthetic e(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private synthetic f(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/m2;->p:Lio/flutter/plugins/webviewflutter/n2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/j2;->a:Lio/flutter/plugins/webviewflutter/j2;

    invoke-virtual {v0, p0, p1, v1}, Lio/flutter/plugins/webviewflutter/n2;->j(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$j$a;)V

    :cond_0
    return-void
.end method

.method private static synthetic g(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/m2;->p:Lio/flutter/plugins/webviewflutter/n2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/k2;->a:Lio/flutter/plugins/webviewflutter/k2;

    invoke-virtual {v0, p0, v1}, Lio/flutter/plugins/webviewflutter/n2;->h(Lio/flutter/plugins/webviewflutter/m2;Lio/flutter/plugins/webviewflutter/k$j$a;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/m2;->p:Lio/flutter/plugins/webviewflutter/n2;

    return-void
.end method

.method public postMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Lio/flutter/plugins/webviewflutter/l2;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/l2;-><init>(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/m2;->n:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/m2;->n:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
