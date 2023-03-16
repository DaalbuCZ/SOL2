.class public Lio/flutter/plugins/webviewflutter/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/k$w;,
        Lio/flutter/plugins/webviewflutter/k$x;,
        Lio/flutter/plugins/webviewflutter/k$o;,
        Lio/flutter/plugins/webviewflutter/k$p;,
        Lio/flutter/plugins/webviewflutter/k$h;,
        Lio/flutter/plugins/webviewflutter/k$i;,
        Lio/flutter/plugins/webviewflutter/k$q;,
        Lio/flutter/plugins/webviewflutter/k$r;,
        Lio/flutter/plugins/webviewflutter/k$d;,
        Lio/flutter/plugins/webviewflutter/k$e;,
        Lio/flutter/plugins/webviewflutter/k$f;,
        Lio/flutter/plugins/webviewflutter/k$g;,
        Lio/flutter/plugins/webviewflutter/k$y;,
        Lio/flutter/plugins/webviewflutter/k$z;,
        Lio/flutter/plugins/webviewflutter/k$a0;,
        Lio/flutter/plugins/webviewflutter/k$b0;,
        Lio/flutter/plugins/webviewflutter/k$j;,
        Lio/flutter/plugins/webviewflutter/k$k;,
        Lio/flutter/plugins/webviewflutter/k$l;,
        Lio/flutter/plugins/webviewflutter/k$m;,
        Lio/flutter/plugins/webviewflutter/k$u;,
        Lio/flutter/plugins/webviewflutter/k$v;,
        Lio/flutter/plugins/webviewflutter/k$c0;,
        Lio/flutter/plugins/webviewflutter/k$d0;,
        Lio/flutter/plugins/webviewflutter/k$b;,
        Lio/flutter/plugins/webviewflutter/k$c;,
        Lio/flutter/plugins/webviewflutter/k$n;,
        Lio/flutter/plugins/webviewflutter/k$e0;,
        Lio/flutter/plugins/webviewflutter/k$s;,
        Lio/flutter/plugins/webviewflutter/k$t;
    }
.end annotation


# direct methods
.method static synthetic a(Ljava/lang/Throwable;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/k;->b(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/Throwable;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "message"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Stacktrace: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "details"

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
