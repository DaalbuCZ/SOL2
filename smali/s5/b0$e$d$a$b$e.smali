.class public abstract Ls5/b0$e$d$a$b$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/b0$e$d$a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b0$e$d$a$b$e$a;,
        Ls5/b0$e$d$a$b$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ls5/b0$e$d$a$b$e$a;
    .locals 1

    new-instance v0, Ls5/r$b;

    invoke-direct {v0}, Ls5/r$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()I
.end method

.method public abstract d()Ljava/lang/String;
.end method
