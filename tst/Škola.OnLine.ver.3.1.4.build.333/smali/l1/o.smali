.class abstract Ll1/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/o$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ll1/o$a;
    .locals 1

    new-instance v0, Ll1/c$b;

    invoke-direct {v0}, Ll1/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lj1/b;
.end method

.method abstract c()Lj1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/c<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Ll1/o;->e()Lj1/e;

    move-result-object v0

    invoke-virtual {p0}, Ll1/o;->c()Lj1/c;

    move-result-object v1

    invoke-virtual {v1}, Lj1/c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lj1/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method abstract e()Lj1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/e<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Ll1/p;
.end method

.method public abstract g()Ljava/lang/String;
.end method
