.class final Ls1/w0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq3/x;
.implements Lu1/s;
.implements Ld3/n;
.implements Lk2/f;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lr3/f$a;
.implements Ls1/d$b;
.implements Ls1/b$b;
.implements Ls1/g3$b;
.implements Ls1/r$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic n:Ls1/w0;


# direct methods
.method private constructor <init>(Ls1/w0;)V
    .locals 0

    iput-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls1/w0;Ls1/w0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0$c;-><init>(Ls1/w0;)V

    return-void
.end method

.method public static synthetic G(Lk2/a;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->R(Lk2/a;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic H(Lq3/z;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->V(Lq3/z;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic I(IZLs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/w0$c;->U(IZLs1/p2$d;)V

    return-void
.end method

.method public static synthetic J(Ld3/e;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->P(Ld3/e;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic K(Ljava/util/List;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->O(Ljava/util/List;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic L(Ls1/w0$c;Ls1/p2$d;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0$c;->Q(Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic M(Ls1/o;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->T(Ls1/o;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic N(ZLs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0$c;->S(ZLs1/p2$d;)V

    return-void
.end method

.method private static synthetic O(Ljava/util/List;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->j(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic P(Ld3/e;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->d(Ld3/e;)V

    return-void
.end method

.method private synthetic Q(Ls1/p2$d;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->s0(Ls1/w0;)Ls1/z1;

    move-result-object v0

    invoke-interface {p1, v0}, Ls1/p2$d;->R(Ls1/z1;)V

    return-void
.end method

.method private static synthetic R(Lk2/a;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->x(Lk2/a;)V

    return-void
.end method

.method private static synthetic S(ZLs1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->b(Z)V

    return-void
.end method

.method private static synthetic T(Ls1/o;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->l0(Ls1/o;)V

    return-void
.end method

.method private static synthetic U(IZLs1/p2$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls1/p2$d;->o0(IZ)V

    return-void
.end method

.method private static synthetic V(Lq3/z;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->o(Lq3/z;)V

    return-void
.end method


# virtual methods
.method public A(IZ)V
    .locals 2

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    new-instance v1, Ls1/x0;

    invoke-direct {v1, p1, p2}, Ls1/x0;-><init>(IZ)V

    const/16 p1, 0x1e

    invoke-virtual {v0, p1, v1}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public B(I)V
    .locals 3

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->B0(Ls1/w0;)Ls1/g3;

    move-result-object p1

    invoke-static {p1}, Ls1/w0;->C0(Ls1/g3;)Ls1/o;

    move-result-object p1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->D0(Ls1/w0;)Ls1/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls1/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->E0(Ls1/w0;Ls1/o;)Ls1/o;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    const/16 v1, 0x1d

    new-instance v2, Ls1/c1;

    invoke-direct {v2, p1}, Ls1/c1;-><init>(Ls1/o;)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->k(ILp3/q$a;)V

    :cond_0
    return-void
.end method

.method public synthetic C(Ls1/m1;)V
    .locals 0

    invoke-static {p0, p1}, Lq3/m;->a(Lq3/x;Ls1/m1;)V

    return-void
.end method

.method public D()V
    .locals 4

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Ls1/w0;->A0(Ls1/w0;ZII)V

    return-void
.end method

.method public E(Z)V
    .locals 0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->F0(Ls1/w0;)V

    return-void
.end method

.method public F(F)V
    .locals 0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->y0(Ls1/w0;)V

    return-void
.end method

.method public a(I)V
    .locals 3

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-virtual {v0}, Ls1/w0;->p()Z

    move-result v0

    iget-object v1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->z0(ZI)I

    move-result v2

    invoke-static {v1, v0, p1, v2}, Ls1/w0;->A0(Ls1/w0;ZII)V

    return-void
.end method

.method public b(Z)V
    .locals 3

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->m0(Ls1/w0;)Z

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->n0(Ls1/w0;Z)Z

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    const/16 v1, 0x17

    new-instance v2, Ls1/e1;

    invoke-direct {v2, p1}, Ls1/e1;-><init>(Z)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public d(Ld3/e;)V
    .locals 2

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->o0(Ls1/w0;Ld3/e;)Ld3/e;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    new-instance v1, Ls1/y0;

    invoke-direct {v1, p1}, Ls1/y0;-><init>(Ld3/e;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->e(Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt1/a;->f(Ljava/lang/Object;J)V

    iget-object p2, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p2}, Ls1/w0;->L0(Ls1/w0;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object p1

    const/16 p2, 0x1a

    sget-object p3, Ls1/f1;->a:Ls1/f1;

    invoke-virtual {p1, p2, p3}, Lp3/q;->k(ILp3/q$a;)V

    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt1/a;->g(Ljava/lang/String;JJ)V

    return-void
.end method

.method public h(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/w0;->v0(Ls1/w0;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Lv1/e;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->M0(Ls1/w0;Lv1/e;)Lv1/e;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->i(Lv1/e;)V

    return-void
.end method

.method public j(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    new-instance v1, Ls1/z0;

    invoke-direct {v1, p1}, Ls1/z0;-><init>(Ljava/util/List;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public k(J)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt1/a;->k(J)V

    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public m(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->m(Ljava/lang/Exception;)V

    return-void
.end method

.method public n(Lv1/e;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->n(Lv1/e;)V

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/w0;->l0(Ls1/w0;Ls1/m1;)Ls1/m1;

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1, v0}, Ls1/w0;->M0(Ls1/w0;Lv1/e;)Lv1/e;

    return-void
.end method

.method public o(Lq3/z;)V
    .locals 2

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->J0(Ls1/w0;Lq3/z;)Lq3/z;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    new-instance v1, Ls1/b1;

    invoke-direct {v1, p1}, Ls1/b1;-><init>(Lq3/z;)V

    const/16 p1, 0x19

    invoke-virtual {v0, p1, v1}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->x0(Ls1/w0;Landroid/graphics/SurfaceTexture;)V

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1, p2, p3}, Ls1/w0;->w0(Ls1/w0;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/w0;->v0(Ls1/w0;Ljava/lang/Object;)V

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Ls1/w0;->w0(Ls1/w0;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1, p2, p3}, Ls1/w0;->w0(Ls1/w0;II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public synthetic p(Ls1/m1;)V
    .locals 0

    invoke-static {p0, p1}, Lu1/h;->a(Lu1/s;Ls1/m1;)V

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->q(Ljava/lang/String;)V

    return-void
.end method

.method public r(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt1/a;->r(Ljava/lang/String;JJ)V

    return-void
.end method

.method public s(Ls1/m1;Lv1/i;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->l0(Ls1/w0;Ls1/m1;)Ls1/m1;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt1/a;->s(Ls1/m1;Lv1/i;)V

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1, p3, p4}, Ls1/w0;->w0(Ls1/w0;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->u0(Ls1/w0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-static {v0, p1}, Ls1/w0;->v0(Ls1/w0;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->u0(Ls1/w0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/w0;->v0(Ls1/w0;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Ls1/w0;->w0(Ls1/w0;II)V

    return-void
.end method

.method public t(Lv1/e;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->t(Lv1/e;)V

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls1/w0;->I0(Ls1/w0;Ls1/m1;)Ls1/m1;

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1, v0}, Ls1/w0;->G0(Ls1/w0;Lv1/e;)Lv1/e;

    return-void
.end method

.method public u(IJJ)V
    .locals 7

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt1/a;->u(IJJ)V

    return-void
.end method

.method public v(IJ)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt1/a;->v(IJ)V

    return-void
.end method

.method public w(Ls1/m1;Lv1/i;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->I0(Ls1/w0;Ls1/m1;)Ls1/m1;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt1/a;->w(Ls1/m1;Lv1/i;)V

    return-void
.end method

.method public x(Lk2/a;)V
    .locals 3

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->p0(Ls1/w0;)Ls1/z1;

    move-result-object v1

    invoke-virtual {v1}, Ls1/z1;->b()Ls1/z1$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls1/z1$b;->J(Lk2/a;)Ls1/z1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls1/z1$b;->F()Ls1/z1;

    move-result-object v1

    invoke-static {v0, v1}, Ls1/w0;->q0(Ls1/w0;Ls1/z1;)Ls1/z1;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->r0(Ls1/w0;)Ls1/z1;

    move-result-object v0

    iget-object v1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v1}, Ls1/w0;->s0(Ls1/w0;)Ls1/z1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/z1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v1, v0}, Ls1/w0;->t0(Ls1/w0;Ls1/z1;)Ls1/z1;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    const/16 v1, 0xe

    new-instance v2, Ls1/d1;

    invoke-direct {v2, p0}, Ls1/d1;-><init>(Ls1/w0$c;)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->i(ILp3/q$a;)V

    :cond_0
    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object v0

    const/16 v1, 0x1c

    new-instance v2, Ls1/a1;

    invoke-direct {v2, p1}, Ls1/a1;-><init>(Lk2/a;)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->i(ILp3/q$a;)V

    iget-object p1, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {p1}, Ls1/w0;->K0(Ls1/w0;)Lp3/q;

    move-result-object p1

    invoke-virtual {p1}, Lp3/q;->f()V

    return-void
.end method

.method public y(JI)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt1/a;->y(JI)V

    return-void
.end method

.method public z(Lv1/e;)V
    .locals 1

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0, p1}, Ls1/w0;->G0(Ls1/w0;Lv1/e;)Lv1/e;

    iget-object v0, p0, Ls1/w0$c;->n:Ls1/w0;

    invoke-static {v0}, Ls1/w0;->H0(Ls1/w0;)Lt1/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt1/a;->z(Lv1/e;)V

    return-void
.end method
