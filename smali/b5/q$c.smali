.class Lb5/q$c;
.super Lb5/q;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb5/q<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient p:I

.field final transient q:I

.field final synthetic r:Lb5/q;


# direct methods
.method constructor <init>(Lb5/q;II)V
    .locals 0

    iput-object p1, p0, Lb5/q$c;->r:Lb5/q;

    invoke-direct {p0}, Lb5/q;-><init>()V

    iput p2, p0, Lb5/q$c;->p:I

    iput p3, p0, Lb5/q$c;->q:I

    return-void
.end method


# virtual methods
.method public N(II)Lb5/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lb5/q<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lb5/q$c;->q:I

    invoke-static {p1, p2, v0}, La5/j;->m(III)V

    iget-object v0, p0, Lb5/q$c;->r:Lb5/q;

    iget v1, p0, Lb5/q$c;->p:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lb5/q;->N(II)Lb5/q;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lb5/q$c;->q:I

    invoke-static {p1, v0}, La5/j;->g(II)I

    iget-object v0, p0, Lb5/q$c;->r:Lb5/q;

    iget v1, p0, Lb5/q$c;->p:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h()[Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lb5/q$c;->r:Lb5/q;

    invoke-virtual {v0}, Lb5/o;->h()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lb5/q;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method

.method k()I
    .locals 2

    iget-object v0, p0, Lb5/q$c;->r:Lb5/q;

    invoke-virtual {v0}, Lb5/o;->l()I

    move-result v0

    iget v1, p0, Lb5/q$c;->p:I

    add-int/2addr v0, v1

    iget v1, p0, Lb5/q$c;->q:I

    add-int/2addr v0, v1

    return v0
.end method

.method l()I
    .locals 2

    iget-object v0, p0, Lb5/q$c;->r:Lb5/q;

    invoke-virtual {v0}, Lb5/o;->l()I

    move-result v0

    iget v1, p0, Lb5/q$c;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, Lb5/q;->H()Lb5/t0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, Lb5/q;->I(I)Lb5/t0;

    move-result-object p1

    return-object p1
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lb5/q$c;->q:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb5/q$c;->N(II)Lb5/q;

    move-result-object p1

    return-object p1
.end method
