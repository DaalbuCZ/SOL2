.class public abstract Ll9/k;
.super Ll9/d;
.source ""

# interfaces
.implements Ls9/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/d;",
        "Ls9/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final q:I


# direct methods
.method public constructor <init>(ILj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lj9/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Ll9/d;-><init>(Lj9/d;)V

    iput p1, p0, Ll9/k;->q:I

    return-void
.end method


# virtual methods
.method public i()I
    .locals 1

    iget v0, p0, Ll9/k;->q:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ll9/a;->n()Lj9/d;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ls9/s;->e(Ls9/h;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ll9/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
