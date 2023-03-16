.class public final Ls1/m1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Lk2/a;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private n:Lw1/m;

.field private o:J

.field private p:I

.field private q:I

.field private r:F

.field private s:I

.field private t:F

.field private u:[B

.field private v:I

.field private w:Lq3/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ls1/m1$b;->f:I

    iput v0, p0, Ls1/m1$b;->g:I

    iput v0, p0, Ls1/m1$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Ls1/m1$b;->o:J

    iput v0, p0, Ls1/m1$b;->p:I

    iput v0, p0, Ls1/m1$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ls1/m1$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ls1/m1$b;->t:F

    iput v0, p0, Ls1/m1$b;->v:I

    iput v0, p0, Ls1/m1$b;->x:I

    iput v0, p0, Ls1/m1$b;->y:I

    iput v0, p0, Ls1/m1$b;->z:I

    iput v0, p0, Ls1/m1$b;->C:I

    const/4 v0, 0x0

    iput v0, p0, Ls1/m1$b;->D:I

    return-void
.end method

.method private constructor <init>(Ls1/m1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls1/m1;->n:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->a:Ljava/lang/String;

    iget-object v0, p1, Ls1/m1;->o:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->b:Ljava/lang/String;

    iget-object v0, p1, Ls1/m1;->p:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->c:Ljava/lang/String;

    iget v0, p1, Ls1/m1;->q:I

    iput v0, p0, Ls1/m1$b;->d:I

    iget v0, p1, Ls1/m1;->r:I

    iput v0, p0, Ls1/m1$b;->e:I

    iget v0, p1, Ls1/m1;->s:I

    iput v0, p0, Ls1/m1$b;->f:I

    iget v0, p1, Ls1/m1;->t:I

    iput v0, p0, Ls1/m1$b;->g:I

    iget-object v0, p1, Ls1/m1;->v:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->h:Ljava/lang/String;

    iget-object v0, p1, Ls1/m1;->w:Lk2/a;

    iput-object v0, p0, Ls1/m1$b;->i:Lk2/a;

    iget-object v0, p1, Ls1/m1;->x:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->j:Ljava/lang/String;

    iget-object v0, p1, Ls1/m1;->y:Ljava/lang/String;

    iput-object v0, p0, Ls1/m1$b;->k:Ljava/lang/String;

    iget v0, p1, Ls1/m1;->z:I

    iput v0, p0, Ls1/m1$b;->l:I

    iget-object v0, p1, Ls1/m1;->A:Ljava/util/List;

    iput-object v0, p0, Ls1/m1$b;->m:Ljava/util/List;

    iget-object v0, p1, Ls1/m1;->B:Lw1/m;

    iput-object v0, p0, Ls1/m1$b;->n:Lw1/m;

    iget-wide v0, p1, Ls1/m1;->C:J

    iput-wide v0, p0, Ls1/m1$b;->o:J

    iget v0, p1, Ls1/m1;->D:I

    iput v0, p0, Ls1/m1$b;->p:I

    iget v0, p1, Ls1/m1;->E:I

    iput v0, p0, Ls1/m1$b;->q:I

    iget v0, p1, Ls1/m1;->F:F

    iput v0, p0, Ls1/m1$b;->r:F

    iget v0, p1, Ls1/m1;->G:I

    iput v0, p0, Ls1/m1$b;->s:I

    iget v0, p1, Ls1/m1;->H:F

    iput v0, p0, Ls1/m1$b;->t:F

    iget-object v0, p1, Ls1/m1;->I:[B

    iput-object v0, p0, Ls1/m1$b;->u:[B

    iget v0, p1, Ls1/m1;->J:I

    iput v0, p0, Ls1/m1$b;->v:I

    iget-object v0, p1, Ls1/m1;->K:Lq3/c;

    iput-object v0, p0, Ls1/m1$b;->w:Lq3/c;

    iget v0, p1, Ls1/m1;->L:I

    iput v0, p0, Ls1/m1$b;->x:I

    iget v0, p1, Ls1/m1;->M:I

    iput v0, p0, Ls1/m1$b;->y:I

    iget v0, p1, Ls1/m1;->N:I

    iput v0, p0, Ls1/m1$b;->z:I

    iget v0, p1, Ls1/m1;->O:I

    iput v0, p0, Ls1/m1$b;->A:I

    iget v0, p1, Ls1/m1;->P:I

    iput v0, p0, Ls1/m1$b;->B:I

    iget v0, p1, Ls1/m1;->Q:I

    iput v0, p0, Ls1/m1$b;->C:I

    iget p1, p1, Ls1/m1;->R:I

    iput p1, p0, Ls1/m1$b;->D:I

    return-void
.end method

.method synthetic constructor <init>(Ls1/m1;Ls1/m1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/m1$b;-><init>(Ls1/m1;)V

    return-void
.end method

.method static synthetic A(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->f:I

    return p0
.end method

.method static synthetic B(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->g:I

    return p0
.end method

.method static synthetic C(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic D(Ls1/m1$b;)Lk2/a;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->i:Lk2/a;

    return-object p0
.end method

.method static synthetic a(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->l:I

    return p0
.end method

.method static synthetic e(Ls1/m1$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f(Ls1/m1$b;)Lw1/m;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->n:Lw1/m;

    return-object p0
.end method

.method static synthetic g(Ls1/m1$b;)J
    .locals 2

    iget-wide v0, p0, Ls1/m1$b;->o:J

    return-wide v0
.end method

.method static synthetic h(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->p:I

    return p0
.end method

.method static synthetic i(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->q:I

    return p0
.end method

.method static synthetic j(Ls1/m1$b;)F
    .locals 0

    iget p0, p0, Ls1/m1$b;->r:F

    return p0
.end method

.method static synthetic k(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->s:I

    return p0
.end method

.method static synthetic l(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Ls1/m1$b;)F
    .locals 0

    iget p0, p0, Ls1/m1$b;->t:F

    return p0
.end method

.method static synthetic n(Ls1/m1$b;)[B
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->u:[B

    return-object p0
.end method

.method static synthetic o(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->v:I

    return p0
.end method

.method static synthetic p(Ls1/m1$b;)Lq3/c;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->w:Lq3/c;

    return-object p0
.end method

.method static synthetic q(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->x:I

    return p0
.end method

.method static synthetic r(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->y:I

    return p0
.end method

.method static synthetic s(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->z:I

    return p0
.end method

.method static synthetic t(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->A:I

    return p0
.end method

.method static synthetic u(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->B:I

    return p0
.end method

.method static synthetic v(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->C:I

    return p0
.end method

.method static synthetic w(Ls1/m1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls1/m1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->D:I

    return p0
.end method

.method static synthetic y(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->d:I

    return p0
.end method

.method static synthetic z(Ls1/m1$b;)I
    .locals 0

    iget p0, p0, Ls1/m1$b;->e:I

    return p0
.end method


# virtual methods
.method public E()Ls1/m1;
    .locals 2

    new-instance v0, Ls1/m1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/m1;-><init>(Ls1/m1$b;Ls1/m1$a;)V

    return-object v0
.end method

.method public F(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->C:I

    return-object p0
.end method

.method public G(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->f:I

    return-object p0
.end method

.method public H(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->x:I

    return-object p0
.end method

.method public I(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public J(Lq3/c;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->w:Lq3/c;

    return-object p0
.end method

.method public K(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public L(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->D:I

    return-object p0
.end method

.method public M(Lw1/m;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->n:Lw1/m;

    return-object p0
.end method

.method public N(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->A:I

    return-object p0
.end method

.method public O(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->B:I

    return-object p0
.end method

.method public P(F)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->r:F

    return-object p0
.end method

.method public Q(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->q:I

    return-object p0
.end method

.method public R(I)Ls1/m1$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ls1/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public S(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public T(Ljava/util/List;)Ls1/m1$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Ls1/m1$b;"
        }
    .end annotation

    iput-object p1, p0, Ls1/m1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public W(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->l:I

    return-object p0
.end method

.method public X(Lk2/a;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->i:Lk2/a;

    return-object p0
.end method

.method public Y(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->z:I

    return-object p0
.end method

.method public Z(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->g:I

    return-object p0
.end method

.method public a0(F)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->t:F

    return-object p0
.end method

.method public b0([B)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->u:[B

    return-object p0
.end method

.method public c0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->e:I

    return-object p0
.end method

.method public d0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->s:I

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Ls1/m1$b;
    .locals 0

    iput-object p1, p0, Ls1/m1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public f0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->y:I

    return-object p0
.end method

.method public g0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->d:I

    return-object p0
.end method

.method public h0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->v:I

    return-object p0
.end method

.method public i0(J)Ls1/m1$b;
    .locals 0

    iput-wide p1, p0, Ls1/m1$b;->o:J

    return-object p0
.end method

.method public j0(I)Ls1/m1$b;
    .locals 0

    iput p1, p0, Ls1/m1$b;->p:I

    return-object p0
.end method
