.class public Lio/flutter/plugins/webviewflutter/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/e$a;,
        Lio/flutter/plugins/webviewflutter/e$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/plugins/webviewflutter/i2;

.field private final b:Lio/flutter/plugins/webviewflutter/e$a;

.field private final c:Lio/flutter/plugins/webviewflutter/d;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/e$a;Lio/flutter/plugins/webviewflutter/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/e;->a:Lio/flutter/plugins/webviewflutter/i2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/e;->b:Lio/flutter/plugins/webviewflutter/e$a;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/e;->c:Lio/flutter/plugins/webviewflutter/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/e;->b:Lio/flutter/plugins/webviewflutter/e$a;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/e;->c:Lio/flutter/plugins/webviewflutter/d;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/e$a;->a(Lio/flutter/plugins/webviewflutter/d;)Lio/flutter/plugins/webviewflutter/e$b;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/e;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lio/flutter/plugins/webviewflutter/i2;->b(Ljava/lang/Object;J)V

    return-void
.end method
