.class public Lio/flutter/plugins/webviewflutter/n2;
.super Lio/flutter/plugins/webviewflutter/k$j;
.source ""


# instance fields
.field private final b:Lio/flutter/plugins/webviewflutter/i2;


# direct methods
.method public constructor <init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/k$j;-><init>(Ll8/c;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/n2;->b:Lio/flutter/plugins/webviewflutter/i2;

    return-void
.end method

.method private i(Lio/flutter/plugins/webviewflutter/m2;)J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/n2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->g(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not find identifier for JavaScriptChannel."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public h(Lio/flutter/plugins/webviewflutter/m2;Lio/flutter/plugins/webviewflutter/k$j$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/m2;",
            "Lio/flutter/plugins/webviewflutter/k$j$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/n2;->b:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/i2;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/n2;->i(Lio/flutter/plugins/webviewflutter/m2;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/k$j;->c(Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$j$a;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugins/webviewflutter/k$j$a;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public j(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$j$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugins/webviewflutter/m2;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$j$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/n2;->i(Lio/flutter/plugins/webviewflutter/m2;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-super {p0, p1, p2, p3}, Lio/flutter/plugins/webviewflutter/k$j;->g(Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$j$a;)V

    return-void
.end method
