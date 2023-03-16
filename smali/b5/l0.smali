.class final Lb5/l0;
.super Lb5/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lb5/s<",
        "TE;>;"
    }
.end annotation


# static fields
.field private static final u:[Ljava/lang/Object;

.field static final v:Lb5/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/l0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient p:[Ljava/lang/Object;

.field private final transient q:I

.field final transient r:[Ljava/lang/Object;

.field private final transient s:I

.field private final transient t:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, Lb5/l0;->u:[Ljava/lang/Object;

    new-instance v0, Lb5/l0;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Lb5/l0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Lb5/l0;->v:Lb5/l0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lb5/s;-><init>()V

    iput-object p1, p0, Lb5/l0;->p:[Ljava/lang/Object;

    iput p2, p0, Lb5/l0;->q:I

    iput-object p3, p0, Lb5/l0;->r:[Ljava/lang/Object;

    iput p4, p0, Lb5/l0;->s:I

    iput p5, p0, Lb5/l0;->t:I

    return-void
.end method


# virtual methods
.method F()Lb5/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/q<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lb5/l0;->p:[Ljava/lang/Object;

    iget v1, p0, Lb5/l0;->t:I

    invoke-static {v0, v1}, Lb5/q;->C([Ljava/lang/Object;I)Lb5/q;

    move-result-object v0

    return-object v0
.end method

.method G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lb5/l0;->r:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lb5/n;->b(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lb5/l0;->s:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method g([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lb5/l0;->p:[Ljava/lang/Object;

    iget v1, p0, Lb5/l0;->t:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lb5/l0;->t:I

    add-int/2addr p2, p1

    return p2
.end method

.method h()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb5/l0;->p:[Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lb5/l0;->q:I

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lb5/l0;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method

.method k()I
    .locals 1

    iget v0, p0, Lb5/l0;->t:I

    return v0
.end method

.method l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lb5/l0;->t:I

    return v0
.end method

.method public v()Lb5/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/s0<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lb5/s;->d()Lb5/q;

    move-result-object v0

    invoke-virtual {v0}, Lb5/q;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method
