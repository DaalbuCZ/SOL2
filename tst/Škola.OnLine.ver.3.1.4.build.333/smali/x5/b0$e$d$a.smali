.class public abstract Lx5/b0$e$d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b0$e$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/b0$e$d$a$a;,
        Lx5/b0$e$d$a$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lx5/b0$e$d$a$a;
    .locals 1

    new-instance v0, Lx5/m$b;

    invoke-direct {v0}, Lx5/m$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/Boolean;
.end method

.method public abstract c()Lx5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx5/c0<",
            "Lx5/b0$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lx5/b0$e$d$a$b;
.end method

.method public abstract e()Lx5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx5/c0<",
            "Lx5/b0$c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()I
.end method

.method public abstract g()Lx5/b0$e$d$a$a;
.end method
