.class public Lio/flutter/plugins/webviewflutter/k$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/k$j$a;
    }
.end annotation


# instance fields
.field private final a:Ll8/c;


# direct methods
.method public constructor <init>(Ll8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/k$j;->a:Ll8/c;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/k$j;->f(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/k$j;->e(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V

    return-void
.end method

.method static d()Ll8/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/webviewflutter/k$k;->d:Lio/flutter/plugins/webviewflutter/k$k;

    return-object v0
.end method

.method private static synthetic e(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$j$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic f(Lio/flutter/plugins/webviewflutter/k$j$a;Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Lio/flutter/plugins/webviewflutter/k$j$a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/k$j$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Lio/flutter/plugins/webviewflutter/k$j$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ll8/a;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/k$j;->a:Ll8/c;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/k$j;->d()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.dispose"

    invoke-direct {v0, v1, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Long;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lio/flutter/plugins/webviewflutter/w;

    invoke-direct {p1, p2}, Lio/flutter/plugins/webviewflutter/w;-><init>(Lio/flutter/plugins/webviewflutter/k$j$a;)V

    invoke-virtual {v0, v1, p1}, Ll8/a;->d(Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method

.method public g(Ljava/lang/Long;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/k$j$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/webviewflutter/k$j$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ll8/a;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/k$j;->a:Ll8/c;

    invoke-static {}, Lio/flutter/plugins/webviewflutter/k$j;->d()Ll8/i;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.JavaScriptChannelFlutterApi.postMessage"

    invoke-direct {v0, v1, v3, v2}, Ll8/a;-><init>(Ll8/c;Ljava/lang/String;Ll8/i;)V

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/io/Serializable;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lio/flutter/plugins/webviewflutter/v;

    invoke-direct {p1, p3}, Lio/flutter/plugins/webviewflutter/v;-><init>(Lio/flutter/plugins/webviewflutter/k$j$a;)V

    invoke-virtual {v0, v1, p1}, Ll8/a;->d(Ljava/lang/Object;Ll8/a$e;)V

    return-void
.end method
