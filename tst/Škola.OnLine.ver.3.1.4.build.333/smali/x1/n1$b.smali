.class public final Lx1/n1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/n1;
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

.field private E:I

.field private F:I

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Lp2/a;

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

.field private n:Lb2/m;

.field private o:J

.field private p:I

.field private q:I

.field private r:F

.field private s:I

.field private t:F

.field private u:[B

.field private v:I

.field private w:Lv3/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lx1/n1$b;->f:I

    iput v0, p0, Lx1/n1$b;->g:I

    iput v0, p0, Lx1/n1$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lx1/n1$b;->o:J

    iput v0, p0, Lx1/n1$b;->p:I

    iput v0, p0, Lx1/n1$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lx1/n1$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lx1/n1$b;->t:F

    iput v0, p0, Lx1/n1$b;->v:I

    iput v0, p0, Lx1/n1$b;->x:I

    iput v0, p0, Lx1/n1$b;->y:I

    iput v0, p0, Lx1/n1$b;->z:I

    iput v0, p0, Lx1/n1$b;->C:I

    iput v0, p0, Lx1/n1$b;->D:I

    iput v0, p0, Lx1/n1$b;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lx1/n1$b;->F:I

    return-void
.end method

.method private constructor <init>(Lx1/n1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lx1/n1;->n:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->a:Ljava/lang/String;

    iget-object v0, p1, Lx1/n1;->o:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->b:Ljava/lang/String;

    iget-object v0, p1, Lx1/n1;->p:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->c:Ljava/lang/String;

    iget v0, p1, Lx1/n1;->q:I

    iput v0, p0, Lx1/n1$b;->d:I

    iget v0, p1, Lx1/n1;->r:I

    iput v0, p0, Lx1/n1$b;->e:I

    iget v0, p1, Lx1/n1;->s:I

    iput v0, p0, Lx1/n1$b;->f:I

    iget v0, p1, Lx1/n1;->t:I

    iput v0, p0, Lx1/n1$b;->g:I

    iget-object v0, p1, Lx1/n1;->v:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->h:Ljava/lang/String;

    iget-object v0, p1, Lx1/n1;->w:Lp2/a;

    iput-object v0, p0, Lx1/n1$b;->i:Lp2/a;

    iget-object v0, p1, Lx1/n1;->x:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->j:Ljava/lang/String;

    iget-object v0, p1, Lx1/n1;->y:Ljava/lang/String;

    iput-object v0, p0, Lx1/n1$b;->k:Ljava/lang/String;

    iget v0, p1, Lx1/n1;->z:I

    iput v0, p0, Lx1/n1$b;->l:I

    iget-object v0, p1, Lx1/n1;->A:Ljava/util/List;

    iput-object v0, p0, Lx1/n1$b;->m:Ljava/util/List;

    iget-object v0, p1, Lx1/n1;->B:Lb2/m;

    iput-object v0, p0, Lx1/n1$b;->n:Lb2/m;

    iget-wide v0, p1, Lx1/n1;->C:J

    iput-wide v0, p0, Lx1/n1$b;->o:J

    iget v0, p1, Lx1/n1;->D:I

    iput v0, p0, Lx1/n1$b;->p:I

    iget v0, p1, Lx1/n1;->E:I

    iput v0, p0, Lx1/n1$b;->q:I

    iget v0, p1, Lx1/n1;->F:F

    iput v0, p0, Lx1/n1$b;->r:F

    iget v0, p1, Lx1/n1;->G:I

    iput v0, p0, Lx1/n1$b;->s:I

    iget v0, p1, Lx1/n1;->H:F

    iput v0, p0, Lx1/n1$b;->t:F

    iget-object v0, p1, Lx1/n1;->I:[B

    iput-object v0, p0, Lx1/n1$b;->u:[B

    iget v0, p1, Lx1/n1;->J:I

    iput v0, p0, Lx1/n1$b;->v:I

    iget-object v0, p1, Lx1/n1;->K:Lv3/c;

    iput-object v0, p0, Lx1/n1$b;->w:Lv3/c;

    iget v0, p1, Lx1/n1;->L:I

    iput v0, p0, Lx1/n1$b;->x:I

    iget v0, p1, Lx1/n1;->M:I

    iput v0, p0, Lx1/n1$b;->y:I

    iget v0, p1, Lx1/n1;->N:I

    iput v0, p0, Lx1/n1$b;->z:I

    iget v0, p1, Lx1/n1;->O:I

    iput v0, p0, Lx1/n1$b;->A:I

    iget v0, p1, Lx1/n1;->P:I

    iput v0, p0, Lx1/n1$b;->B:I

    iget v0, p1, Lx1/n1;->Q:I

    iput v0, p0, Lx1/n1$b;->C:I

    iget v0, p1, Lx1/n1;->R:I

    iput v0, p0, Lx1/n1$b;->D:I

    iget v0, p1, Lx1/n1;->S:I

    iput v0, p0, Lx1/n1$b;->E:I

    iget p1, p1, Lx1/n1;->T:I

    iput p1, p0, Lx1/n1$b;->F:I

    return-void
.end method

.method synthetic constructor <init>(Lx1/n1;Lx1/n1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/n1$b;-><init>(Lx1/n1;)V

    return-void
.end method

.method static synthetic A(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->d:I

    return p0
.end method

.method static synthetic B(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->e:I

    return p0
.end method

.method static synthetic C(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->f:I

    return p0
.end method

.method static synthetic D(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->g:I

    return p0
.end method

.method static synthetic E(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic F(Lx1/n1$b;)Lp2/a;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->i:Lp2/a;

    return-object p0
.end method

.method static synthetic a(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->l:I

    return p0
.end method

.method static synthetic e(Lx1/n1$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f(Lx1/n1$b;)Lb2/m;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->n:Lb2/m;

    return-object p0
.end method

.method static synthetic g(Lx1/n1$b;)J
    .locals 2

    iget-wide v0, p0, Lx1/n1$b;->o:J

    return-wide v0
.end method

.method static synthetic h(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->p:I

    return p0
.end method

.method static synthetic i(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->q:I

    return p0
.end method

.method static synthetic j(Lx1/n1$b;)F
    .locals 0

    iget p0, p0, Lx1/n1$b;->r:F

    return p0
.end method

.method static synthetic k(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->s:I

    return p0
.end method

.method static synthetic l(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Lx1/n1$b;)F
    .locals 0

    iget p0, p0, Lx1/n1$b;->t:F

    return p0
.end method

.method static synthetic n(Lx1/n1$b;)[B
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->u:[B

    return-object p0
.end method

.method static synthetic o(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->v:I

    return p0
.end method

.method static synthetic p(Lx1/n1$b;)Lv3/c;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->w:Lv3/c;

    return-object p0
.end method

.method static synthetic q(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->x:I

    return p0
.end method

.method static synthetic r(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->y:I

    return p0
.end method

.method static synthetic s(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->z:I

    return p0
.end method

.method static synthetic t(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->A:I

    return p0
.end method

.method static synthetic u(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->B:I

    return p0
.end method

.method static synthetic v(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->C:I

    return p0
.end method

.method static synthetic w(Lx1/n1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lx1/n1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->D:I

    return p0
.end method

.method static synthetic y(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->E:I

    return p0
.end method

.method static synthetic z(Lx1/n1$b;)I
    .locals 0

    iget p0, p0, Lx1/n1$b;->F:I

    return p0
.end method


# virtual methods
.method public G()Lx1/n1;
    .locals 2

    new-instance v0, Lx1/n1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx1/n1;-><init>(Lx1/n1$b;Lx1/n1$a;)V

    return-object v0
.end method

.method public H(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->C:I

    return-object p0
.end method

.method public I(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->f:I

    return-object p0
.end method

.method public J(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->x:I

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public L(Lv3/c;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->w:Lv3/c;

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public N(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->F:I

    return-object p0
.end method

.method public O(Lb2/m;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->n:Lb2/m;

    return-object p0
.end method

.method public P(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->A:I

    return-object p0
.end method

.method public Q(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->B:I

    return-object p0
.end method

.method public R(F)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->r:F

    return-object p0
.end method

.method public S(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->q:I

    return-object p0
.end method

.method public T(I)Lx1/n1$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lx1/n1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/util/List;)Lx1/n1$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Lx1/n1$b;"
        }
    .end annotation

    iput-object p1, p0, Lx1/n1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public W(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public X(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public Y(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->l:I

    return-object p0
.end method

.method public Z(Lp2/a;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->i:Lp2/a;

    return-object p0
.end method

.method public a0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->z:I

    return-object p0
.end method

.method public b0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->g:I

    return-object p0
.end method

.method public c0(F)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->t:F

    return-object p0
.end method

.method public d0([B)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->u:[B

    return-object p0
.end method

.method public e0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->e:I

    return-object p0
.end method

.method public f0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->s:I

    return-object p0
.end method

.method public g0(Ljava/lang/String;)Lx1/n1$b;
    .locals 0

    iput-object p1, p0, Lx1/n1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public h0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->y:I

    return-object p0
.end method

.method public i0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->d:I

    return-object p0
.end method

.method public j0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->v:I

    return-object p0
.end method

.method public k0(J)Lx1/n1$b;
    .locals 0

    iput-wide p1, p0, Lx1/n1$b;->o:J

    return-object p0
.end method

.method public l0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->D:I

    return-object p0
.end method

.method public m0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->E:I

    return-object p0
.end method

.method public n0(I)Lx1/n1$b;
    .locals 0

    iput p1, p0, Lx1/n1$b;->p:I

    return-object p0
.end method
