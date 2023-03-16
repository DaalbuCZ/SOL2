.class public abstract Ls5/b0$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/b0$d$a;,
        Ls5/b0$d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ls5/b0$d$a;
    .locals 1

    new-instance v0, Ls5/f$b;

    invoke-direct {v0}, Ls5/f$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ls5/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls5/c0<",
            "Ls5/b0$d$b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Ljava/lang/String;
.end method
