.class public Ld1/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/i2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/i2<",
        "Ld1/n0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ld1/s2;


# direct methods
.method public constructor <init>(Ld1/s2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/b2;->a:Ld1/s2;

    return-void
.end method


# virtual methods
.method public a()Ld1/z2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/z2<",
            "Ld1/n0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/b2;->a:Ld1/s2;

    invoke-interface {v0}, Ld1/s2;->i()Ld1/z2;

    move-result-object v0

    return-object v0
.end method
