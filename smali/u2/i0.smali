.class public final Lu2/i0;
.super Lu2/a;
.source ""

# interfaces
.implements Lu2/h0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/i0$b;
    }
.end annotation


# instance fields
.field private final A:I

.field private B:Z

.field private C:J

.field private D:Z

.field private E:Z

.field private F:Lo3/p0;

.field private final u:Ls1/u1;

.field private final v:Ls1/u1$h;

.field private final w:Lo3/l$a;

.field private final x:Lu2/c0$a;

.field private final y:Lw1/y;

.field private final z:Lo3/g0;


# direct methods
.method private constructor <init>(Ls1/u1;Lo3/l$a;Lu2/c0$a;Lw1/y;Lo3/g0;I)V
    .locals 1

    invoke-direct {p0}, Lu2/a;-><init>()V

    iget-object v0, p1, Ls1/u1;->o:Ls1/u1$h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/u1$h;

    iput-object v0, p0, Lu2/i0;->v:Ls1/u1$h;

    iput-object p1, p0, Lu2/i0;->u:Ls1/u1;

    iput-object p2, p0, Lu2/i0;->w:Lo3/l$a;

    iput-object p3, p0, Lu2/i0;->x:Lu2/c0$a;

    iput-object p4, p0, Lu2/i0;->y:Lw1/y;

    iput-object p5, p0, Lu2/i0;->z:Lo3/g0;

    iput p6, p0, Lu2/i0;->A:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/i0;->B:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu2/i0;->C:J

    return-void
.end method

.method synthetic constructor <init>(Ls1/u1;Lo3/l$a;Lu2/c0$a;Lw1/y;Lo3/g0;ILu2/i0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu2/i0;-><init>(Ls1/u1;Lo3/l$a;Lu2/c0$a;Lw1/y;Lo3/g0;I)V

    return-void
.end method

.method private F()V
    .locals 9

    new-instance v8, Lu2/q0;

    iget-wide v1, p0, Lu2/i0;->C:J

    iget-boolean v3, p0, Lu2/i0;->D:Z

    iget-boolean v5, p0, Lu2/i0;->E:Z

    iget-object v7, p0, Lu2/i0;->u:Ls1/u1;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lu2/q0;-><init>(JZZZLjava/lang/Object;Ls1/u1;)V

    iget-boolean v0, p0, Lu2/i0;->B:Z

    if-eqz v0, :cond_0

    new-instance v0, Lu2/i0$a;

    invoke-direct {v0, p0, v8}, Lu2/i0$a;-><init>(Lu2/i0;Ls1/l3;)V

    move-object v8, v0

    :cond_0
    invoke-virtual {p0, v8}, Lu2/a;->D(Ls1/l3;)V

    return-void
.end method


# virtual methods
.method protected C(Lo3/p0;)V
    .locals 2

    iput-object p1, p0, Lu2/i0;->F:Lo3/p0;

    iget-object p1, p0, Lu2/i0;->y:Lw1/y;

    invoke-interface {p1}, Lw1/y;->b()V

    iget-object p1, p0, Lu2/i0;->y:Lw1/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lu2/a;->A()Lt1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw1/y;->e(Landroid/os/Looper;Lt1/t1;)V

    invoke-direct {p0}, Lu2/i0;->F()V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lu2/i0;->y:Lw1/y;

    invoke-interface {v0}, Lw1/y;->a()V

    return-void
.end method

.method public a()Ls1/u1;
    .locals 1

    iget-object v0, p0, Lu2/i0;->u:Ls1/u1;

    return-object v0
.end method

.method public b(Lu2/r;)V
    .locals 0

    check-cast p1, Lu2/h0;

    invoke-virtual {p1}, Lu2/h0;->f0()V

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public n(Lu2/u$b;Lo3/b;J)Lu2/r;
    .locals 14

    move-object v12, p0

    iget-object v0, v12, Lu2/i0;->w:Lo3/l$a;

    invoke-interface {v0}, Lo3/l$a;->a()Lo3/l;

    move-result-object v2

    iget-object v0, v12, Lu2/i0;->F:Lo3/p0;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Lo3/l;->i(Lo3/p0;)V

    :cond_0
    new-instance v13, Lu2/h0;

    iget-object v0, v12, Lu2/i0;->v:Ls1/u1$h;

    iget-object v1, v0, Ls1/u1$h;->a:Landroid/net/Uri;

    iget-object v0, v12, Lu2/i0;->x:Lu2/c0$a;

    invoke-virtual {p0}, Lu2/a;->A()Lt1/t1;

    move-result-object v3

    invoke-interface {v0, v3}, Lu2/c0$a;->a(Lt1/t1;)Lu2/c0;

    move-result-object v3

    iget-object v4, v12, Lu2/i0;->y:Lw1/y;

    invoke-virtual {p0, p1}, Lu2/a;->t(Lu2/u$b;)Lw1/w$a;

    move-result-object v5

    iget-object v6, v12, Lu2/i0;->z:Lo3/g0;

    invoke-virtual {p0, p1}, Lu2/a;->w(Lu2/u$b;)Lu2/b0$a;

    move-result-object v7

    iget-object v0, v12, Lu2/i0;->v:Ls1/u1$h;

    iget-object v10, v0, Ls1/u1$h;->f:Ljava/lang/String;

    iget v11, v12, Lu2/i0;->A:I

    move-object v0, v13

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v11}, Lu2/h0;-><init>(Landroid/net/Uri;Lo3/l;Lu2/c0;Lw1/y;Lw1/w$a;Lo3/g0;Lu2/b0$a;Lu2/h0$b;Lo3/b;Ljava/lang/String;I)V

    return-object v13
.end method

.method public r(JZZ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lu2/i0;->C:J

    :cond_0
    iget-boolean v0, p0, Lu2/i0;->B:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lu2/i0;->C:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lu2/i0;->D:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lu2/i0;->E:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lu2/i0;->C:J

    iput-boolean p3, p0, Lu2/i0;->D:Z

    iput-boolean p4, p0, Lu2/i0;->E:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu2/i0;->B:Z

    invoke-direct {p0}, Lu2/i0;->F()V

    return-void
.end method
