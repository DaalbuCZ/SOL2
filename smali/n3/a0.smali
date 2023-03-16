.class public Ln3/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/a0$a;
    }
.end annotation


# static fields
.field public static final N:Ln3/a0;

.field public static final O:Ln3/a0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final P:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ln3/a0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final A:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final B:I

.field public final C:I

.field public final D:I

.field public final E:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final G:I

.field public final H:I

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:Lb5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/r<",
            "Lu2/t0;",
            "Ln3/y;",
            ">;"
        }
    .end annotation
.end field

.field public final M:Lb5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/s<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:Z

.field public final y:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/a0$a;

    invoke-direct {v0}, Ln3/a0$a;-><init>()V

    invoke-virtual {v0}, Ln3/a0$a;->A()Ln3/a0;

    move-result-object v0

    sput-object v0, Ln3/a0;->N:Ln3/a0;

    sput-object v0, Ln3/a0;->O:Ln3/a0;

    sget-object v0, Ln3/z;->a:Ln3/z;

    sput-object v0, Ln3/a0;->P:Ls1/h$a;

    return-void
.end method

.method protected constructor <init>(Ln3/a0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln3/a0$a;->a(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->n:I

    invoke-static {p1}, Ln3/a0$a;->b(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->o:I

    invoke-static {p1}, Ln3/a0$a;->m(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->p:I

    invoke-static {p1}, Ln3/a0$a;->t(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->q:I

    invoke-static {p1}, Ln3/a0$a;->u(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->r:I

    invoke-static {p1}, Ln3/a0$a;->v(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->s:I

    invoke-static {p1}, Ln3/a0$a;->w(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->t:I

    invoke-static {p1}, Ln3/a0$a;->x(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->u:I

    invoke-static {p1}, Ln3/a0$a;->y(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->v:I

    invoke-static {p1}, Ln3/a0$a;->z(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->w:I

    invoke-static {p1}, Ln3/a0$a;->c(Ln3/a0$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0;->x:Z

    invoke-static {p1}, Ln3/a0$a;->d(Ln3/a0$a;)Lb5/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0;->y:Lb5/q;

    invoke-static {p1}, Ln3/a0$a;->e(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->z:I

    invoke-static {p1}, Ln3/a0$a;->f(Ln3/a0$a;)Lb5/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0;->A:Lb5/q;

    invoke-static {p1}, Ln3/a0$a;->g(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->B:I

    invoke-static {p1}, Ln3/a0$a;->h(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->C:I

    invoke-static {p1}, Ln3/a0$a;->i(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->D:I

    invoke-static {p1}, Ln3/a0$a;->j(Ln3/a0$a;)Lb5/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0;->E:Lb5/q;

    invoke-static {p1}, Ln3/a0$a;->k(Ln3/a0$a;)Lb5/q;

    move-result-object v0

    iput-object v0, p0, Ln3/a0;->F:Lb5/q;

    invoke-static {p1}, Ln3/a0$a;->l(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->G:I

    invoke-static {p1}, Ln3/a0$a;->n(Ln3/a0$a;)I

    move-result v0

    iput v0, p0, Ln3/a0;->H:I

    invoke-static {p1}, Ln3/a0$a;->o(Ln3/a0$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0;->I:Z

    invoke-static {p1}, Ln3/a0$a;->p(Ln3/a0$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0;->J:Z

    invoke-static {p1}, Ln3/a0$a;->q(Ln3/a0$a;)Z

    move-result v0

    iput-boolean v0, p0, Ln3/a0;->K:Z

    invoke-static {p1}, Ln3/a0$a;->r(Ln3/a0$a;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lb5/r;->c(Ljava/util/Map;)Lb5/r;

    move-result-object v0

    iput-object v0, p0, Ln3/a0;->L:Lb5/r;

    invoke-static {p1}, Ln3/a0$a;->s(Ln3/a0$a;)Ljava/util/HashSet;

    move-result-object p1

    invoke-static {p1}, Lb5/s;->D(Ljava/util/Collection;)Lb5/s;

    move-result-object p1

    iput-object p1, p0, Ln3/a0;->M:Lb5/s;

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Ln3/a0;
    .locals 1

    new-instance v0, Ln3/a0$a;

    invoke-direct {v0, p0}, Ln3/a0$a;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Ln3/a0$a;->A()Ln3/a0;

    move-result-object p0

    return-object p0
.end method

.method protected static b(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ln3/a0;

    iget v2, p0, Ln3/a0;->n:I

    iget v3, p1, Ln3/a0;->n:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->o:I

    iget v3, p1, Ln3/a0;->o:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->p:I

    iget v3, p1, Ln3/a0;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->q:I

    iget v3, p1, Ln3/a0;->q:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->r:I

    iget v3, p1, Ln3/a0;->r:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->s:I

    iget v3, p1, Ln3/a0;->s:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->t:I

    iget v3, p1, Ln3/a0;->t:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->u:I

    iget v3, p1, Ln3/a0;->u:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/a0;->x:Z

    iget-boolean v3, p1, Ln3/a0;->x:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->v:I

    iget v3, p1, Ln3/a0;->v:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->w:I

    iget v3, p1, Ln3/a0;->w:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/a0;->y:Lb5/q;

    iget-object v3, p1, Ln3/a0;->y:Lb5/q;

    invoke-virtual {v2, v3}, Lb5/q;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ln3/a0;->z:I

    iget v3, p1, Ln3/a0;->z:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/a0;->A:Lb5/q;

    iget-object v3, p1, Ln3/a0;->A:Lb5/q;

    invoke-virtual {v2, v3}, Lb5/q;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ln3/a0;->B:I

    iget v3, p1, Ln3/a0;->B:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->C:I

    iget v3, p1, Ln3/a0;->C:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->D:I

    iget v3, p1, Ln3/a0;->D:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/a0;->E:Lb5/q;

    iget-object v3, p1, Ln3/a0;->E:Lb5/q;

    invoke-virtual {v2, v3}, Lb5/q;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln3/a0;->F:Lb5/q;

    iget-object v3, p1, Ln3/a0;->F:Lb5/q;

    invoke-virtual {v2, v3}, Lb5/q;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ln3/a0;->G:I

    iget v3, p1, Ln3/a0;->G:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ln3/a0;->H:I

    iget v3, p1, Ln3/a0;->H:I

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/a0;->I:Z

    iget-boolean v3, p1, Ln3/a0;->I:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/a0;->J:Z

    iget-boolean v3, p1, Ln3/a0;->J:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ln3/a0;->K:Z

    iget-boolean v3, p1, Ln3/a0;->K:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ln3/a0;->L:Lb5/r;

    iget-object v3, p1, Ln3/a0;->L:Lb5/r;

    invoke-virtual {v2, v3}, Lb5/r;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln3/a0;->M:Lb5/s;

    iget-object p1, p1, Ln3/a0;->M:Lb5/s;

    invoke-virtual {v2, p1}, Lb5/s;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ln3/a0;->n:I

    const/16 v1, 0x1f

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->o:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->p:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->q:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->r:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->s:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->t:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->u:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/a0;->x:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->v:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->w:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln3/a0;->y:Lb5/q;

    invoke-virtual {v2}, Lb5/q;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->z:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln3/a0;->A:Lb5/q;

    invoke-virtual {v2}, Lb5/q;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->B:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->C:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->D:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln3/a0;->E:Lb5/q;

    invoke-virtual {v2}, Lb5/q;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln3/a0;->F:Lb5/q;

    invoke-virtual {v2}, Lb5/q;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->G:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln3/a0;->H:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/a0;->I:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/a0;->J:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ln3/a0;->K:Z

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln3/a0;->L:Lb5/r;

    invoke-virtual {v2}, Lb5/r;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ln3/a0;->M:Lb5/s;

    invoke-virtual {v1}, Lb5/s;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
