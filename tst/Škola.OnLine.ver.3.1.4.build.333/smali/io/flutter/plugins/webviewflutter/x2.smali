.class public Lio/flutter/plugins/webviewflutter/x2;
.super Lio/flutter/plugins/webviewflutter/k$y;
.source ""


# instance fields
.field private final b:Lio/flutter/plugins/webviewflutter/i2;


# direct methods
.method public constructor <init>(Lt8/c;Lio/flutter/plugins/webviewflutter/i2;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/k$y;-><init>(Lt8/c;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    return-void
.end method

.method private A(Landroid/webkit/WebViewClient;)J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not find identifier for WebViewClient."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static w(Landroid/webkit/WebResourceError;)Lio/flutter/plugins/webviewflutter/k$s;
    .locals 3

    new-instance v0, Lio/flutter/plugins/webviewflutter/k$s$a;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/k$s$a;-><init>()V

    invoke-virtual {p0}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$s$a;->c(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$s$a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/flutter/plugins/webviewflutter/k$s$a;->b(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/k$s$a;

    move-result-object p0

    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/k$s$a;->a()Lio/flutter/plugins/webviewflutter/k$s;

    move-result-object p0

    return-object p0
.end method

.method static x(Ll0/e;)Lio/flutter/plugins/webviewflutter/k$s;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RequiresFeature"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/webviewflutter/k$s$a;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/k$s$a;-><init>()V

    invoke-virtual {p0}, Ll0/e;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$s$a;->c(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$s$a;

    move-result-object v0

    invoke-virtual {p0}, Ll0/e;->a()Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/flutter/plugins/webviewflutter/k$s$a;->b(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/k$s$a;

    move-result-object p0

    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/k$s$a;->a()Lio/flutter/plugins/webviewflutter/k$s;

    move-result-object p0

    return-object p0
.end method

.method static y(Landroid/webkit/WebResourceRequest;)Lio/flutter/plugins/webviewflutter/k$t;
    .locals 3

    new-instance v0, Lio/flutter/plugins/webviewflutter/k$t$a;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/k$t$a;-><init>()V

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$t$a;->g(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/k$t$a;

    move-result-object v0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$t$a;->c(Ljava/lang/Boolean;)Lio/flutter/plugins/webviewflutter/k$t$a;

    move-result-object v0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$t$a;->b(Ljava/lang/Boolean;)Lio/flutter/plugins/webviewflutter/k$t$a;

    move-result-object v0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$t$a;->e(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/k$t$a;

    move-result-object v0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :goto_0
    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$t$a;->f(Ljava/util/Map;)Lio/flutter/plugins/webviewflutter/k$t$a;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_1

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/flutter/plugins/webviewflutter/k$t$a;->d(Ljava/lang/Boolean;)Lio/flutter/plugins/webviewflutter/k$t$a;

    :cond_1
    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/k$t$a;->a()Lio/flutter/plugins/webviewflutter/k$t;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/webviewflutter/k$y;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public C(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/webviewflutter/k$y;->r(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v1, p0

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Lio/flutter/plugins/webviewflutter/k$y;->s(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public E(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/WebResourceRequest;",
            "Landroid/webkit/WebResourceError;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p3}, Lio/flutter/plugins/webviewflutter/x2;->y(Landroid/webkit/WebResourceRequest;)Lio/flutter/plugins/webviewflutter/k$t;

    move-result-object v4

    invoke-static {p4}, Lio/flutter/plugins/webviewflutter/x2;->w(Landroid/webkit/WebResourceError;)Lio/flutter/plugins/webviewflutter/k$s;

    move-result-object v5

    move-object v1, p0

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lio/flutter/plugins/webviewflutter/k$y;->t(Ljava/lang/Long;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$t;Lio/flutter/plugins/webviewflutter/k$s;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public F(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Ll0/e;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/WebResourceRequest;",
            "Ll0/e;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p3}, Lio/flutter/plugins/webviewflutter/x2;->y(Landroid/webkit/WebResourceRequest;)Lio/flutter/plugins/webviewflutter/k$t;

    move-result-object v4

    invoke-static {p4}, Lio/flutter/plugins/webviewflutter/x2;->x(Ll0/e;)Lio/flutter/plugins/webviewflutter/k$s;

    move-result-object v5

    move-object v1, p0

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lio/flutter/plugins/webviewflutter/k$y;->t(Ljava/lang/Long;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$t;Lio/flutter/plugins/webviewflutter/k$s;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public G(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/WebResourceRequest;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p3}, Lio/flutter/plugins/webviewflutter/x2;->y(Landroid/webkit/WebResourceRequest;)Lio/flutter/plugins/webviewflutter/k$t;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/webviewflutter/k$y;->u(Ljava/lang/Long;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$t;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/flutter/plugins/webviewflutter/k$y;->v(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z(Landroid/webkit/WebViewClient;Lio/flutter/plugins/webviewflutter/k$y$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebViewClient;",
            "Lio/flutter/plugins/webviewflutter/k$y$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/x2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/x2;->A(Landroid/webkit/WebViewClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/k$y;->h(Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$y$a;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugins/webviewflutter/k$y$a;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
