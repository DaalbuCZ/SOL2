.class public final synthetic Lio/flutter/plugins/webviewflutter/l2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugins/webviewflutter/m2;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/l2;->n:Lio/flutter/plugins/webviewflutter/m2;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/l2;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/l2;->n:Lio/flutter/plugins/webviewflutter/m2;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/l2;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lio/flutter/plugins/webviewflutter/m2;->c(Lio/flutter/plugins/webviewflutter/m2;Ljava/lang/String;)V

    return-void
.end method
