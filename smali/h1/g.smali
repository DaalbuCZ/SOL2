.class public abstract Lh1/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh1/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lh1/g;
    .locals 4

    new-instance v0, Lh1/b;

    sget-object v1, Lh1/g$a;->p:Lh1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh1/b;-><init>(Lh1/g$a;J)V

    return-object v0
.end method

.method public static d()Lh1/g;
    .locals 4

    new-instance v0, Lh1/b;

    sget-object v1, Lh1/g$a;->q:Lh1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh1/b;-><init>(Lh1/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lh1/g;
    .locals 2

    new-instance v0, Lh1/b;

    sget-object v1, Lh1/g$a;->n:Lh1/g$a;

    invoke-direct {v0, v1, p0, p1}, Lh1/b;-><init>(Lh1/g$a;J)V

    return-object v0
.end method

.method public static f()Lh1/g;
    .locals 4

    new-instance v0, Lh1/b;

    sget-object v1, Lh1/g$a;->o:Lh1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lh1/b;-><init>(Lh1/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lh1/g$a;
.end method
