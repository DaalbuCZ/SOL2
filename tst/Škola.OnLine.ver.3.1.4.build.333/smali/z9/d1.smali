.class public final Lz9/d1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a()Lz9/a1;
    .locals 2

    new-instance v0, Lz9/f;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lz9/f;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
