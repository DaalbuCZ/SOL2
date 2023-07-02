.class public Lio/flutter/plugins/webviewflutter/q3$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/view/View;)Lio/flutter/plugins/webviewflutter/q3$a;
    .locals 1

    new-instance v0, Lio/flutter/plugins/webviewflutter/q3$a;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/q3$a;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-object v0
.end method

.method public b(Landroid/content/Context;)Lio/flutter/plugins/webviewflutter/q3$c;
    .locals 1

    new-instance v0, Lio/flutter/plugins/webviewflutter/q3$c;

    invoke-direct {v0, p1}, Lio/flutter/plugins/webviewflutter/q3$c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public c(Z)V
    .locals 0

    invoke-static {p1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    return-void
.end method
