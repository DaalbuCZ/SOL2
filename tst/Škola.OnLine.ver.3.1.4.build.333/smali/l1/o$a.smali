.class public abstract Ll1/o$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ll1/o;
.end method

.method abstract b(Lj1/b;)Ll1/o$a;
.end method

.method abstract c(Lj1/c;)Ll1/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/c<",
            "*>;)",
            "Ll1/o$a;"
        }
    .end annotation
.end method

.method abstract d(Lj1/e;)Ll1/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/e<",
            "*[B>;)",
            "Ll1/o$a;"
        }
    .end annotation
.end method

.method public abstract e(Ll1/p;)Ll1/o$a;
.end method

.method public abstract f(Ljava/lang/String;)Ll1/o$a;
.end method
