.class abstract Lg1/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/o$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lg1/o$a;
    .locals 1

    new-instance v0, Lg1/c$b;

    invoke-direct {v0}, Lg1/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Le1/b;
.end method

.method abstract c()Le1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le1/c<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Lg1/o;->e()Le1/e;

    move-result-object v0

    invoke-virtual {p0}, Lg1/o;->c()Le1/c;

    move-result-object v1

    invoke-virtual {v1}, Le1/c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Le1/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method abstract e()Le1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le1/e<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lg1/p;
.end method

.method public abstract g()Ljava/lang/String;
.end method
