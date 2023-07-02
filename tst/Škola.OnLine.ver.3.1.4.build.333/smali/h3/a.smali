.class public Lh3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh3/a$b;,
        Lh3/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly2/a<",
        "Lh3/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Lh3/a$a;

.field public final f:[Lh3/a$b;

.field public final g:J

.field public final h:J


# direct methods
.method private constructor <init>(IIJJIZLh3/a$a;[Lh3/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh3/a;->a:I

    iput p2, p0, Lh3/a;->b:I

    iput-wide p3, p0, Lh3/a;->g:J

    iput-wide p5, p0, Lh3/a;->h:J

    iput p7, p0, Lh3/a;->c:I

    iput-boolean p8, p0, Lh3/a;->d:Z

    iput-object p9, p0, Lh3/a;->e:Lh3/a$a;

    iput-object p10, p0, Lh3/a;->f:[Lh3/a$b;

    return-void
.end method

.method public constructor <init>(IIJJJIZLh3/a$a;[Lh3/a$b;)V
    .locals 21

    const-wide/16 v0, 0x0

    cmp-long v2, p5, v0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v2, :cond_0

    move-wide v13, v8

    goto :goto_0

    :cond_0
    const-wide/32 v4, 0xf4240

    move-wide/from16 v2, p5

    move-wide/from16 v6, p3

    invoke-static/range {v2 .. v7}, Lu3/n0;->N0(JJJ)J

    move-result-wide v2

    move-wide v13, v2

    :goto_0
    cmp-long v0, p7, v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-wide/32 v4, 0xf4240

    move-wide/from16 v2, p7

    move-wide/from16 v6, p3

    invoke-static/range {v2 .. v7}, Lu3/n0;->N0(JJJ)J

    move-result-wide v8

    :goto_1
    move-wide v15, v8

    move-object/from16 v10, p0

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v17, p9

    move/from16 v18, p10

    move-object/from16 v19, p11

    move-object/from16 v20, p12

    invoke-direct/range {v10 .. v20}, Lh3/a;-><init>(IIJJIZLh3/a$a;[Lh3/a$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lh3/a;->b(Ljava/util/List;)Lh3/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Lh3/a;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly2/c;",
            ">;)",
            "Lh3/a;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/c;

    iget-object v6, p0, Lh3/a;->f:[Lh3/a$b;

    iget v7, v5, Ly2/c;->o:I

    aget-object v6, v6, v7

    if-eq v6, v3, :cond_0

    if-eqz v3, :cond_0

    new-array v7, v2, [Lx1/n1;

    invoke-interface {v1, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lx1/n1;

    invoke-virtual {v3, v7}, Lh3/a$b;->b([Lx1/n1;)Lh3/a$b;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_0
    iget-object v3, v6, Lh3/a$b;->j:[Lx1/n1;

    iget v5, v5, Ly2/c;->p:I

    aget-object v3, v3, v5

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move-object v3, v6

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    new-array v0, v2, [Lx1/n1;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/n1;

    invoke-virtual {v3, v0}, Lh3/a$b;->b([Lx1/n1;)Lh3/a$b;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-array v0, v2, [Lh3/a$b;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, [Lh3/a$b;

    new-instance p1, Lh3/a;

    iget v1, p0, Lh3/a;->a:I

    iget v2, p0, Lh3/a;->b:I

    iget-wide v3, p0, Lh3/a;->g:J

    iget-wide v5, p0, Lh3/a;->h:J

    iget v7, p0, Lh3/a;->c:I

    iget-boolean v8, p0, Lh3/a;->d:Z

    iget-object v9, p0, Lh3/a;->e:Lh3/a$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v10}, Lh3/a;-><init>(IIJJIZLh3/a$a;[Lh3/a$b;)V

    return-object p1
.end method
