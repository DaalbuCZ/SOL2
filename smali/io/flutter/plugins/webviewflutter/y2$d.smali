.class public Lio/flutter/plugins/webviewflutter/y2$d;
.super Landroid/webkit/WebViewClient;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/y2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private n:Lio/flutter/plugins/webviewflutter/x2;

.field private final o:Z


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/x2;Z)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-boolean p2, p0, Lio/flutter/plugins/webviewflutter/y2$d;->o:Z

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->j(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->i(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->n(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->k(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->l(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic g(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->o(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic h(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/y2$d;->m(Ljava/lang/Void;)V

    return-void
.end method

.method private static synthetic i(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic j(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic k(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic l(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic m(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic n(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic o(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/m3;->a:Lio/flutter/plugins/webviewflutter/m3;

    invoke-virtual {v0, p0, v1}, Lio/flutter/plugins/webviewflutter/x2;->z(Landroid/webkit/WebViewClient;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/h3;->a:Lio/flutter/plugins/webviewflutter/h3;

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/x2;->B(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz p3, :cond_0

    sget-object v0, Lio/flutter/plugins/webviewflutter/g3;->a:Lio/flutter/plugins/webviewflutter/g3;

    invoke-virtual {p3, p0, p1, p2, v0}, Lio/flutter/plugins/webviewflutter/x2;->C(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    int-to-long v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    sget-object v6, Lio/flutter/plugins/webviewflutter/k3;->a:Lio/flutter/plugins/webviewflutter/k3;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lio/flutter/plugins/webviewflutter/x2;->D(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 6

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    sget-object v5, Lio/flutter/plugins/webviewflutter/j3;->a:Lio/flutter/plugins/webviewflutter/j3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lio/flutter/plugins/webviewflutter/x2;->E(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    return-void
.end method

.method public onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
    .locals 0

    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/i3;->a:Lio/flutter/plugins/webviewflutter/i3;

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/x2;->G(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/y2$d;->o:Z

    return p1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2$d;->n:Lio/flutter/plugins/webviewflutter/x2;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/l3;->a:Lio/flutter/plugins/webviewflutter/l3;

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/x2;->H(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    :cond_0
    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/y2$d;->o:Z

    return p1
.end method
