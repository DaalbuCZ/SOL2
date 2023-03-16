.class public abstract Ls5/b0$e$d$a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/b0$e$d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b0$e$d$a$b$b;,
        Ls5/b0$e$d$a$b$a;,
        Ls5/b0$e$d$a$b$d;,
        Ls5/b0$e$d$a$b$c;,
        Ls5/b0$e$d$a$b$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ls5/b0$e$d$a$b$b;
    .locals 1

    new-instance v0, Ls5/n$b;

    invoke-direct {v0}, Ls5/n$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls5/b0$a;
.end method

.method public abstract c()Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Ls5/b0$e$d$a$b$c;
.end method

.method public abstract e()Ls5/b0$e$d$a$b$d;
.end method

.method public abstract f()Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$e;",
            ">;"
        }
    .end annotation
.end method
