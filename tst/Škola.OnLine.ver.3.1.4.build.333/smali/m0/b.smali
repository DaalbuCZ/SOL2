.class public Lm0/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/webkit/WebMessagePort;)V
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebMessagePort;->close()V

    return-void
.end method

.method public static b(Ll0/c;)Landroid/webkit/WebMessage;
    .locals 2

    new-instance v0, Landroid/webkit/WebMessage;

    invoke-virtual {p0}, Ll0/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll0/c;->b()[Ll0/d;

    move-result-object p0

    invoke-static {p0}, Lm0/h;->b([Ll0/d;)[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/webkit/WebMessage;-><init>(Ljava/lang/String;[Landroid/webkit/WebMessagePort;)V

    return-object v0
.end method

.method public static c(Landroid/webkit/WebView;)[Landroid/webkit/WebMessagePort;
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebView;->createWebMessageChannel()[Landroid/webkit/WebMessagePort;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/webkit/WebMessage;)Ll0/c;
    .locals 2

    new-instance v0, Ll0/c;

    invoke-virtual {p0}, Landroid/webkit/WebMessage;->getData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/webkit/WebMessage;->getPorts()[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-static {p0}, Lm0/h;->e([Landroid/webkit/WebMessagePort;)[Ll0/d;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll0/c;-><init>(Ljava/lang/String;[Ll0/d;)V

    return-object v0
.end method

.method public static e(Landroid/webkit/WebResourceError;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/webkit/WebResourceError;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result p0

    return p0
.end method

.method public static g(Landroid/webkit/WebSettings;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebSettings;->getOffscreenPreRaster()Z

    move-result p0

    return p0
.end method

.method public static h(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/WebMessagePort;->postMessage(Landroid/webkit/WebMessage;)V

    return-void
.end method

.method public static i(Landroid/webkit/WebView;JLl0/f;)V
    .locals 1

    new-instance v0, Lm0/b$c;

    invoke-direct {v0, p3}, Lm0/b$c;-><init>(Ll0/f;)V

    invoke-virtual {p0, p1, p2, v0}, Landroid/webkit/WebView;->postVisualStateCallback(JLandroid/webkit/WebView$VisualStateCallback;)V

    return-void
.end method

.method public static j(Landroid/webkit/WebView;Landroid/webkit/WebMessage;Landroid/net/Uri;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/webkit/WebView;->postWebMessage(Landroid/webkit/WebMessage;Landroid/net/Uri;)V

    return-void
.end method

.method public static k(Landroid/webkit/WebSettings;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/WebSettings;->setOffscreenPreRaster(Z)V

    return-void
.end method

.method public static l(Landroid/webkit/WebMessagePort;Ll0/d$a;)V
    .locals 1

    new-instance v0, Lm0/b$a;

    invoke-direct {v0, p1}, Lm0/b$a;-><init>(Ll0/d$a;)V

    invoke-virtual {p0, v0}, Landroid/webkit/WebMessagePort;->setWebMessageCallback(Landroid/webkit/WebMessagePort$WebMessageCallback;)V

    return-void
.end method

.method public static m(Landroid/webkit/WebMessagePort;Ll0/d$a;Landroid/os/Handler;)V
    .locals 1

    new-instance v0, Lm0/b$b;

    invoke-direct {v0, p1}, Lm0/b$b;-><init>(Ll0/d$a;)V

    invoke-virtual {p0, v0, p2}, Landroid/webkit/WebMessagePort;->setWebMessageCallback(Landroid/webkit/WebMessagePort$WebMessageCallback;Landroid/os/Handler;)V

    return-void
.end method
