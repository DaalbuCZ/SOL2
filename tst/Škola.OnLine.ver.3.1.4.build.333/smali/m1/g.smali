.class public abstract Lm1/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lm1/g;
    .locals 4

    new-instance v0, Lm1/b;

    sget-object v1, Lm1/g$a;->p:Lm1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lm1/b;-><init>(Lm1/g$a;J)V

    return-object v0
.end method

.method public static d()Lm1/g;
    .locals 4

    new-instance v0, Lm1/b;

    sget-object v1, Lm1/g$a;->q:Lm1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lm1/b;-><init>(Lm1/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lm1/g;
    .locals 2

    new-instance v0, Lm1/b;

    sget-object v1, Lm1/g$a;->n:Lm1/g$a;

    invoke-direct {v0, v1, p0, p1}, Lm1/b;-><init>(Lm1/g$a;J)V

    return-object v0
.end method

.method public static f()Lm1/g;
    .locals 4

    new-instance v0, Lm1/b;

    sget-object v1, Lm1/g$a;->o:Lm1/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lm1/b;-><init>(Lm1/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lm1/g$a;
.end method
