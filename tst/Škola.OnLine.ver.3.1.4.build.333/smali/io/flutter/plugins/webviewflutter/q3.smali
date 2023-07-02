.class public Lio/flutter/plugins/webviewflutter/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/q3$a;,
        Lio/flutter/plugins/webviewflutter/q3$c;,
        Lio/flutter/plugins/webviewflutter/q3$b;,
        Lio/flutter/plugins/webviewflutter/q3$d;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/plugins/webviewflutter/i2;

.field private final b:Lio/flutter/plugins/webviewflutter/q3$d;

.field private final c:Landroid/view/View;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/q3$d;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/q3;->b:Lio/flutter/plugins/webviewflutter/q3$d;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/q3;->d:Landroid/content/Context;

    iput-object p4, p0, Lio/flutter/plugins/webviewflutter/q3;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebViewClient;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method public B(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3;->d:Landroid/content/Context;

    return-void
.end method

.method public a(Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    check-cast v0, Lio/flutter/plugins/webviewflutter/p2;

    invoke-interface {v0}, Lio/flutter/plugins/webviewflutter/p2;->a()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->k(J)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 4

    new-instance v0, Lio/flutter/plugins/webviewflutter/c;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/c;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/q3;->d:Landroid/content/Context;

    const-string v2, "display"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/c;->b(Landroid/hardware/display/DisplayManager;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/q3;->b:Lio/flutter/plugins/webviewflutter/q3$d;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/q3;->d:Landroid/content/Context;

    invoke-virtual {p2, v2}, Lio/flutter/plugins/webviewflutter/q3$d;->b(Landroid/content/Context;)Lio/flutter/plugins/webviewflutter/q3$c;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/q3;->b:Lio/flutter/plugins/webviewflutter/q3$d;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/q3;->d:Landroid/content/Context;

    iget-object v3, p0, Lio/flutter/plugins/webviewflutter/q3;->c:Landroid/view/View;

    invoke-virtual {p2, v2, v3}, Lio/flutter/plugins/webviewflutter/q3$d;->a(Landroid/content/Context;Landroid/view/View;)Lio/flutter/plugins/webviewflutter/q3$a;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/c;->a(Landroid/hardware/display/DisplayManager;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->b(Ljava/lang/Object;J)V

    return-void
.end method

.method public c(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollX()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Long;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1, p2, p3, p4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    return-void
.end method

.method public g(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/plugins/webviewflutter/m2;

    iget-object v0, p2, Lio/flutter/plugins/webviewflutter/m2;->o:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public h(Ljava/lang/Long;)Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroid/webkit/WebView;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    return-void
.end method

.method public k(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    return-void
.end method

.method public l(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/webkit/DownloadListener;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    return-void
.end method

.method public m(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->b:Lio/flutter/plugins/webviewflutter/q3$d;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/q3$d;->c(Z)V

    return-void
.end method

.method public n(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebChromeClient;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public o(Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goForward()V

    return-void
.end method

.method public p(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public q(Ljava/lang/Long;)Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public r(Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->clearCache(Z)V

    return-void
.end method

.method public s(Ljava/lang/Long;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Long;Ljava/lang/String;[B)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    return-void
.end method

.method public u(Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$n;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$n<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/flutter/plugins/webviewflutter/p3;

    invoke-direct {v0, p3}, Lio/flutter/plugins/webviewflutter/p3;-><init>(Lio/flutter/plugins/webviewflutter/k$n;)V

    invoke-virtual {p1, p2, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public v(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/Long;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->scrollTo(II)V

    return-void
.end method

.method public w(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/plugins/webviewflutter/m2;

    iget-object p2, p2, Lio/flutter/plugins/webviewflutter/m2;->o:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    return-void
.end method

.method public x(Ljava/lang/Long;)Ljava/lang/Long;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollY()I

    move-result p1

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$e0;
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/webkit/WebView;

    new-instance v0, Lio/flutter/plugins/webviewflutter/k$e0$a;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/k$e0$a;-><init>()V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollX()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$e0$a;->b(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$e0$a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getScrollY()I

    move-result p1

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/k$e0$a;->c(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$e0$a;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/webviewflutter/k$e0$a;->a()Lio/flutter/plugins/webviewflutter/k$e0;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/Long;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->scrollBy(II)V

    return-void
.end method
