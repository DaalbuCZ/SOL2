.class public final Ls1/z1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/z1$b;
    }
.end annotation


# static fields
.field public static final T:Ls1/z1;

.field public static final U:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/z1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Ljava/lang/Integer;

.field public final B:Ljava/lang/Integer;

.field public final C:Ljava/lang/Boolean;

.field public final D:Ljava/lang/Integer;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final E:Ljava/lang/Integer;

.field public final F:Ljava/lang/Integer;

.field public final G:Ljava/lang/Integer;

.field public final H:Ljava/lang/Integer;

.field public final I:Ljava/lang/Integer;

.field public final J:Ljava/lang/Integer;

.field public final K:Ljava/lang/CharSequence;

.field public final L:Ljava/lang/CharSequence;

.field public final M:Ljava/lang/CharSequence;

.field public final N:Ljava/lang/Integer;

.field public final O:Ljava/lang/Integer;

.field public final P:Ljava/lang/CharSequence;

.field public final Q:Ljava/lang/CharSequence;

.field public final R:Ljava/lang/CharSequence;

.field public final S:Landroid/os/Bundle;

.field public final n:Ljava/lang/CharSequence;

.field public final o:Ljava/lang/CharSequence;

.field public final p:Ljava/lang/CharSequence;

.field public final q:Ljava/lang/CharSequence;

.field public final r:Ljava/lang/CharSequence;

.field public final s:Ljava/lang/CharSequence;

.field public final t:Ljava/lang/CharSequence;

.field public final u:Ls1/w2;

.field public final v:Ls1/w2;

