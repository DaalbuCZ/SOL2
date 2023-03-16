.class public Lio/flutter/plugins/webviewflutter/r2;
.super Lio/flutter/plugins/webviewflutter/k$o;
.source ""


# instance fields
.field private final b:Lio/flutter/plugins/webviewflutter/i2;


# direct methods
.method public constructor <init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/k$o;-><init>(Ll8/c;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/r2;->b:Lio/flutter/plugins/webviewflutter/i2;

    return-void
.end method

.method private i(Landroid/webkit/WebChromeClient;)J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/r2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not find identifier for WebChromeClient."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public h(Landroid/webkit/WebChromeClient;Lio/flutter/plugins/webviewflutter/k$o$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebChromeClient;",
            "Lio/flutter/plugins/webviewflutter/k$o$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/r2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/r2;->i(Landroid/webkit/WebChromeClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/k$o;->c(Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$o$a;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugins/webviewflutter/k$o$a;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public j(Landroid/webkit/WebChromeClient;Landroid/webkit/WebView;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$o$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebChromeClient;",
            "Landroid/webkit/WebView;",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/webviewflutter/k$o$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/r2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p2}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/r2;->i(Landroid/webkit/WebChromeClient;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-super {p0, p1, p2, p3, p4}, Lio/flutter/plugins/webviewflutter/k$o;->g(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$o$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not find identifier for WebView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
