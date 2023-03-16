.class public abstract Ld9/k;
.super Ld9/d;
.source ""

# interfaces
.implements Lk9/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9/d;",
        "Lk9/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final q:I


# direct methods
.method public constructor <init>(ILb9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lb9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Ld9/d;-><init>(Lb9/d;)V

    iput p1, p0, Ld9/k;->q:I

    return-void
.end method


# virtual methods
.method public f()I
    .locals 1

    iget v0, p0, Ld9/k;->q:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ld9/a;->p()Lb9/d;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lk9/s;->e(Lk9/h;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, Lk9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ld9/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
