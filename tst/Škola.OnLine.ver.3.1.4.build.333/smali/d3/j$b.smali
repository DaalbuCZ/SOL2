.class public Ld3/j$b;
.super Ld3/j;
.source ""

# interfaces
.implements Lc3/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final i:Ld3/k$a;


# direct methods
.method public constructor <init>(JLx1/n1;Ljava/util/List;Ld3/k$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lx1/n1;",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;",
            "Ld3/k$a;",
            "Ljava/util/List<",
            "Ld3/e;",
            ">;",
            "Ljava/util/List<",
            "Ld3/e;",
            ">;",
            "Ljava/util/List<",
            "Ld3/e;",
            ">;)V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ld3/j;-><init>(JLx1/n1;Ljava/util/List;Ld3/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ld3/j$a;)V

    move-object v1, p5

    iput-object v1, v0, Ld3/j$b;->i:Ld3/k$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Lc3/f;
    .locals 0

    return-object p0
.end method

.method public c()Ld3/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d(J)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2}, Ld3/k$a;->j(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(JJ)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld3/k$a;->i(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public f(JJ)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld3/k$a;->h(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(JJ)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld3/k$a;->d(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public h(JJ)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld3/k$a;->f(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public i(J)Ld3/i;
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p0, p1, p2}, Ld3/k$a;->k(Ld3/j;J)Ld3/i;

    move-result-object p1

    return-object p1
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0}, Ld3/k$a;->l()Z

    move-result v0

    return v0
.end method

.method public k()J
    .locals 2

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0}, Ld3/k$a;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public l(J)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2}, Ld3/k$a;->g(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public m(JJ)J
    .locals 1

    iget-object v0, p0, Ld3/j$b;->i:Ld3/k$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ld3/k$a;->c(JJ)J

    move-result-wide p1

    return-wide p1
.end method
