.class public final synthetic Lio/flutter/plugins/firebase/core/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugins/firebase/core/i;

.field public final synthetic o:Lio/flutter/plugins/firebase/core/l$f;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/b;->n:Lio/flutter/plugins/firebase/core/i;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/b;->o:Lio/flutter/plugins/firebase/core/l$f;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/b;->p:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/firebase/core/b;->q:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/b;->n:Lio/flutter/plugins/firebase/core/i;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/b;->o:Lio/flutter/plugins/firebase/core/l$f;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/b;->p:Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/firebase/core/b;->q:Lt4/j;

    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugins/firebase/core/i;->h(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lt4/j;)V

    return-void
.end method