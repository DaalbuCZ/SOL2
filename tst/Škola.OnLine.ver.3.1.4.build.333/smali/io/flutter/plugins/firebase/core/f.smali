.class public final synthetic Lio/flutter/plugins/firebase/core/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/Boolean;

.field public final synthetic p:Ly4/j;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ly4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/f;->n:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/f;->o:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/f;->p:Ly4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/f;->n:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/f;->o:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/f;->p:Ly4/j;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/core/i;->m(Ljava/lang/String;Ljava/lang/Boolean;Ly4/j;)V

    return-void
.end method
