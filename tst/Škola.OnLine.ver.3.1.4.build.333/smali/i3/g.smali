.class public abstract Li3/g;
.super La2/j;
.source ""

# interfaces
.implements Li3/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La2/j<",
        "Li3/l;",
        "Li3/m;",
        "Li3/j;",
        ">;",
        "Li3/i;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Li3/l;

    new-array v0, v0, [Li3/m;

    invoke-direct {p0, v1, v0}, La2/j;-><init>([La2/g;[La2/h;)V

    iput-object p1, p0, Li3/g;->n:Ljava/lang/String;

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, La2/j;->v(I)V

    return-void
.end method

.method static synthetic w(Li3/g;La2/h;)V
    .locals 0

    invoke-virtual {p0, p1}, La2/j;->s(La2/h;)V

    return-void
.end method


# virtual methods
.method protected abstract A([BIZ)Li3/h;
.end method

.method protected final B(Li3/l;Li3/m;Z)Li3/j;
    .locals 8

    :try_start_0
    iget-object v0, p1, La2/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Li3/g;->A([BIZ)Li3/h;

    move-result-object v5

    iget-wide v3, p1, La2/g;->r:J

    iget-wide v6, p1, Li3/l;->v:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Li3/m;->y(JLi3/h;J)V

    const/high16 p1, -0x80000000

    invoke-virtual {p2, p1}, La2/a;->p(I)V
    :try_end_0
    .catch Li3/j; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic h()La2/g;
    .locals 1

    invoke-virtual {p0}, Li3/g;->x()Li3/l;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic i()La2/h;
    .locals 1

    invoke-virtual {p0}, Li3/g;->y()Li3/m;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic j(Ljava/lang/Throwable;)La2/f;
    .locals 0

    invoke-virtual {p0, p1}, Li3/g;->z(Ljava/lang/Throwable;)Li3/j;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic k(La2/g;La2/h;Z)La2/f;
    .locals 0

    check-cast p1, Li3/l;

    check-cast p2, Li3/m;

    invoke-virtual {p0, p1, p2, p3}, Li3/g;->B(Li3/l;Li3/m;Z)Li3/j;

    move-result-object p1

    return-object p1
.end method

.method protected final x()Li3/l;
    .locals 1

    new-instance v0, Li3/l;

    invoke-direct {v0}, Li3/l;-><init>()V

    return-object v0
.end method

.method protected final y()Li3/m;
    .locals 1

    new-instance v0, Li3/g$a;

    invoke-direct {v0, p0}, Li3/g$a;-><init>(Li3/g;)V

    return-object v0
.end method

.method protected final z(Ljava/lang/Throwable;)Li3/j;
    .locals 2

    new-instance v0, Li3/j;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Li3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method