.field public final w:[B

.field public final x:Ljava/lang/Integer;

.field public final y:Landroid/net/Uri;

.field public final z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/z1$b;

    invoke-direct {v0}, Ls1/z1$b;-><init>()V

    invoke-virtual {v0}, Ls1/z1$b;->F()Ls1/z1;

    move-result-object v0

    sput-object v0, Ls1/z1;->T:Ls1/z1;

    sget-object v0, Ls1/y1;->a:Ls1/y1;

    sput-object v0, Ls1/z1;->U:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ls1/z1$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls1/z1$b;->a(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->n:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->l(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->o:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->w(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->p:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->z(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->q:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->A(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->r:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->B(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->s:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->C(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->t:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->D(Ls1/z1$b;)Ls1/w2;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->u:Ls1/w2;

    invoke-static {p1}, Ls1/z1$b;->E(Ls1/z1$b;)Ls1/w2;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->v:Ls1/w2;

    invoke-static {p1}, Ls1/z1$b;->b(Ls1/z1$b;)[B

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->w:[B

    invoke-static {p1}, Ls1/z1$b;->c(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->x:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->d(Ls1/z1$b;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->y:Landroid/net/Uri;

    invoke-static {p1}, Ls1/z1$b;->e(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->z:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->f(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->A:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->g(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->B:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->h(Ls1/z1$b;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->C:Ljava/lang/Boolean;

    invoke-static {p1}, Ls1/z1$b;->i(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->D:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->i(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->E:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->j(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->F:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->k(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->G:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->m(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->H:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->n(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->I:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->o(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->J:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->p(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->K:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->q(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->L:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->r(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->M:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->s(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->N:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->t(Ls1/z1$b;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->O:Ljava/lang/Integer;

    invoke-static {p1}, Ls1/z1$b;->u(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->P:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->v(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->Q:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->x(Ls1/z1$b;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ls1/z1;->R:Ljava/lang/CharSequence;

    invoke-static {p1}, Ls1/z1$b;->y(Ls1/z1$b;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Ls1/z1;->S:Landroid/os/Bundle;

    return-void
.end method

.method synthetic constructor <init>(Ls1/z1$b;Ls1/z1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/z1;-><init>(Ls1/z1$b;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/z1;
    .locals 0

    invoke-static {p0}, Ls1/z1;->c(Landroid/os/Bundle;)Ls1/z1;

    move-result-object p0

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ls1/z1;
    .locals 5

    new-instance v0, Ls1/z1$b;

    invoke-direct {v0}, Ls1/z1$b;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->i0(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->M(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->L(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->K(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->U(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->h0(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->S(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v3, 0x1d

    invoke-static {v3}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v2, v3}, Ls1/z1$b;->N([BLjava/lang/Integer;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0xb

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    invoke-virtual {v1, v2}, Ls1/z1$b;->O(Landroid/net/Uri;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x16

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->n0(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x17

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->Q(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x18

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->R(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x1b

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->X(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x1c

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->P(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x1e

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->g0(Ljava/lang/CharSequence;)Ls1/z1$b;

    move-result-object v1

    const/16 v2, 0x3e8

    invoke-static {v2}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/z1$b;->V(Landroid/os/Bundle;)Ls1/z1$b;

    const/16 v1, 0x8

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Ls1/w2;->n:Ls1/h$a;

    invoke-interface {v2, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Ls1/w2;

    invoke-virtual {v0, v1}, Ls1/z1$b;->m0(Ls1/w2;)Ls1/z1$b;

    :cond_1
    const/16 v1, 0x9

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Ls1/w2;->n:Ls1/h$a;

    invoke-interface {v2, v1}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v1

    check-cast v1, Ls1/w2;

    invoke-virtual {v0, v1}, Ls1/z1$b;->Z(Ls1/w2;)Ls1/z1$b;

    :cond_2
    const/16 v1, 0xc

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->l0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_3
    const/16 v1, 0xd

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->k0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_4
    const/16 v1, 0xe

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->W(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_5
    const/16 v1, 0xf

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->Y(Ljava/lang/Boolean;)Ls1/z1$b;

    :cond_6
    const/16 v1, 0x10

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->c0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_7
    const/16 v1, 0x11

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->b0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_8
    const/16 v1, 0x12

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->a0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_9
    const/16 v1, 0x13

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->f0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_a
    const/16 v1, 0x14

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->e0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_b
    const/16 v1, 0x15

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->d0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_c
    const/16 v1, 0x19

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1$b;->T(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_d
    const/16 v1, 0x1a

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {v1}, Ls1/z1;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ls1/z1$b;->j0(Ljava/lang/Integer;)Ls1/z1$b;

    :cond_e
    invoke-virtual {v0}, Ls1/z1$b;->F()Ls1/z1;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls1/z1$b;
    .locals 2

    new-instance v0, Ls1/z1$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/z1$b;-><init>(Ls1/z1;Ls1/z1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/z1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ls1/z1;

    iget-object v2, p0, Ls1/z1;->n:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->n:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->o:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->o:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->p:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->p:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->q:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->q:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->r:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->r:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->s:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->s:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->t:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->t:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->u:Ls1/w2;

    iget-object v3, p1, Ls1/z1;->u:Ls1/w2;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->v:Ls1/w2;

    iget-object v3, p1, Ls1/z1;->v:Ls1/w2;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->w:[B

    iget-object v3, p1, Ls1/z1;->w:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->x:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->x:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->y:Landroid/net/Uri;

    iget-object v3, p1, Ls1/z1;->y:Landroid/net/Uri;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->z:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->z:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->A:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->A:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->B:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->B:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->C:Ljava/lang/Boolean;

    iget-object v3, p1, Ls1/z1;->C:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->E:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->E:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->F:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->F:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->G:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->G:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->H:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->H:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->I:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->I:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->J:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->J:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->K:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->K:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->L:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->L:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->M:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->M:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->N:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->N:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->O:Ljava/lang/Integer;

    iget-object v3, p1, Ls1/z1;->O:Ljava/lang/Integer;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->P:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->P:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->Q:Ljava/lang/CharSequence;

    iget-object v3, p1, Ls1/z1;->Q:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/z1;->R:Ljava/lang/CharSequence;

    iget-object p1, p1, Ls1/z1;->R:Ljava/lang/CharSequence;

    invoke-static {v2, p1}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    const/16 v0, 0x1e

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Ls1/z1;->n:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->o:Ljava/lang/CharSequence;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->p:Ljava/lang/CharSequence;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->q:Ljava/lang/CharSequence;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->r:Ljava/lang/CharSequence;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->s:Ljava/lang/CharSequence;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->t:Ljava/lang/CharSequence;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->u:Ls1/w2;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->v:Ls1/w2;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->w:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->x:Ljava/lang/Integer;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->y:Landroid/net/Uri;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->z:Ljava/lang/Integer;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->A:Ljava/lang/Integer;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->B:Ljava/lang/Integer;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->C:Ljava/lang/Boolean;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->E:Ljava/lang/Integer;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->F:Ljava/lang/Integer;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->G:Ljava/lang/Integer;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->H:Ljava/lang/Integer;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->I:Ljava/lang/Integer;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->J:Ljava/lang/Integer;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->K:Ljava/lang/CharSequence;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->L:Ljava/lang/CharSequence;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->M:Ljava/lang/CharSequence;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->N:Ljava/lang/Integer;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->O:Ljava/lang/Integer;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->P:Ljava/lang/CharSequence;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->Q:Ljava/lang/CharSequence;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/z1;->R:Ljava/lang/CharSequence;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    invoke-static {v0}, La5/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
