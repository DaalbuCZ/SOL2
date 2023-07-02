.class public final synthetic Lio/flutter/plugins/firebase/core/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugins/firebase/core/i;

.field public final synthetic o:Lk5/e;

.field public final synthetic p:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/i;Lk5/e;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/b;->n:Lio/flutter/plugins/firebase/core/i;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/b;->o:Lk5/e;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/b;->p:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/b;->n:Lio/flutter/plugins/firebase/core/i;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/b;->o:Lk5/e;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/b;->p:Ly4/j;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/core/i;->n(Lio/flutter/plugins/firebase/core/i;Lk5/e;Ly4/j;)V

    return-void
.end method
