.class public final Lio/flutter/plugins/webviewflutter/k$s$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/k$s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/flutter/plugins/webviewflutter/k$s;
    .locals 2

    new-instance v0, Lio/flutter/plugins/webviewflutter/k$s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/webviewflutter/k$s;-><init>(Lio/flutter/plugins/webviewflutter/k$a;)V

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/k$s$a;->a:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$s;->c(Ljava/lang/Long;)V

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/k$s$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/k$s;->b(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lio/flutter/plugins/webviewflutter/k$s$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/k$s$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/Long;)Lio/flutter/plugins/webviewflutter/k$s$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/k$s$a;->a:Ljava/lang/Long;

    return-object p0
.end method
