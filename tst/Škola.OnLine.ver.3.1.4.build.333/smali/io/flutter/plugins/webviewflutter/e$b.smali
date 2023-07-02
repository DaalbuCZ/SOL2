.class public Lio/flutter/plugins/webviewflutter/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/webkit/DownloadListener;
.implements Lio/flutter/plugins/webviewflutter/p2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private n:Lio/flutter/plugins/webviewflutter/d;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/e$b;->n:Lio/flutter/plugins/webviewflutter/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/e$b;->e(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/e$b;->d(Ljava/lang/Void;)V

    return-void
.end method

.method private static synthetic d(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic e(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/e$b;->n:Lio/flutter/plugins/webviewflutter/d;

    if-eqz v0, :cond_0

    sget-object v1, Lio/flutter/plugins/webviewflutter/f;->a:Lio/flutter/plugins/webviewflutter/f;

    invoke-virtual {v0, p0, v1}, Lio/flutter/plugins/webviewflutter/d;->h(Landroid/webkit/DownloadListener;Lio/flutter/plugins/webviewflutter/k$d$a;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/e$b;->n:Lio/flutter/plugins/webviewflutter/d;

    return-void
.end method

.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 9

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/e$b;->n:Lio/flutter/plugins/webviewflutter/d;

    if-eqz v0, :cond_0

    sget-object v8, Lio/flutter/plugins/webviewflutter/g;->a:Lio/flutter/plugins/webviewflutter/g;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    invoke-virtual/range {v0 .. v8}, Lio/flutter/plugins/webviewflutter/d;->j(Landroid/webkit/DownloadListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLio/flutter/plugins/webviewflutter/k$d$a;)V

    :cond_0
    return-void
.end method
