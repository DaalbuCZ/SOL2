.class public Lio/flutter/plugins/webviewflutter/s2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/s2$a;,
        Lio/flutter/plugins/webviewflutter/s2$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/plugins/webviewflutter/i2;

.field private final b:Lio/flutter/plugins/webviewflutter/s2$a;

.field private final c:Lio/flutter/plugins/webviewflutter/r2;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/s2$a;Lio/flutter/plugins/webviewflutter/r2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/s2;->a:Lio/flutter/plugins/webviewflutter/i2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/s2;->b:Lio/flutter/plugins/webviewflutter/s2$a;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/s2;->c:Lio/flutter/plugins/webviewflutter/r2;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/s2;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->h(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebViewClient;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/s2;->b:Lio/flutter/plugins/webviewflutter/s2$a;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/s2;->c:Lio/flutter/plugins/webviewflutter/r2;

    invoke-virtual {v0, v1, p2}, Lio/flutter/plugins/webviewflutter/s2$a;->a(Lio/flutter/plugins/webviewflutter/r2;Landroid/webkit/WebViewClient;)Lio/flutter/plugins/webviewflutter/s2$b;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/s2;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->b(Ljava/lang/Object;J)V

    return-void
.end method
