.class public final Lz2/i0;
.super Lz2/a;
.source ""

# interfaces
.implements Lz2/h0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/i0$b;
    }
.end annotation


# instance fields
.field private final A:I

.field private B:Z

.field private C:J

.field private D:Z

.field private E:Z

.field private F:Lt3/p0;

.field private final u:Lx1/v1;

.field private final v:Lx1/v1$h;

.field private final w:Lt3/l$a;

.field private final x:Lz2/c0$a;

.field private final y:Lb2/y;

.field private final z:Lt3/g0;


# direct methods
.method private constructor <init>(Lx1/v1;Lt3/l$a;Lz2/c0$a;Lb2/y;Lt3/g0;I)V
    .locals 1

    invoke-direct {p0}, Lz2/a;-><init>()V

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/v1$h;

    iput-object v0, p0, Lz2/i0;->v:Lx1/v1$h;

    iput-object p1, p0, Lz2/i0;->u:Lx1/v1;

    iput-object p2, p0, Lz2/i0;->w:Lt3/l$a;

    iput-object p3, p0, Lz2/i0;->x:Lz2/c0$a;

    iput-object p4, p0, Lz2/i0;->y:Lb2/y;

    iput-object p5, p0, Lz2/i0;->z:Lt3/g0;

    iput p6, p0, Lz2/i0;->A:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz2/i0;->B:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lz2/i0;->C:J

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1;Lt3/l$a;Lz2/c0$a;Lb2/y;Lt3/g0;ILz2/i0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lz2/i0;-><init>(Lx1/v1;Lt3/l$a;Lz2/c0$a;Lb2/y;Lt3/g0;I)V

    return-void
.end method

.method private F()V
    .locals 9

    new-instance v8, Lz2/q0;

    iget-wide v1, p0, Lz2/i0;->C:J

    iget-boolean v3, p0, Lz2/i0;->D:Z

    iget-boolean v5, p0, Lz2/i0;->E:Z

    iget-object v7, p0, Lz2/i0;->u:Lx1/v1;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lz2/q0;-><init>(JZZZLjava/lang/Object;Lx1/v1;)V

    iget-boolean v0, p0, Lz2/i0;->B:Z

    if-eqz v0, :cond_0

    new-instance v0, Lz2/i0$a;

    invoke-direct {v0, p0, v8}, Lz2/i0$a;-><init>(Lz2/i0;Lx1/y3;)V

    move-object v8, v0

    :cond_0
    invoke-virtual {p0, v8}, Lz2/a;->D(Lx1/y3;)V

    return-void
.end method


# virtual methods
.method protected C(Lt3/p0;)V
    .locals 2

    iput-object p1, p0, Lz2/i0;->F:Lt3/p0;

    iget-object p1, p0, Lz2/i0;->y:Lb2/y;

    invoke-interface {p1}, Lb2/y;->c()V

    iget-object p1, p0, Lz2/i0;->y:Lb2/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lb2/y;->e(Landroid/os/Looper;Ly1/t1;)V

    invoke-direct {p0}, Lz2/i0;->F()V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lz2/i0;->y:Lb2/y;

    invoke-interface {v0}, Lb2/y;->a()V

    return-void
.end method

.method public a()Lx1/v1;
    .locals 1

    iget-object v0, p0, Lz2/i0;->u:Lx1/v1;

    return-object v0
.end method

.method public b(Lz2/r;)V
    .locals 0

    check-cast p1, Lz2/h0;

    invoke-virtual {p1}, Lz2/h0;->f0()V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public j(Lz2/u$b;Lt3/b;J)Lz2/r;
    .locals 14

    move-object v12, p0

    iget-object v0, v12, Lz2/i0;->w:Lt3/l$a;

    invoke-interface {v0}, Lt3/l$a;->a()Lt3/l;

    move-result-object v2

    iget-object v0, v12, Lz2/i0;->F:Lt3/p0;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Lt3/l;->c(Lt3/p0;)V

    :cond_0
    new-instance v13, Lz2/h0;

    iget-object v0, v12, Lz2/i0;->v:Lx1/v1$h;

    iget-object v1, v0, Lx1/v1$h;->a:Landroid/net/Uri;

    iget-object v0, v12, Lz2/i0;->x:Lz2/c0$a;

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v3

    invoke-interface {v0, v3}, Lz2/c0$a;->a(Ly1/t1;)Lz2/c0;

    move-result-object v3

    iget-object v4, v12, Lz2/i0;->y:Lb2/y;

    invoke-virtual {p0, p1}, Lz2/a;->t(Lz2/u$b;)Lb2/w$a;

    move-result-object v5

    iget-object v6, v12, Lz2/i0;->z:Lt3/g0;

    invoke-virtual {p0, p1}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object v7

    iget-object v0, v12, Lz2/i0;->v:Lx1/v1$h;

    iget-object v10, v0, Lx1/v1$h;->f:Ljava/lang/String;

    iget v11, v12, Lz2/i0;->A:I

    move-object v0, v13

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v11}, Lz2/h0;-><init>(Landroid/net/Uri;Lt3/l;Lz2/c0;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;Lz2/h0$b;Lt3/b;Ljava/lang/String;I)V

    return-object v13
.end method

.method public o(JZZ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lz2/i0;->C:J

    :cond_0
    iget-boolean v0, p0, Lz2/i0;->B:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lz2/i0;->C:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lz2/i0;->D:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lz2/i0;->E:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lz2/i0;->C:J

    iput-boolean p3, p0, Lz2/i0;->D:Z

    iput-boolean p4, p0, Lz2/i0;->E:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz2/i0;->B:Z

    invoke-direct {p0}, Lz2/i0;->F()V

    return-void
.end method
