.class public Lu1/z$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/z$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field private final a:[Lu1/g;

.field private final b:Lu1/h0;

.field private final c:Lu1/j0;


# direct methods
.method public varargs constructor <init>([Lu1/g;)V
    .locals 2

    new-instance v0, Lu1/h0;

    invoke-direct {v0}, Lu1/h0;-><init>()V

    new-instance v1, Lu1/j0;

    invoke-direct {v1}, Lu1/j0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lu1/z$g;-><init>([Lu1/g;Lu1/h0;Lu1/j0;)V

    return-void
.end method

.method public constructor <init>([Lu1/g;Lu1/h0;Lu1/j0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lu1/g;

    iput-object v0, p0, Lu1/z$g;->a:[Lu1/g;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lu1/z$g;->b:Lu1/h0;

    iput-object p3, p0, Lu1/z$g;->c:Lu1/j0;

    array-length v1, p1

    aput-object p2, v0, v1

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lu1/z$g;->b:Lu1/h0;

    invoke-virtual {v0}, Lu1/h0;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Z)Z
    .locals 1

    iget-object v0, p0, Lu1/z$g;->b:Lu1/h0;

    invoke-virtual {v0, p1}, Lu1/h0;->w(Z)V

    return p1
.end method

.method public c(J)J
    .locals 1

    iget-object v0, p0, Lu1/z$g;->c:Lu1/j0;

    invoke-virtual {v0, p1, p2}, Lu1/j0;->h(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d()[Lu1/g;
    .locals 1

    iget-object v0, p0, Lu1/z$g;->a:[Lu1/g;

    return-object v0
.end method

.method public e(Ls1/o2;)Ls1/o2;
    .locals 2

    iget-object v0, p0, Lu1/z$g;->c:Lu1/j0;

    iget v1, p1, Ls1/o2;->n:F

    invoke-virtual {v0, v1}, Lu1/j0;->j(F)V

    iget-object v0, p0, Lu1/z$g;->c:Lu1/j0;

    iget v1, p1, Ls1/o2;->o:F

    invoke-virtual {v0, v1}, Lu1/j0;->i(F)V

    return-object p1
.end method
