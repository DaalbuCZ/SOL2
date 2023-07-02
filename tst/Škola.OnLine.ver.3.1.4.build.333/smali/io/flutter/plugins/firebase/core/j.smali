.class public final synthetic Lio/flutter/plugins/firebase/core/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lk5/e;

.field public final synthetic o:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Lk5/e;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/j;->n:Lk5/e;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/j;->o:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/j;->n:Lk5/e;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/j;->o:Ly4/j;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->a(Lk5/e;Ly4/j;)V

    return-void
.end method
