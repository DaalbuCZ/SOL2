.class public final Lr9/d1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a()Lr9/a1;
    .locals 2

    new-instance v0, Lr9/f;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lr9/f;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
