.class public final Ld1/m2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/m0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/m0<",
        "Ld1/j2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld1/j2;)Ld1/v0;
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Ld1/j2;->a()I

    move-result v0

    const/16 v1, -0x3ef

    if-eq v0, v1, :cond_1

    const/16 v1, -0x3ec

    if-eq v0, v1, :cond_0

    new-instance v0, Ld1/k1;

    invoke-direct {v0, p1}, Ld1/k1;-><init>(Ld1/j2;)V

    return-object v0

    :cond_0
    new-instance v0, Ld1/q0;

    invoke-virtual {p1}, Ld1/j2;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ld1/q0;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ld1/f1;

    invoke-virtual {p1}, Ld1/j2;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ld1/f1;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ld1/o1;

    invoke-direct {v0, p1}, Ld1/o1;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public bridge synthetic of(Ljava/lang/Object;)Ld1/v0;
    .locals 0

    check-cast p1, Ld1/j2;

    invoke-virtual {p0, p1}, Ld1/m2;->a(Ld1/j2;)Ld1/v0;

    move-result-object p1

    return-object p1
.end method
