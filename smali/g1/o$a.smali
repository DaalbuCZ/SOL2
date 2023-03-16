.class public abstract Lg1/o$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/o;
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
.method public abstract a()Lg1/o;
.end method

.method abstract b(Le1/b;)Lg1/o$a;
.end method

.method abstract c(Le1/c;)Lg1/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/c<",
            "*>;)",
            "Lg1/o$a;"
        }
    .end annotation
.end method

.method abstract d(Le1/e;)Lg1/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le1/e<",
            "*[B>;)",
            "Lg1/o$a;"
        }
    .end annotation
.end method

.method public abstract e(Lg1/p;)Lg1/o$a;
.end method

.method public abstract f(Ljava/lang/String;)Lg1/o$a;
.end method
