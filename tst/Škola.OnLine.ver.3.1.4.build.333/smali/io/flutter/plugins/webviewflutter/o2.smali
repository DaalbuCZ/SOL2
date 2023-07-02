.class public Lio/flutter/plugins/webviewflutter/o2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/webviewflutter/k$l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/o2$a;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/plugins/webviewflutter/i2;

.field private final b:Lio/flutter/plugins/webviewflutter/o2$a;

.field private final c:Lio/flutter/plugins/webviewflutter/n2;

.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/o2$a;Lio/flutter/plugins/webviewflutter/n2;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/o2;->a:Lio/flutter/plugins/webviewflutter/i2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/o2;->b:Lio/flutter/plugins/webviewflutter/o2$a;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/o2;->c:Lio/flutter/plugins/webviewflutter/n2;

    iput-object p4, p0, Lio/flutter/plugins/webviewflutter/o2;->d:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o2;->b:Lio/flutter/plugins/webviewflutter/o2$a;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/o2;->c:Lio/flutter/plugins/webviewflutter/n2;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/o2;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1, p2, v2}, Lio/flutter/plugins/webviewflutter/o2$a;->a(Lio/flutter/plugins/webviewflutter/n2;Ljava/lang/String;Landroid/os/Handler;)Lio/flutter/plugins/webviewflutter/m2;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o2;->a:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Lio/flutter/plugins/webviewflutter/i2;->b(Ljava/lang/Object;J)V

    return-void
.end method

.method public b(Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/o2;->d:Landroid/os/Handler;

    return-void
.end method
