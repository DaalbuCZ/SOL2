.class public abstract Lz4/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(I)Lz4/d;
    .locals 0

    invoke-static {p0}, Lz4/d;->d(I)Lz4/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lz4/d$a;->a()Lz4/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(I)Lz4/d$a;
    .locals 1

    new-instance v0, Lz4/a0;

    invoke-direct {v0}, Lz4/a0;-><init>()V

    invoke-virtual {v0, p0}, Lz4/a0;->c(I)Lz4/d$a;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Lz4/d$a;->b(Z)Lz4/d$a;

    return-object v0
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()I
.end method
