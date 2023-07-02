.class public abstract Lx5/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/d0$b;,
        Lx5/d0$c;,
        Lx5/d0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lx5/d0$a;Lx5/d0$c;Lx5/d0$b;)Lx5/d0;
    .locals 1

    new-instance v0, Lx5/x;

    invoke-direct {v0, p0, p1, p2}, Lx5/x;-><init>(Lx5/d0$a;Lx5/d0$c;Lx5/d0$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lx5/d0$a;
.end method

.method public abstract c()Lx5/d0$b;
.end method

.method public abstract d()Lx5/d0$c;
.end method
