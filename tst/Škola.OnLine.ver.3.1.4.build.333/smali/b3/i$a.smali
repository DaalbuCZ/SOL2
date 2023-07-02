.class public final Lb3/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/n0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final n:Lb3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final o:Lz2/m0;

.field private final p:I

.field private q:Z

.field final synthetic r:Lb3/i;


# direct methods
.method public constructor <init>(Lb3/i;Lb3/i;Lz2/m0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/i<",
            "TT;>;",
            "Lz2/m0;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lb3/i$a;->r:Lb3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb3/i$a;->n:Lb3/i;

    iput-object p3, p0, Lb3/i$a;->o:Lz2/m0;

    iput p4, p0, Lb3/i$a;->p:I

    return-void
.end method

.method private a()V
    .locals 8

    iget-boolean v0, p0, Lb3/i$a;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->A(Lb3/i;)Lz2/b0$a;

    move-result-object v1

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->x(Lb3/i;)[I

    move-result-object v0

    iget v2, p0, Lb3/i$a;->p:I

    aget v2, v0, v2

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->y(Lb3/i;)[Lx1/n1;

    move-result-object v0

    iget v3, p0, Lb3/i$a;->p:I

    aget-object v3, v0, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->z(Lb3/i;)J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lz2/b0$a;->i(ILx1/n1;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb3/i$a;->q:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->w(Lb3/i;)[Z

    move-result-object v0

    iget v1, p0, Lb3/i$a;->p:I

    aget-boolean v0, v0, v1

    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->w(Lb3/i;)[Z

    move-result-object v0

    iget v1, p0, Lb3/i$a;->p:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    return-void
.end method

.method public d(J)I
    .locals 2

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-virtual {v0}, Lb3/i;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lb3/i$a;->o:Lz2/m0;

    iget-object v1, p0, Lb3/i$a;->r:Lb3/i;

    iget-boolean v1, v1, Lb3/i;->J:Z

    invoke-virtual {v0, p1, p2, v1}, Lz2/m0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {p2}, Lb3/i;->v(Lb3/i;)Lb3/a;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {p2}, Lb3/i;->v(Lb3/i;)Lb3/a;

    move-result-object p2

    iget v0, p0, Lb3/i$a;->p:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, Lb3/a;->i(I)I

    move-result p2

    iget-object v0, p0, Lb3/i$a;->o:Lz2/m0;

    invoke-virtual {v0}, Lz2/m0;->C()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_1
    iget-object p2, p0, Lb3/i$a;->o:Lz2/m0;

    invoke-virtual {p2, p1}, Lz2/m0;->e0(I)V

    if-lez p1, :cond_2

    invoke-direct {p0}, Lb3/i$a;->a()V

    :cond_2
    return p1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-virtual {v0}, Lb3/i;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/i$a;->o:Lz2/m0;

    iget-object v1, p0, Lb3/i$a;->r:Lb3/i;

    iget-boolean v1, v1, Lb3/i;->J:Z

    invoke-virtual {v0, v1}, Lz2/m0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(Lx1/o1;La2/g;I)I
    .locals 3

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-virtual {v0}, Lb3/i;->I()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->v(Lb3/i;)Lb3/a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/i$a;->r:Lb3/i;

    invoke-static {v0}, Lb3/i;->v(Lb3/i;)Lb3/a;

    move-result-object v0

    iget v2, p0, Lb3/i$a;->p:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v2}, Lb3/a;->i(I)I

    move-result v0

    iget-object v2, p0, Lb3/i$a;->o:Lz2/m0;

    invoke-virtual {v2}, Lz2/m0;->C()I

    move-result v2

    if-gt v0, v2, :cond_1

    return v1

    :cond_1
    invoke-direct {p0}, Lb3/i$a;->a()V

    iget-object v0, p0, Lb3/i$a;->o:Lz2/m0;

    iget-object v1, p0, Lb3/i$a;->r:Lb3/i;

    iget-boolean v1, v1, Lb3/i;->J:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lz2/m0;->S(Lx1/o1;La2/g;IZ)I

    move-result p1

    return p1
.end method
