.class public Lio/flutter/plugins/webviewflutter/y2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/y2$c;,
        Lio/flutter/plugins/webviewflutter/y2$b;,
        Lio/flutter/plugins/webviewflutter/y2$d;,
        Lio/flutter/plugins/webviewflutter/y2$a;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/plugins/webviewflutter/i2;

.field private final b:Lio/flutter/plugins/webviewflutter/y2$c;

.field private final c:Lio/flutter/plugins/webviewflutter/x2;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/y2$c;Lio/flutter/plugins/webviewflutter/x2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/y2;->a:Lio/flutter/plugins/webviewflutter/i2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/y2;->b:Lio/flutter/plugins/webviewflutter/y2$c;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/y2;->c:Lio/flutter/plugins/webviewflutter/x2;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2;->b:Lio/flutter/plugins/webviewflutter/y2$c;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/y2;->c:Lio/flutter/plugins/webviewflutter/x2;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, v1, p2}, Lio/flutter/plugins/webviewflutter/y2$c;->a(Lio/flutter/plugins/webviewflutter/x2;Z)Landroid/webkit/WebViewClient;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->b(Ljava/lang/Object;J)V

    return-void
.end method
