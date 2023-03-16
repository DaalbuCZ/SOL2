.class public Ll5/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll5/i$a;
    }
.end annotation


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ll5/i$a;->n:Ll5/i$a;

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Ll5/j;

    invoke-direct {v0, p0}, Ll5/j;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
