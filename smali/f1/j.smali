.class public abstract Lf1/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lf1/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf1/m;",
            ">;)",
            "Lf1/j;"
        }
    .end annotation

    new-instance v0, Lf1/d;

    invoke-direct {v0, p0}, Lf1/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lb6/a;
    .locals 2

    new-instance v0, Ld6/d;

    invoke-direct {v0}, Ld6/d;-><init>()V

    sget-object v1, Lf1/b;->a:Lc6/a;

    invoke-virtual {v0, v1}, Ld6/d;->j(Lc6/a;)Ld6/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ld6/d;->k(Z)Ld6/d;

    move-result-object v0

    invoke-virtual {v0}, Ld6/d;->i()Lb6/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lf1/m;",
            ">;"
        }
    .end annotation
.end method
