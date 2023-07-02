.class Ld9/p$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/c3$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld9/p;->m(Lx1/s;Ld9/o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Ld9/o;

.field final synthetic c:Ld9/p;


# direct methods
.method constructor <init>(Ld9/p;Ld9/o;)V
    .locals 0

    iput-object p1, p0, Ld9/p$b;->c:Ld9/p;

    iput-object p2, p0, Ld9/p$b;->b:Ld9/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld9/p$b;->a:Z

    return-void
.end method


# virtual methods
.method public synthetic A(I)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->p(Lx1/c3$d;I)V

    return-void
.end method

.method public synthetic B(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->r(Lx1/c3$d;ZI)V

    return-void
.end method

.method public C(Z)V
    .locals 2

    iget-boolean v0, p0, Ld9/p$b;->a:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Ld9/p$b;->a:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-boolean v0, p0, Ld9/p$b;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "bufferingStart"

    goto :goto_0

    :cond_0
    const-string v0, "bufferingEnd"

    :goto_0
    const-string v1, "event"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ld9/p$b;->b:Ld9/o;

    invoke-virtual {v0, p1}, Ld9/o;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public synthetic D(Z)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->j(Lx1/c3$d;Z)V

    return-void
.end method

.method public synthetic F(I)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->s(Lx1/c3$d;I)V

    return-void
.end method

.method public synthetic G(Lx1/d4;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->A(Lx1/c3$d;Lx1/d4;)V

    return-void
.end method

.method public synthetic H(Lx1/y3;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->z(Lx1/c3$d;Lx1/y3;I)V

    return-void
.end method

.method public synthetic J(Lx1/c3;Lx1/c3$c;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->g(Lx1/c3$d;Lx1/c3;Lx1/c3$c;)V

    return-void
.end method

.method public synthetic K(Lx1/v1;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->k(Lx1/c3$d;Lx1/v1;I)V

    return-void
.end method

.method public synthetic L(Z)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->h(Lx1/c3$d;Z)V

    return-void
.end method

.method public synthetic M()V
    .locals 0

    invoke-static {p0}, Lx1/e3;->u(Lx1/c3$d;)V

    return-void
.end method

.method public synthetic N()V
    .locals 0

    invoke-static {p0}, Lx1/e3;->w(Lx1/c3$d;)V

    return-void
.end method

.method public synthetic O(F)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->C(Lx1/c3$d;F)V

    return-void
.end method

.method public synthetic P(Lx1/y2;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->q(Lx1/c3$d;Lx1/y2;)V

    return-void
.end method

.method public S(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v0}, Ld9/p$b;->C(Z)V

    iget-object v0, p0, Ld9/p$b;->c:Ld9/p;

    invoke-virtual {v0}, Ld9/p;->h()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    iget-object v2, p0, Ld9/p$b;->c:Ld9/p;

    iget-boolean v3, v2, Ld9/p;->f:Z

    if-nez v3, :cond_2

    iput-boolean v0, v2, Ld9/p;->f:Z

    invoke-virtual {v2}, Ld9/p;->i()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "event"

    const-string v3, "completed"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Ld9/p$b;->b:Ld9/o;

    invoke-virtual {v2, v0}, Ld9/o;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-eq p1, v1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ld9/p$b;->C(Z)V

    :cond_3
    return-void
.end method

.method public synthetic T(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->n(Lx1/c3$d;ZI)V

    return-void
.end method

.method public synthetic V(Lz1/e;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->a(Lx1/c3$d;Lz1/e;)V

    return-void
.end method

.method public synthetic Y(Lx1/o;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->e(Lx1/c3$d;Lx1/o;)V

    return-void
.end method

.method public synthetic b(Z)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->x(Lx1/c3$d;Z)V

    return-void
.end method

.method public synthetic c0(Lx1/a2;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->l(Lx1/c3$d;Lx1/a2;)V

    return-void
.end method

.method public synthetic d(Lv3/z;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->B(Lx1/c3$d;Lv3/z;)V

    return-void
.end method

.method public f0(Lx1/y2;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ld9/p$b;->C(Z)V

    iget-object v0, p0, Ld9/p$b;->b:Ld9/o;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video player had error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "VideoError"

    invoke-virtual {v0, v2, p1, v1}, Ld9/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public synthetic g0(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->y(Lx1/c3$d;II)V

    return-void
.end method

.method public synthetic h(I)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->v(Lx1/c3$d;I)V

    return-void
.end method

.method public synthetic h0(Lx1/c3$b;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->b(Lx1/c3$d;Lx1/c3$b;)V

    return-void
.end method

.method public synthetic i0(Lx1/c3$e;Lx1/c3$e;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx1/e3;->t(Lx1/c3$d;Lx1/c3$e;Lx1/c3$e;I)V

    return-void
.end method

.method public synthetic j(Lx1/b3;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->o(Lx1/c3$d;Lx1/b3;)V

    return-void
.end method

.method public synthetic k(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->d(Lx1/c3$d;Ljava/util/List;)V

    return-void
.end method

.method public synthetic n(Lp2/a;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->m(Lx1/c3$d;Lp2/a;)V

    return-void
.end method

.method public synthetic o0(IZ)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/e3;->f(Lx1/c3$d;IZ)V

    return-void
.end method

.method public synthetic p0(Z)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->i(Lx1/c3$d;Z)V

    return-void
.end method

.method public synthetic q(Li3/e;)V
    .locals 0

    invoke-static {p0, p1}, Lx1/e3;->c(Lx1/c3$d;Li3/e;)V

    return-void
.end method
