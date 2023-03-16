.class public final Ls1/m1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/m1$b;
    }
.end annotation


# static fields
.field private static final T:Ls1/m1;

.field public static final U:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/m1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final B:Lw1/m;

.field public final C:J

.field public final D:I

.field public final E:I

.field public final F:F

.field public final G:I

.field public final H:F

.field public final I:[B

.field public final J:I

.field public final K:Lq3/c;

.field public final L:I

.field public final M:I

.field public final N:I

.field public final O:I

.field public final P:I

.field public final Q:I

.field public final R:I

.field private S:I

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:Ljava/lang/String;

.field public final w:Lk2/a;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/m1$b;

    invoke-direct {v0}, Ls1/m1$b;-><init>()V

    invoke-virtual {v0}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object v0

    sput-object v0, Ls1/m1;->T:Ls1/m1;

    sget-object v0, Ls1/l1;->a:Ls1/l1;

    sput-object v0, Ls1/m1;->U:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ls1/m1$b;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls1/m1$b;->a(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->n:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->l(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->o:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->w(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp3/m0;->C0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->p:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->y(Ls1/m1$b;)I

    move-result v0

    iput v0, p0, Ls1/m1;->q:I

    invoke-static {p1}, Ls1/m1$b;->z(Ls1/m1$b;)I

    move-result v0

    iput v0, p0, Ls1/m1;->r:I

    invoke-static {p1}, Ls1/m1$b;->A(Ls1/m1$b;)I

    move-result v0

    iput v0, p0, Ls1/m1;->s:I

    invoke-static {p1}, Ls1/m1$b;->B(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->t:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    :cond_0
    iput v0, p0, Ls1/m1;->u:I

    invoke-static {p1}, Ls1/m1$b;->C(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->D(Ls1/m1$b;)Lk2/a;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->w:Lk2/a;

    invoke-static {p1}, Ls1/m1$b;->b(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->x:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->c(Ls1/m1$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {p1}, Ls1/m1$b;->d(Ls1/m1$b;)I

    move-result v0

    iput v0, p0, Ls1/m1;->z:I

    invoke-static {p1}, Ls1/m1$b;->e(Ls1/m1$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ls1/m1$b;->e(Ls1/m1$b;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ls1/m1;->A:Ljava/util/List;

    invoke-static {p1}, Ls1/m1$b;->f(Ls1/m1$b;)Lw1/m;

    move-result-object v0

    iput-object v0, p0, Ls1/m1;->B:Lw1/m;

    invoke-static {p1}, Ls1/m1$b;->g(Ls1/m1$b;)J

    move-result-wide v3

    iput-wide v3, p0, Ls1/m1;->C:J

    invoke-static {p1}, Ls1/m1$b;->h(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->D:I

    invoke-static {p1}, Ls1/m1$b;->i(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->E:I

    invoke-static {p1}, Ls1/m1$b;->j(Ls1/m1$b;)F

    move-result v1

    iput v1, p0, Ls1/m1;->F:F

    invoke-static {p1}, Ls1/m1$b;->k(Ls1/m1$b;)I

    move-result v1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ls1/m1$b;->k(Ls1/m1$b;)I

    move-result v1

    :goto_1
    iput v1, p0, Ls1/m1;->G:I

    invoke-static {p1}, Ls1/m1$b;->m(Ls1/m1$b;)F

    move-result v1

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v1, v1, v4

    if-nez v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    invoke-static {p1}, Ls1/m1$b;->m(Ls1/m1$b;)F

    move-result v1

    :goto_2
    iput v1, p0, Ls1/m1;->H:F

    invoke-static {p1}, Ls1/m1$b;->n(Ls1/m1$b;)[B

    move-result-object v1

    iput-object v1, p0, Ls1/m1;->I:[B

    invoke-static {p1}, Ls1/m1$b;->o(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->J:I

    invoke-static {p1}, Ls1/m1$b;->p(Ls1/m1$b;)Lq3/c;

    move-result-object v1

    iput-object v1, p0, Ls1/m1;->K:Lq3/c;

    invoke-static {p1}, Ls1/m1$b;->q(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->L:I

    invoke-static {p1}, Ls1/m1$b;->r(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->M:I

    invoke-static {p1}, Ls1/m1$b;->s(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->N:I

    invoke-static {p1}, Ls1/m1$b;->t(Ls1/m1$b;)I

    move-result v1

    if-ne v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    invoke-static {p1}, Ls1/m1$b;->t(Ls1/m1$b;)I

    move-result v1

    :goto_3
    iput v1, p0, Ls1/m1;->O:I

    invoke-static {p1}, Ls1/m1$b;->u(Ls1/m1$b;)I

    move-result v1

    if-ne v1, v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {p1}, Ls1/m1$b;->u(Ls1/m1$b;)I

    move-result v3

    :goto_4
    iput v3, p0, Ls1/m1;->P:I

    invoke-static {p1}, Ls1/m1$b;->v(Ls1/m1$b;)I

    move-result v1

    iput v1, p0, Ls1/m1;->Q:I

    invoke-static {p1}, Ls1/m1$b;->x(Ls1/m1$b;)I

    move-result v1

    if-nez v1, :cond_6

    if-eqz v0, :cond_6

    const/4 p1, 0x1

    goto :goto_5

    :cond_6
    invoke-static {p1}, Ls1/m1$b;->x(Ls1/m1$b;)I

    move-result p1

    :goto_5
    iput p1, p0, Ls1/m1;->R:I

    return-void
.end method

.method synthetic constructor <init>(Ls1/m1$b;Ls1/m1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/m1;-><init>(Ls1/m1$b;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/m1;
    .locals 0

    invoke-static {p0}, Ls1/m1;->e(Landroid/os/Bundle;)Ls1/m1;

    move-result-object p0

    return-object p0
.end method

.method private static d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method private static e(Landroid/os/Bundle;)Ls1/m1;
    .locals 6

    new-instance v0, Ls1/m1$b;

    invoke-direct {v0}, Ls1/m1$b;-><init>()V

    invoke-static {p0}, Lp3/c;->a(Landroid/os/Bundle;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ls1/m1;->T:Ls1/m1;

    iget-object v4, v3, Ls1/m1;->n:Ljava/lang/String;

    invoke-static {v2, v4}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ls1/m1$b;->S(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x1

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ls1/m1;->o:Ljava/lang/String;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/m1$b;->U(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x2

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ls1/m1;->p:Ljava/lang/String;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/m1$b;->V(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x3

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Ls1/m1;->q:I

    invoke-virtual {p0, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Ls1/m1$b;->g0(I)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Ls1/m1;->r:I

    invoke-virtual {p0, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Ls1/m1$b;->c0(I)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x5

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Ls1/m1;->s:I

    invoke-virtual {p0, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Ls1/m1$b;->G(I)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x6

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Ls1/m1;->t:I

    invoke-virtual {p0, v4, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Ls1/m1$b;->Z(I)Ls1/m1$b;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/m1$b;->I(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/16 v4, 0x8

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lk2/a;

    iget-object v5, v3, Ls1/m1;->w:Lk2/a;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk2/a;

    invoke-virtual {v2, v4}, Ls1/m1$b;->X(Lk2/a;)Ls1/m1$b;

    move-result-object v2

    const/16 v4, 0x9

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ls1/m1;->x:Ljava/lang/String;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/m1$b;->K(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/16 v4, 0xa

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v3, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v4, v5}, Ls1/m1;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ls1/m1$b;->e0(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v2

    const/16 v4, 0xb

    invoke-static {v4}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v4

    iget v3, v3, Ls1/m1;->z:I

    invoke-virtual {p0, v4, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ls1/m1$b;->W(I)Ls1/m1$b;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-static {v1}, Ls1/m1;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {v0, v2}, Ls1/m1$b;->T(Ljava/util/List;)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0xd

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lw1/m;

    invoke-virtual {v1, v2}, Ls1/m1$b;->M(Lw1/m;)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ls1/m1;->T:Ls1/m1;

    iget-wide v4, v3, Ls1/m1;->C:J

    invoke-virtual {p0, v2, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ls1/m1$b;->i0(J)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0xf

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->D:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->j0(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->E:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->Q(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x11

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->F:F

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->P(F)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x12

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->G:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->d0(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x13

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->H:F

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->a0(F)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x14

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->b0([B)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x15

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->J:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->h0(I)Ls1/m1$b;

    const/16 v1, 0x16

    invoke-static {v1}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lq3/c;->s:Ls1/h$a;

    invoke-interface {v2, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Lq3/c;

    invoke-virtual {v0, v1}, Ls1/m1$b;->J(Lq3/c;)Ls1/m1$b;

    :cond_0
    const/16 v1, 0x17

    invoke-static {v1}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v1

    iget v2, v3, Ls1/m1;->L:I

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Ls1/m1$b;->H(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x18

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->M:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->f0(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x19

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->N:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->Y(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x1a

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->O:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->N(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->P:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->O(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x1c

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v4, v3, Ls1/m1;->Q:I

    invoke-virtual {p0, v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ls1/m1$b;->F(I)Ls1/m1$b;

    move-result-object v1

    const/16 v2, 0x1d

    invoke-static {v2}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v2

    iget v3, v3, Ls1/m1;->R:I

    invoke-virtual {p0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    invoke-virtual {v1, p0}, Ls1/m1$b;->L(I)Ls1/m1$b;

    invoke-virtual {v0}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0
.end method

.method private static h(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static i(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xc

    invoke-static {v1}, Ls1/m1;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x24

    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls1/m1$b;
    .locals 2

    new-instance v0, Ls1/m1$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/m1$b;-><init>(Ls1/m1;Ls1/m1$a;)V

    return-object v0
.end method

.method public c(I)Ls1/m1;
    .locals 1

    invoke-virtual {p0}, Ls1/m1;->b()Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls1/m1$b;->L(I)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Ls1/m1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ls1/m1;

    iget v2, p0, Ls1/m1;->S:I

    if-eqz v2, :cond_2

    iget v3, p1, Ls1/m1;->S:I

    if-eqz v3, :cond_2

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Ls1/m1;->q:I

    iget v3, p1, Ls1/m1;->q:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->r:I

    iget v3, p1, Ls1/m1;->r:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->s:I

    iget v3, p1, Ls1/m1;->s:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->t:I

    iget v3, p1, Ls1/m1;->t:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->z:I

    iget v3, p1, Ls1/m1;->z:I

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Ls1/m1;->C:J

    iget-wide v4, p1, Ls1/m1;->C:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    iget v2, p0, Ls1/m1;->D:I

    iget v3, p1, Ls1/m1;->D:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->E:I

    iget v3, p1, Ls1/m1;->E:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->G:I

    iget v3, p1, Ls1/m1;->G:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->J:I

    iget v3, p1, Ls1/m1;->J:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->L:I

    iget v3, p1, Ls1/m1;->L:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->M:I

    iget v3, p1, Ls1/m1;->M:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->N:I

    iget v3, p1, Ls1/m1;->N:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->O:I

    iget v3, p1, Ls1/m1;->O:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->P:I

    iget v3, p1, Ls1/m1;->P:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->Q:I

    iget v3, p1, Ls1/m1;->Q:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->R:I

    iget v3, p1, Ls1/m1;->R:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ls1/m1;->F:F

    iget v3, p1, Ls1/m1;->F:F

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget v2, p0, Ls1/m1;->H:F

    iget v3, p1, Ls1/m1;->H:F

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Ls1/m1;->n:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->n:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->o:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->o:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->v:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->x:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->y:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->p:Ljava/lang/String;

    iget-object v3, p1, Ls1/m1;->p:Ljava/lang/String;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->I:[B

    iget-object v3, p1, Ls1/m1;->I:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->w:Lk2/a;

    iget-object v3, p1, Ls1/m1;->w:Lk2/a;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->K:Lq3/c;

    iget-object v3, p1, Ls1/m1;->K:Lq3/c;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls1/m1;->B:Lw1/m;

    iget-object v3, p1, Ls1/m1;->B:Lw1/m;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, p1}, Ls1/m1;->g(Ls1/m1;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public f()I
    .locals 3

    iget v0, p0, Ls1/m1;->D:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v2, p0, Ls1/m1;->E:I

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    mul-int v1, v0, v2

    :cond_1
    :goto_0
    return v1
.end method

.method public g(Ls1/m1;)Z
    .locals 4

    iget-object v0, p0, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p1, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    iget-object v1, p0, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    iget-object v3, p1, Ls1/m1;->A:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ls1/m1;->S:I

    if-nez v0, :cond_7

    const/16 v0, 0x20f

    iget-object v1, p0, Ls1/m1;->n:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->o:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->p:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->q:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->r:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->s:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->t:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->v:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->w:Lk2/a;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lk2/a;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->x:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls1/m1;->y:Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->z:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ls1/m1;->C:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->D:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->E:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->F:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->G:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->H:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->J:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->L:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->M:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->N:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->O:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->P:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->Q:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls1/m1;->R:I

    add-int/2addr v0, v1

    iput v0, p0, Ls1/m1;->S:I

    :cond_7
    iget v0, p0, Ls1/m1;->S:I

    return v0
.end method

.method public j(Ls1/m1;)Ls1/m1;
    .locals 11

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v0}, Lp3/v;->k(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p1, Ls1/m1;->n:Ljava/lang/String;

    iget-object v2, p1, Ls1/m1;->o:Ljava/lang/String;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ls1/m1;->o:Ljava/lang/String;

    :goto_0
    iget-object v3, p0, Ls1/m1;->p:Ljava/lang/String;

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v0, v4, :cond_2

    if-ne v0, v5, :cond_3

    :cond_2
    iget-object v4, p1, Ls1/m1;->p:Ljava/lang/String;

    if-eqz v4, :cond_3

    move-object v3, v4

    :cond_3
    iget v4, p0, Ls1/m1;->s:I

    const/4 v6, -0x1

    if-ne v4, v6, :cond_4

    iget v4, p1, Ls1/m1;->s:I

    :cond_4
    iget v7, p0, Ls1/m1;->t:I

    if-ne v7, v6, :cond_5

    iget v7, p1, Ls1/m1;->t:I

    :cond_5
    iget-object v6, p0, Ls1/m1;->v:Ljava/lang/String;

    if-nez v6, :cond_6

    iget-object v8, p1, Ls1/m1;->v:Ljava/lang/String;

    invoke-static {v8, v0}, Lp3/m0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lp3/m0;->R0(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    array-length v9, v9

    if-ne v9, v5, :cond_6

    move-object v6, v8

    :cond_6
    iget-object v5, p0, Ls1/m1;->w:Lk2/a;

    if-nez v5, :cond_7

    iget-object v5, p1, Ls1/m1;->w:Lk2/a;

    goto :goto_1

    :cond_7
    iget-object v8, p1, Ls1/m1;->w:Lk2/a;

    invoke-virtual {v5, v8}, Lk2/a;->b(Lk2/a;)Lk2/a;

    move-result-object v5

    :goto_1
    iget v8, p0, Ls1/m1;->F:F

    const/high16 v9, -0x40800000    # -1.0f

    cmpl-float v9, v8, v9

    if-nez v9, :cond_8

    const/4 v9, 0x2

    if-ne v0, v9, :cond_8

    iget v8, p1, Ls1/m1;->F:F

    :cond_8
    iget v0, p0, Ls1/m1;->q:I

    iget v9, p1, Ls1/m1;->q:I

    or-int/2addr v0, v9

    iget v9, p0, Ls1/m1;->r:I

    iget v10, p1, Ls1/m1;->r:I

    or-int/2addr v9, v10

    iget-object p1, p1, Ls1/m1;->B:Lw1/m;

    iget-object v10, p0, Ls1/m1;->B:Lw1/m;

    invoke-static {p1, v10}, Lw1/m;->d(Lw1/m;Lw1/m;)Lw1/m;

    move-result-object p1

    invoke-virtual {p0}, Ls1/m1;->b()Ls1/m1$b;

    move-result-object v10

    invoke-virtual {v10, v1}, Ls1/m1$b;->S(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ls1/m1$b;->U(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Ls1/m1$b;->V(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls1/m1$b;->g0(I)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, v9}, Ls1/m1$b;->c0(I)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Ls1/m1$b;->G(I)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, v7}, Ls1/m1$b;->Z(I)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Ls1/m1$b;->I(Ljava/lang/String;)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Ls1/m1$b;->X(Lk2/a;)Ls1/m1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls1/m1$b;->M(Lw1/m;)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1, v8}, Ls1/m1$b;->P(F)Ls1/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Format("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls1/m1;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ls1/m1;->o:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ls1/m1;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ls1/m1;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ls1/m1;->v:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ls1/m1;->u:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ls1/m1;->p:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ls1/m1;->D:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ls1/m1;->E:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ls1/m1;->F:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "], ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ls1/m1;->L:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls1/m1;->M:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "])"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
