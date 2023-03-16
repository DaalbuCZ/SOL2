.class public final synthetic Lp8/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lio/flutter/plugins/firebase/messaging/e;

.field public final synthetic o:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/messaging/e;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/k;->n:Lio/flutter/plugins/firebase/messaging/e;

    iput-object p2, p0, Lp8/k;->o:Lt4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp8/k;->n:Lio/flutter/plugins/firebase/messaging/e;

    iget-object v1, p0, Lp8/k;->o:Lt4/j;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/messaging/e;->g(Lio/flutter/plugins/firebase/messaging/e;Lt4/j;)V

    return-void
.end method
