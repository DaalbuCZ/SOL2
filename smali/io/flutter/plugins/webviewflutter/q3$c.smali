.class public Lio/flutter/plugins/webviewflutter/q3$c;
.super Landroid/webkit/WebView;
.source ""

# interfaces
.implements Lio/flutter/plugin/platform/f;
.implements Lio/flutter/plugins/webviewflutter/p2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final n:Lio/flutter/plugins/webviewflutter/q3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugins/webviewflutter/q3$b<",
            "Lio/flutter/plugins/webviewflutter/y2$a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Lio/flutter/plugins/webviewflutter/q3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugins/webviewflutter/q3$b<",
            "Lio/flutter/plugins/webviewflutter/e$b;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lio/flutter/plugins/webviewflutter/q3$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/plugins/webviewflutter/q3$b<",
            "Lio/flutter/plugins/webviewflutter/s2$b;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/q3$b<",
            "Lio/flutter/plugins/webviewflutter/m2;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance p1, Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-direct {p1}, Lio/flutter/plugins/webviewflutter/q3$b;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$c;->n:Lio/flutter/plugins/webviewflutter/q3$b;

    new-instance p1, Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-direct {p1}, Lio/flutter/plugins/webviewflutter/q3$b;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$c;->o:Lio/flutter/plugins/webviewflutter/q3$b;

    new-instance p1, Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-direct {p1}, Lio/flutter/plugins/webviewflutter/q3$b;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$c;->p:Lio/flutter/plugins/webviewflutter/q3$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->n:Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->o:Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->p:Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v1}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "JavascriptInterface"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/flutter/plugins/webviewflutter/m2;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/webviewflutter/q3$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->a()Lio/flutter/plugins/webviewflutter/p2;

    move-result-object v1

    if-eq v1, p1, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    new-instance v1, Lio/flutter/plugins/webviewflutter/q3$b;

    check-cast p1, Lio/flutter/plugins/webviewflutter/m2;

    invoke-direct {v1, p1}, Lio/flutter/plugins/webviewflutter/q3$b;-><init>(Lio/flutter/plugins/webviewflutter/p2;)V

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method public synthetic f()V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugin/platform/e;->d(Lio/flutter/plugin/platform/f;)V

    return-void
.end method

.method public synthetic g(Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugin/platform/e;->a(Lio/flutter/plugin/platform/f;Landroid/view/View;)V

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public synthetic h()V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugin/platform/e;->b(Lio/flutter/plugin/platform/f;)V

    return-void
.end method

.method public synthetic i()V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugin/platform/e;->c(Lio/flutter/plugin/platform/f;)V

    return-void
.end method

.method public removeJavascriptInterface(Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->b()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setDownloadListener(Landroid/webkit/DownloadListener;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->o:Lio/flutter/plugins/webviewflutter/q3$b;

    check-cast p1, Lio/flutter/plugins/webviewflutter/e$b;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/q3$b;->c(Lio/flutter/plugins/webviewflutter/p2;)V

    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->p:Lio/flutter/plugins/webviewflutter/q3$b;

    check-cast p1, Lio/flutter/plugins/webviewflutter/s2$b;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/q3$b;->c(Lio/flutter/plugins/webviewflutter/p2;)V

    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->n:Lio/flutter/plugins/webviewflutter/q3$b;

    move-object v1, p1

    check-cast v1, Lio/flutter/plugins/webviewflutter/y2$a;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/q3$b;->c(Lio/flutter/plugins/webviewflutter/p2;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3$c;->p:Lio/flutter/plugins/webviewflutter/q3$b;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/q3$b;->a()Lio/flutter/plugins/webviewflutter/p2;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/webviewflutter/s2$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/s2$b;->h(Landroid/webkit/WebViewClient;)V

    :cond_0
    return-void
.end method
