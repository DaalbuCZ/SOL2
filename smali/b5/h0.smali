.class public abstract Lb5/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lb5/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lb5/h0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lb5/h0;

    if-eqz v0, :cond_0

    check-cast p0, Lb5/h0;

    goto :goto_0

    :cond_0
    new-instance v0, Lb5/j;

    invoke-direct {v0, p0}, Lb5/j;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static b()Lb5/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lb5/h0<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, Lb5/e0;->n:Lb5/e0;

    return-object v0
.end method


# virtual methods
.method public c(La5/f;)Lb5/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "La5/f<",
            "TF;+TT;>;)",
            "Lb5/h0<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lb5/g;

    invoke-direct {v0, p1, p0}, Lb5/g;-><init>(La5/f;Lb5/h0;)V

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method public d()Lb5/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lb5/h0<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, Lb5/n0;

    invoke-direct {v0, p0}, Lb5/n0;-><init>(Lb5/h0;)V

    return-object v0
.end method
